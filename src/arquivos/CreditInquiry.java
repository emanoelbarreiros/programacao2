package arquivos;

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditInquiry {
	private final static Menu[] escolhas = Menu.values();

	public static void main(String[] args) {
		Menu accountType = getRequest();

		while (accountType != Menu.FIM) {
			switch (accountType) {
			case SALDO_ZERO:
				System.out.printf("%nContas com saldo zero:%n");
				break;
			case SALDO_POSITIVO:
				System.out.printf("%nContas com saldo positivo:%n");
				break;
			case SALDO_NEGATIVO:
				System.out.printf("%nContas com saldo negativo:%n");
				break;
			}

			readRecords(accountType);
			accountType = getRequest();
		}
	}

	private static Menu getRequest() {
		int request = 4;

		System.out.printf("%nEntre pedido:%n%s%n%s%n%s%n%s%n", " 1 - Listar contas com saldo zero",
				" 2 - Listar constas com saldo positivo", " 3 - Listar contas com saldo negativo",
				" 4 - Encerrar programa");

		try {
			Scanner input = new Scanner(System.in);

			do {
				System.out.printf("%n? ");
				request = input.nextInt();
			} while ((request < 1) || (request > 4));
		} catch (NoSuchElementException noSuchElementException) {
			System.err.println("Entrada inválida. Encerrando.");
		}

		return escolhas[request - 1];
	}

	private static void readRecords(Menu tipoConta) {
		try (Scanner input = new Scanner(Paths.get("src/arquivos/clients.txt"))) {
			while (input.hasNext()) {
				int conta = input.nextInt();
				String primeiroNome = input.next();
				String ultimoNome = input.next();
				double saldo = input.nextDouble();

				if (shouldDisplay(tipoConta, saldo))
					System.out.printf("%-10d%-12s%-12s%10.2f%n", conta, primeiroNome, ultimoNome, saldo);
				else
					input.nextLine();
			}
		} catch (NoSuchElementException | IllegalStateException | IOException e) {
			System.err.println("Error processing file. Terminating.");
			System.exit(1);
		}
	}

	private static boolean shouldDisplay(Menu tipoConta, double saldo) {
		if ((tipoConta == Menu.SALDO_POSITIVO) && (saldo > 0))
			return true;
		else if ((tipoConta == Menu.SALDO_NEGATIVO) && (saldo < 0))
			return true;
		else if ((tipoConta == Menu.SALDO_ZERO) && (saldo == 0))
			return true;

		return false;
	}
} 
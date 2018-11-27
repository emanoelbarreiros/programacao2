package arquivos;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
	private static Formatter output;

	public static void main(String[] args) {
		openFile();
		addRecords();
		closeFile();
	}

	public static void openFile() {
		try {
			output = new Formatter("src/arquivos/clients2.txt");
		} catch (SecurityException securityException) {
			System.err.println("Sem permissão de escrita. Encerrando.");
			System.exit(1);
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Erro ao abrir o arquivo. Encerrando.");
			System.exit(1);
		}
	}

	public static void addRecords() {
		Scanner input = new Scanner(System.in);
		System.out.printf("%s%n%s%n? ", "Informe o número da conta, primeiro nome, último nome e saldo.",
				"Insira o indicador de fim de arquivo.");

		while (input.hasNext()) {
			try {
				output.format("%d %s %s %.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
			} catch (FormatterClosedException formatterClosedException) {
				System.err.println("Erro ao escrever no arquivo. Encerrando.");
				break;
			} catch (NoSuchElementException elementException) {
				System.err.println("Entrada inválida. Tente novamente.");
				input.nextLine();
			}

			System.out.print("? ");
		}
		
		input.close();
	}

	public static void closeFile() {
		if (output != null) {
			output.close();
		}
	}
}
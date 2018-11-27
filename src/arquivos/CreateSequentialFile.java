package arquivos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateSequentialFile {
	
	private static ObjectOutputStream output;

	public static void main(String[] args) {
		openFile();
		addRecords();
		closeFile();
	}

	public static void openFile() {
		try {
			output = new ObjectOutputStream(Files.newOutputStream(Paths.get("src/arquivos/clients.ser")));
		} catch (IOException ioException) {
			System.err.println("Erro ao abrir arquivo. Encerrando.");
			System.exit(1);
		}
	}

	public static void addRecords() {
		Scanner input = new Scanner(System.in);

		System.out.printf("%s%n%s%n? ", "Informe o número da conta, primeiro nome, último nome e saldo.",
				"Insira o fim de arquivo par encerrar o programa.");

		while (input.hasNext()) {
			try {
				Account record = new Account(input.nextInt(), input.next(), input.next(), input.nextDouble());

				output.writeObject(record);
			} catch (NoSuchElementException elementException) {
				System.err.println("Entrada inválida. Tente novamente.");
				input.nextLine(); 
			} catch (IOException ioException) {
				System.err.println("Erro escrevendo arquivo. Encerrando.");
				break;
			}

			System.out.print("? ");
		}
	}

	public static void closeFile() {
		try {
			if (output != null) {
				output.flush();
				output.close();
			}
		} catch (IOException ioException) {
			System.err.println("Erro ao fechar arquivo. Encerrando.");
		}
	}
} 
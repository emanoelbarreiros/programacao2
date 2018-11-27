package arquivos;

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
	private static Scanner input;

	public static void main(String[] args) {
		openFile();
		readRecords();
		closeFile();
	}

	public static void openFile() {
		try {
			input = new Scanner(Paths.get("src/arquivos/clients.txt"));
		} catch (IOException ioException) {
			System.err.println("Erro abrindo o arquivo. Encerrando.");
			System.exit(1);
		}
	}

	public static void readRecords() {
		System.out.printf("%-10s%-12s%-12s%10s%n", "Conta", "Primeiro nome", "Último nome", "Saldo");

		try {
			while (input.hasNext()) {
				System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(), input.next(), input.next(),
						input.nextDouble());
			}
		} catch (NoSuchElementException elementException) {
			System.err.println("Arquivo em formato errado. Encerrando.");
		} catch (IllegalStateException stateException) {
			System.err.println("Erro lendo arquivo. Encerrando.");
		}
	}

	public static void closeFile() {
		if (input != null) {
			input.close();
		}
	}
}
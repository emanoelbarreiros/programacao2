package arquivos;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadSequentialFile {
	private static ObjectInputStream input;

	public static void main(String[] args) {
		openFile();
		readRecords();
		closeFile();
	}

	public static void openFile() {
		try {
			input = new ObjectInputStream(Files.newInputStream(Paths.get("src/arquivos/clients.ser")));
		} catch (IOException ioException) {
			System.err.println("Erro ao abrir arquivo.");
			System.exit(1);
		}
	}

	public static void readRecords() {
		System.out.printf("%-10s%-12s%-12s%10s%n", "Conta", "Primeiro nome", "Último nome", "Saldo");

		try {
			while (true) {
				Account record = (Account) input.readObject();

				System.out.printf("%-10d%-12s%-12s%10.2f%n", record.getAccount(), record.getFirstName(),
						record.getLastName(), record.getBalance());
			}
		} catch (EOFException endOfFileException) {
			System.out.printf("%nNão há mais registros.%n");
		} catch (ClassNotFoundException classNotFoundException) {
			System.err.println("Tipo inválido de objeto. Encerrando.");
		} catch (IOException ioException) {
			System.err.println("Erro lendo arquivo. Encerrando.");
		}
	}

	public static void closeFile() {
		try {
			if (input != null) {
				input.close();
			}
		} catch (IOException ioException) {
			System.err.println("Erro ao fechar arquivi. Encerrando.");
			System.exit(1);
		}
	}
}
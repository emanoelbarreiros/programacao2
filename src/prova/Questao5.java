package prova;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Questao5 {
	
	private static Formatter saida;
	
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(Paths.get("src/prova/alunos.txt"));
			saida = new Formatter("src/prova/aprovados.txt");
			
			while (input.hasNext()) {
				double nota = input.nextDouble();
				String nome = input.next();

				if (nota >= 7)
					saida.format("%.2f %s%n", nota, nome);
				else
					input.nextLine();
			}
			
			saida.close();
		} catch (NoSuchElementException | IllegalStateException | IOException e) {
			System.out.println("Não foi possível processar o arquivo.");
		}
	}

}

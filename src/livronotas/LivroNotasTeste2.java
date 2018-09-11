package livronotas;

import java.util.Scanner;

public class LivroNotasTeste2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nomeCurso;
		String nomeInstrutor;
		
		System.out.print("Informe o nome do curso: ");
		nomeCurso = scan.nextLine();
		
		System.out.print("Informe o nome do insrutor: ");
		nomeInstrutor = scan.nextLine();

		LivroNotas livro1 = new LivroNotas(nomeCurso, nomeInstrutor);
		livro1.exibirMensagem();
	}

}

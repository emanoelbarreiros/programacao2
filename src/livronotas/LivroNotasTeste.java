package livronotas;

import java.util.Scanner;

public class LivroNotasTeste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o nome do curso: ");
		String nomeCurso = scan.nextLine();
		
		LivroNotas livro1 = new LivroNotas(nomeCurso);
		livro1.exibirBoasVindas();
		
		System.out.println();
		
		LivroNotas livro2 = new LivroNotas("Engenharia de Software", true);
		livro2.exibirBoasVindas();
	}

}

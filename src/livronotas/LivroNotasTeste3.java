package livronotas;

import java.util.Scanner;

public class LivroNotasTeste3 {

	public static void main(String[] args) {
		LivroNotas livro = new LivroNotas("Programação 2", "Emanoel");
		Scanner scan = new Scanner(System.in);
		
		int contador = 0;
		double notaInformada = 0;
		int quantidadeNotasInformar = 0;
		
		System.out.println("Quantas notas você deseja informar?");
		quantidadeNotasInformar = scan.nextInt();
		while(contador < quantidadeNotasInformar) {
			System.out.printf("Informe a nota %s: ", contador+1);
			
			notaInformada = scan.nextDouble();
			if(notaInformada <= 10 && notaInformada >= 0) {
				livro.adicionarNota(notaInformada);
				contador = contador + 1;
			} else {
				System.out.println("Nota informada é inválida. Tente novamente.");
			}
		}
		
		double media = livro.determinarMediaTurma();
		System.out.printf("A média da turma é %.2f.\n", media);
		
		int notasAbaixoMedia = livro.getQuantidadeNotasAbaixoMedia();
		System.out.println("Quantidade de notas abaixo da média: " + notasAbaixoMedia);
	}

}

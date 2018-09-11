package cap2;

import java.util.Scanner;

public class Exercicio2_32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int qtdPositivos = 0;
		int qtdNegativos = 0;
		int qtdZeros = 0;
		int numero = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("Informe o número %d: ", i + 1 );
			numero = scan.nextInt();
			if (numero == 0) {
				qtdZeros++;
			} else if (numero > 0) {
				qtdPositivos++;
			} else {
				qtdNegativos++;
			}
		}
		
		System.out.printf("Zeros: %d, Positivos: %d, Negativos: %d", qtdZeros, qtdPositivos, qtdNegativos);
	}

}

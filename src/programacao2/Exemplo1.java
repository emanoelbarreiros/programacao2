package programacao2;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double valor1;
		double valor2;
		double soma;

		//String texto;

		System.out.print("Informe o primeiro valor: ");
		valor1 = scan.nextDouble();
		//texto = scan.nextLine();

		System.out.print("Informe o segundo valor: ");
		valor2 = scan.nextDouble();

		soma = valor1 + valor2;
		
		if (soma % 2 == 0) {
			System.out.println("A soma é par: " + soma);
		} else {
			System.out.println("A soma é ímpar: " + soma);
		}

	}
	
}
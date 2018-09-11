package cap2;

import java.util.Scanner;

public class Exercicio2_33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double peso = 0;
		double altura = 0;
		double imc = 0;
		
		System.out.print("Informe o peso em kg: ");
		peso = scan.nextDouble();
		
		System.out.print("Informe a altura em metros: ");
		altura = scan.nextDouble();
		
		imc = peso / (altura*altura);
		
		System.out.printf("Seu IMC é %f\n", imc);
		
		System.out.println("Valores do IMC");
		System.out.println("Subpeso: menos de 18.5");
		System.out.println("Normal: entre 18.5 e 24.9");
		System.out.println("Sobrepeso: entre 25 e 29.9");
		System.out.println("Obeso: 30 ou maior");
		
		if (imc < 18.5) {
			System.out.println("Você está com subpeso. Seu IMC foi calculado como " + imc);
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Você está com peso normal. Seu IMC foi calculado como " + imc);
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Você está com sobrepeso. Seu IMC foi calculado como " + imc);
		} else {
			System.out.println("Você está obeso. Seu IMC foi calculado como " + imc);
		}
	}

}

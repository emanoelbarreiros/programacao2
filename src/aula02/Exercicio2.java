package aula02;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int operador = 0;
		double operando1 = 0;
		double operando2 = 0;
		double resultado = 0;
		
		System.out.println("Olá, bem vindo à melhor calculadora do mundo!");
		System.out.println("Informe qual operação você deseja realizar (escolha o número):");
		System.out.println("1 - Divisão");
		System.out.println("2 - Multiplicação");
		System.out.println("3 - Subtração");
		System.out.println("4 - Soma");
		System.out.print("Informe o código da operação que reseja realizar: ");
		
		operador = scan.nextInt();
		
		System.out.println("Operação escolhida: " + operador);
		
		System.out.print("Informe o primeiro operando: ");
		operando1 = scan.nextDouble();
		
		System.out.print("Informe o segundo operando: ");
		operando2 = scan.nextDouble();
		
		if (operador == 1) {
			System.out.println("Realizando a divisão...");
			resultado = operando1 / operando2;
		}
		
		if (operador == 2) {
			System.out.println("Realizando a multiplicação...");
			resultado = operando1 * operando2;
		}
		
		if (operador == 3) {
			System.out.println("Realizando a subtração...");
			resultado = operando1 - operando2;
		}
		
		if (operador == 4) {
			System.out.println("Realizando a soma...");
			resultado = operando1 + operando2;
		}
		
		System.out.println();
		System.out.println("Resultado: " + resultado);
	}

}

package aula08;

import java.util.Scanner;

public class Questao3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qtdNumeros = 0;
		int[] numeros;
		
		System.out.println("Quantos numeros deseja informar? ");
		qtdNumeros = scan.nextInt();
		numeros = new int[qtdNumeros];
		
		for (int i = 0; i < qtdNumeros; i++) {
			System.out.printf("Informe o número %d: ", i+1);
			numeros[i] = scan.nextInt();
		}
		
		for (int valor : numeros) {
			System.out.println(valor + " " + iguais(valor));
		}
	}
	
	public static String iguais(int n) {
		String retorno = "";
		for (int i = 0; i < n; i++) {
			retorno += "=";
		}
		
		return retorno;
	}

}

package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Informe o primeiro valor: ");
			int a = scan.nextInt();
			
			System.out.print("Informe o segundo valor: ");
			int b = scan.nextInt();
			
			Calculadora c = new Calculadora();
			
			int valor = c.dividir(a, b);
			
			System.out.println(valor);
		} catch(CalculadoraException e) {
			System.out.println("você não estudou matemática? não dá pra dividir por zero...");
		} catch(InputMismatchException e) {
			System.out.println("informe apenas valores inteiros");
		} finally {
			System.out.println("executou o finally");
		}
	}

}

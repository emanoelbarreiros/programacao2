package cap2;

import java.util.Scanner;

public class Exercicio2_30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		int digito1 = 0;
		int digito2 = 0;
		int digito3 = 0;
		int digito4 = 0;
		int digito5 = 0;
		int quociente = 0;
		
		System.out.print("Digite um número com 5 dígitos: ");
		numero = scan.nextInt();
		
		digito5 = numero % 10;
		quociente = numero / 10;
		
		digito4 = quociente % 10;
		quociente = quociente / 10;
		
		digito3 = quociente % 10;
		quociente = quociente / 10;
		
		digito2 = quociente % 10;
		quociente = quociente / 10;
		
		digito1 = quociente % 10;
		
		System.out.printf("%d   %d   %d   %d   %d", digito1, digito2, digito3, digito4, digito5);
		
	}

}

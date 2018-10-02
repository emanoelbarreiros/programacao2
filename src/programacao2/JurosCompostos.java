package programacao2;

import java.util.Scanner;

public class JurosCompostos {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double capital;
		int tempo;
		double taxa;
		double montanteFinal;
		
		System.out.print("Informe o capital: ");
		capital = scan.nextDouble();
		
		System.out.print("Informe o tempo que ficará investido: ");
		tempo = scan.nextInt();
		
		System.out.print("Informe a taxa: ");
		taxa = scan.nextDouble() / 100;
		
		montanteFinal = capital;
		for (int mesesDecorridos = 0; mesesDecorridos < tempo; mesesDecorridos++) {
			//montanteFinal = montanteFinal + montanteFinal*taxa;
			//montanteFinal += montanteFinal*taxa;
			montanteFinal *= 1 + taxa;
		}
		
		System.out.printf("Valor final após o investimento: R$ %.2f\n", montanteFinal);
	}

	
	
	
	
	
	
	
	
	
	
	
}

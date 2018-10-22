package prova1ee;

import java.util.Random;

public class Questao1 {
	
	public int[] simular() {
		Random rand = new Random();
		int dado1;
		int dado2;
		int soma;
		int[] contagem = new int[11];
		
		for (int i = 0; i < 50000; i++) {
			dado1 = rand.nextInt(6) + 1;
			dado2 = rand.nextInt(6) + 1;
			soma = dado1 + dado2;
			contagem[soma-2] = contagem[soma-2] + 1; 
		}
		
		return contagem;
		
	}

}

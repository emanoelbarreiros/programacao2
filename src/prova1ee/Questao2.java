package prova1ee;

public class Questao2 {
	
	public int[] unir(int[] vetor1, int[] vetor2) {
		int[] resultado = new int[vetor1.length + vetor2.length];
		
		for (int i = 0; i < vetor1.length; i++) {
			resultado[i] = vetor1[i];
		}
		
		for (int i = 0; i < vetor2.length; i++) {
			resultado[i + vetor1.length] = vetor2[i];
		}
		
		return resultado;
	}

}

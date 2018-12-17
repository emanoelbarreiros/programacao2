package prova;

public class Matriz {
	
	public static int[][] transposta(int[][] entrada) {
		int[][] saida = new int[entrada[0].length][entrada.length];
		
		for (int i = 0; i < saida.length; i++) {
			for (int j = 0; j < saida[i].length; j++) {
				saida[i][j] = entrada[j][i];
			}
		}
		
		return saida;
	}

}

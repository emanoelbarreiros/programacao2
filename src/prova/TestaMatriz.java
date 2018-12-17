package prova;

import java.util.Arrays;

public class TestaMatriz {
	
	public static void main(String[] args) {
		int[][] teste = {{1,1,1,1,1,1},
						 {2,3,2,3,2,3},
						 {5,5,5,5,5,5} };
		
		int[][] resultado = Matriz.transposta(teste);
		
		for (int[] linha : resultado) {
			System.out.println(Arrays.toString(linha));
		}
	}

}

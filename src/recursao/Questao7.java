package recursao;

import java.util.Arrays;

public class Questao7 {
	
	public static void main(String[] args) {
		int[] vetor = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		inverte(vetor, 0);
		System.out.println(Arrays.toString(vetor));
	}
	
	public static void inverte(int[] valores, int indice) {
		if (indice < valores.length - 1 - indice) {
			int temp = valores[indice];
			valores[indice] = valores[valores.length - 1 - indice];
			valores[valores.length - 1 - indice] = temp;
			inverte(valores, indice + 1);
		} 
	}
	
	
	
	
	
	
	
	
	

}

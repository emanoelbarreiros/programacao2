package prova1ee;

public class TesteQuestao2 {
	
	public static void main(String[] args) {
		Questao2 q2 = new Questao2();
		
		int[] v1 = {1, 2, 3};
		int[] v2 = {4, 5, 6};
		
		int[] resultado = q2.unir(v1, v2);
		
		for(int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);
		}
	}

}

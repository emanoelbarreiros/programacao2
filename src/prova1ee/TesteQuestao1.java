package prova1ee;

public class TesteQuestao1 {
	
	public static void main(String[] args) {
		Questao1 q1 = new Questao1();
		
		int[] resultado = q1.simular();
		
		for (int i = 0; i < resultado.length; i++) {
			System.out.printf("%d apareceu %d vezes\n", i+2, resultado[i]);
		}
	}

}

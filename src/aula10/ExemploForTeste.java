package aula10;

public class ExemploForTeste {
	
	public static void main(String[] args) {
		int[] valores = new int[5];
		valores[0] = 1;
		valores[1] = 6;
		valores[2] = 3;
		valores[3] = 9;
		valores[4] = 5;
		
		ExemploFor e = new ExemploFor();
		
		//e.imprimeNotasForTradicional(valores);
		System.out.println();
		//e.imprimeNotasForAvancado(valores);
		
		String s = "" + 1392;
		for (int i = s.length() - 1; i <= 0; i--) {
			System.out.println(s.charAt(i));
		}
	}

}

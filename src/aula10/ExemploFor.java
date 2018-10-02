package aula10;

public class ExemploFor {
	
	public void imprimeNotasForTradicional(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println( v[i] );
			v[i] = -1;
		}
		
		for (int i = 0; i < v.length; i++) {
			System.out.println( v[i] );
		}
	}
	
	public void imprimeNotasForAvancado(int[] v) {
		for (int valor : v) {
			System.out.println( valor );
			valor = -1;
		}
		
		for (int valor : v) {
			System.out.println( valor );
		}
	}

}

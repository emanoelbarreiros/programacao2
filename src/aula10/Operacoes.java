package aula10;

public class Operacoes {
	
	public long produto(long... valores) {
		long resultado = 1;
		for (long v : valores) {
			resultado = resultado * v;
		}
		
		return resultado;
	}

}

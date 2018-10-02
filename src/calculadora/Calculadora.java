package calculadora;

public class Calculadora {
	
	public int media(int[] valores) {
		int qtdElementos = valores.length;
		int soma = 0;
		
		for (int i = 0; i < qtdElementos; i++) {
			soma += valores[i];
		}
		return soma / qtdElementos;
	}
	
	public double media(double... valores) {
		double total = 0;

		for (double v : valores) {
			total += v;
		}
		return total / valores.length;

	}
	
	public long produto(int... parametros) {
		long resultado = 1;
		
//		for (int indice = 0; indice < parametros.length; indice++) {
//			resultado = resultado * parametros[indice];
//		}
		
		for (int valor : parametros) {
			resultado = resultado * valor;
		}
		
		return resultado;
	}

}

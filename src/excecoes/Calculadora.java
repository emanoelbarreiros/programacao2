package excecoes;

public class Calculadora {
	
	public int somar(int a, int b) {
		return a + b;
	}
	
	public int multiplicar(int a, int b) {
		return a * b;
	}
	
	public int dividir(int a, int b) throws CalculadoraException {
		int c = 0;
		
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			throw new CalculadoraException("erro de aritmetica");
		} 
		
		return c;
	}
	
	public int subtrair(int a, int b) {
		return a - b;
	}

}

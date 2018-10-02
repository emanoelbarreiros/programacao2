package calculadora;

public class CalculadoraTeste {
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		int[] numeros = {1, 4, 5, 7, 9};
		imprimirVetor(numeros);
		
		int media = calc.media(numeros);
		
		System.out.println("Resultado: " + media);
		
		long res = calc.produto(10,20,30,40,50);
		
		System.out.printf("O resultado do produto é %d", res);
	}
	
	public static void imprimirVetor(int[] vetor) {
		for (int v : vetor) {
			System.out.println(v);
		}
	}

}

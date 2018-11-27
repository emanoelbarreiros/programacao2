package recursao;

public class TesteFibonacci {
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		int indice = 50;
		
		long inicio = System.currentTimeMillis();
		
		long valor = f.fib(indice);
		
		long fim = System.currentTimeMillis();
		
		System.out.print(valor + " em ");
		exibirTempo(inicio, fim);
		
		inicio = System.currentTimeMillis();
		
		long valor2 = f.fib_i(indice);
		
		fim = System.currentTimeMillis();
		
		System.out.print(valor2 + " em ");
		exibirTempo(inicio, fim);
	}
	
	public static void exibirTempo(long inicio, long fim) {
		long tempo = fim - inicio;
		System.out.println(tempo/1000.0 + " segundos");
	}

}

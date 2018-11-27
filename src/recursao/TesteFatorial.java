package recursao;

public class TesteFatorial {
	
	public static void main(String[] args) {
		Fatorial f = new Fatorial();
		
		long inicio = System.currentTimeMillis();
		long valor = f.fat(50);
		long fim = System.currentTimeMillis();
		
		System.out.println(valor + " em " + (fim - inicio)/1000.0 + " segundos");
		
		inicio = System.currentTimeMillis();
		long valor2 = f.fat_w(50);
		fim = System.currentTimeMillis();
		
		System.out.println(valor2 + " em " + (fim - inicio)/1000.0 + " segundos");
	}

}

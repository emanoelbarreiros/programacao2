package recursao;

public class Fatorial {
	
	public long fat(int n) {
		if (n == 0 || n == 1) {
			return  1;
		} else {
			return n * fat(n-1); 
		}
	}
	
	public long fat_i(int n) {
		long resultado = 1;
		for(int i = 1; i <= n; i++) {
			resultado = resultado * i;
		}
		
		return resultado;
	}
	
	public long fat_w(int n) {
		long resultado = 1;
		while (n > 0) {
			resultado = resultado * n--;
		}
		
		return resultado;
	}

	
	
	
	
	
	
}

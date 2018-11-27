package recursao;

public class Fibonacci {
	
	public long fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	public long fib_i(int n) {
		long atual = 0;
        long anterior = 0;
  
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                atual = 1;
                anterior = 0;
            } else {
                atual = atual + anterior;
                anterior = atual - anterior;
            }
  
        }
  
        return atual;
	}

}

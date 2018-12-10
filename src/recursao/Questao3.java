package recursao;

public class Questao3 {
	
	public static void main(String[] args) {
		int invertido = inverte(124567);
		
		System.out.println(invertido);
	}
	
	public static int inverte(int valor) {
		if (valor < 10) {
			return valor;
		} else {
			int q = valor / 10;
			int r = valor % 10;
			
			int digitos = ((int)Math.log10(valor)) + 1;
			
			return potencia(10, digitos-1)*r + inverte(q);
		}
	}
	
	public static int potencia(int base, int expoente) {
		if (expoente == 1) {
			return base;
		} else if (expoente == 0){
			return 1;
		} else {
			return base * potencia(base, expoente - 1);
		}
	}

}

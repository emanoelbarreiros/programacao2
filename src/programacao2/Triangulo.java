package programacao2;

public class Triangulo {
	
	public static void main(String[] args) {
		int lado1 = 1;
		int lado2 = 1;
		int lado3 = 1;
		int ordem = 1;
		while (lado1 <= 500) {
			lado2 = 1;
			while (lado2 <= 500) {
				lado3 = 1;
				while (lado3 <= 500) {
					if (lado1*lado1 == lado2*lado2 + lado3*lado3) {
						System.out.printf("%d. %d %d %d\n", ordem++, lado1, lado2, lado3);
					}
					lado3++;
				}
				lado2++;
			}
			lado1++;
		}
	}

}

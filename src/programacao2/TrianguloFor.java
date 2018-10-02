package programacao2;

public class TrianguloFor {
	
	public static void main(String[] args) {
		int ordem = 1;
		for (int lado1 = 1; lado1 <= 500; lado1++) {
			for (int lado2 = 1; lado2 <= 500; lado2++) {
				for (int lado3 = 1; lado3 <= 500; lado3++) {
					if (lado1*lado1 == lado2*lado2 + lado3*lado3) {
						System.out.printf("%d. %d %d %d\n", ordem++, lado1, lado2, lado3);
					}
				}
			}
		}
			
	}

}

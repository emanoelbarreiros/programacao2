package prova;

public class Triangulo extends Forma {
	
	private int lado1;
	private int lado2;
	private int lado3;
	
	public Triangulo(int l1, int l2, int l3) {
		lado1 = l1;
		lado2 = l2;
		lado3 = l3;
	}
	
	public int perimetro() {
		return lado1 + lado2 + lado3;
	}
}

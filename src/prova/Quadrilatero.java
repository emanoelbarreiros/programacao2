package prova;

public class Quadrilatero extends Forma {
	
	private int lado1;
	private int lado2;
	private int lado3;
	private int lado4;
	
	public Quadrilatero(int l1, int l2, int l3, int l4) {
		lado1 = l1;
		lado2 = l2;
		lado3 = l3;
		lado4 = l4;
	}
	
	public int perimetro() {
		return lado1 + lado2 + lado3 + lado4;
	}
	
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

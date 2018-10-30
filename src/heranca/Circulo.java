package heranca;

public class Circulo extends Forma2D {
	
	private int xCentro;
	private int yCentro;
	private double raio;
	
	public Circulo(String cor, int x, int y, double raio) {
		super(cor, Math.PI * raio * raio);
		this.area = Math.PI * raio * raio;
		this.xCentro = x;
		this.yCentro = y;
		this.raio = raio;
	}
	
	public String toString() {
		return cor + 
				" " + area + 
				" " + raio + 
				" " + "("+xCentro+","+yCentro+")";
	}

}

package heranca;

public class Forma2D extends Forma {
	
	protected double area;
	
	public Forma2D(String corForma, double area) {
		super(corForma);
		this.area = area;
	}
	
	public String toString() {
		return cor + " " + area;
	}

}

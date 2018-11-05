package polimorfismo;

public class Peixe extends Animal {
	
	public Peixe(int x, int y) {
		super(x, y, "peixe");
	}
	
	public void mover() {
		System.out.println("O peixe nadou.");
		this.setX(this.getX() + 1);
	}
	
	public void fazerBolhinhas() {
		System.out.println("glub glub");
	}

}

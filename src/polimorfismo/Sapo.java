package polimorfismo;

public class Sapo extends Animal {

	public Sapo(int x, int y) {
		super(x, y, "sapo");
	}
	
	public void mover() {
		System.out.println("O sapo pulou.");
		this.setX(this.getX() + 2);
		this.setY(this.getY() + 2);
	}
	
}

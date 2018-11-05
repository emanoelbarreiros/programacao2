package polimorfismo;

public class Passaro extends Animal {
	
	public Passaro(int x, int y) {
		super(x, y, "passaro");
	}

	public void mover() {
		System.out.println("O passaro voou.");
		this.setY(this.getY() + 5);
	}
	
}

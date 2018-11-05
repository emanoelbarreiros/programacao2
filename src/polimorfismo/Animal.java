package polimorfismo;

public class Animal {
	
	private int x;
	private int y;
	private String nome;
	
	public Animal(int x, int y, String nome) {
		this.x = x;
		this.y = y;
		this.nome = nome;
	}
	
	public void mover() {
		System.out.println("o animal se moveu");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void imprimirLocalizacao() {
		System.out.println(nome + ": (" + x + "," + y + ")");
	}
}

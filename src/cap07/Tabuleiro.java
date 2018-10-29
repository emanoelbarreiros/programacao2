package cap07;

public class Tabuleiro {
	
	private char[][] terreno;
	private int dimensaoX;
	private int dimensaoY;
	private int xTartaruga;
	private int yTartaruga;
	
	public Tabuleiro(int xInicialTartaruga, int yInicialTartaruga) {
		dimensaoX = 20;
		dimensaoY = 20;
		xTartaruga = xInicialTartaruga;
		yTartaruga = yInicialTartaruga;
		terreno = new char[dimensaoY][dimensaoX];
		for (int i = 0; i < terreno.length; i++) {
			for (int j = 0; j < terreno[i].length; j++) {
				if (i == yInicialTartaruga && j == xInicialTartaruga) {
					terreno[i][j] = 'T';
				} else {
					terreno[i][j] = '-';
				}
				
			}
		}
	}
	
	public int getxTartaruga() {
		return xTartaruga;
	}

	public void setxTartaruga(int xTartaruga) {
		this.xTartaruga = xTartaruga;
	}

	public int getyTartaruga() {
		return yTartaruga;
	}

	public void setyTartaruga(int yTartaruga) {
		this.yTartaruga = yTartaruga;
	}

	public int getDimensaoX() {
		return dimensaoX;
	}
	
	public int getDimensaoY() {
		return dimensaoY;
	}
	
	public void exibirTabuleiro() {
		for (int i = 0; i < 3 * dimensaoX + 2; i++) {
			System.out.print("_");
		}
		System.out.println();
		for (int i = 0; i < terreno.length; i++) {
			System.out.print("|");
			for (int j = 0; j < terreno[i].length; j++) {
				if (terreno[i][j] == '-') {
					System.out.print(" - ");
				} else if (terreno[i][j] == '*') {
					System.out.print(" * ");
				} else {
					System.out.print(" T ");
				}
			}
			System.out.println("|");
		}
		for (int i = 0; i < 3 * dimensaoX + 2; i++) {
			System.out.print("_");
		}
		System.out.println();
	}

}

package cap07;

public class Tabuleiro {
	
	private int[][] terreno;
	private int dimensaoX;
	private int dimensaoY;
	private int xTartaruga;
	private int yTartaruga;
	
	private final int VAZIA = 0;
	private final int TARTARUGA_VAZIA = 1;
	private final int TARTARUGA_RISCADA = 2;
	private final int RISCADA = 3;
	
	public Tabuleiro(int xInicialTartaruga, int yInicialTartaruga) {
		dimensaoX = 20;
		dimensaoY = 20;
		xTartaruga = xInicialTartaruga;
		yTartaruga = yInicialTartaruga;
		terreno = new int[dimensaoY][dimensaoX];
		for (int i = 0; i < terreno.length; i++) {
			for (int j = 0; j < terreno[i].length; j++) {
				if (i == yInicialTartaruga && j == xInicialTartaruga) {
					terreno[i][j] = TARTARUGA_VAZIA;
				} else {
					terreno[i][j] = VAZIA;
				}
				
			}
		}
	}
	
	public int getxTartaruga() {
		return xTartaruga;
	}

	public void setxTartaruga(int xTartaruga) {
		if (terreno[this.yTartaruga][this.xTartaruga] == TARTARUGA_VAZIA) {
			terreno[this.yTartaruga][this.xTartaruga] = VAZIA;
		} else if (terreno[this.yTartaruga][this.xTartaruga] == TARTARUGA_RISCADA) {
			terreno[this.yTartaruga][this.xTartaruga] = RISCADA;
		}
		
		if (terreno[this.yTartaruga][xTartaruga] == VAZIA) {
			terreno[this.yTartaruga][xTartaruga] = TARTARUGA_VAZIA;
		} else if (terreno[this.yTartaruga][xTartaruga] == RISCADA) {
			terreno[this.yTartaruga][xTartaruga] = TARTARUGA_RISCADA;
		}
		
		this.xTartaruga = xTartaruga;
	}

	public int getyTartaruga() {
		return yTartaruga;
	}

	public void setyTartaruga(int yTartaruga) {
		if (terreno[this.yTartaruga][this.xTartaruga] == TARTARUGA_VAZIA) {
			terreno[this.yTartaruga][this.xTartaruga] = VAZIA;
		} else if (terreno[this.yTartaruga][this.xTartaruga] == TARTARUGA_RISCADA) {
			terreno[this.yTartaruga][this.xTartaruga] = RISCADA;
		}
		
		if (terreno[yTartaruga][this.xTartaruga] == VAZIA) {
			terreno[yTartaruga][this.xTartaruga] = TARTARUGA_VAZIA;
		} else if (terreno[yTartaruga][this.xTartaruga] == RISCADA) {
			terreno[yTartaruga][this.xTartaruga] = TARTARUGA_RISCADA;
		}
		
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
				if (terreno[i][j] == VAZIA) {
					System.out.print(" - ");
				} else if (terreno[i][j] == RISCADA) {
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
	
	public void riscar() {
		terreno[this.yTartaruga][this.xTartaruga] = TARTARUGA_RISCADA;
	}

}

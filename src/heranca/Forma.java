package heranca;

public class Forma {
	
	protected String cor;
	
	public Forma(String cor) {
		this.cor = cor;
	}
	
	public String toString() {
		return cor;
	}
	
	public boolean equals(Object outro) {
		Forma convertido = (Forma) outro;
		return this.cor.equals(convertido.getCor());
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}

package cap07;

public class Tartaruga {
	
	private int x;
	private int y;
	private boolean canetaAbaixada;
	private char orientacao;
	
	private final char ORIENTACAO_LESTE = 'L';
	private final char ORIENTACAO_OESTE = 'O';
	private final char ORIENTACAO_NORTE = 'N';
	private final char ORIENTACAO_SUL = 'S';
	
	public Tartaruga() {
		x = 0;
		y = 0;
		canetaAbaixada = false;
		orientacao = ORIENTACAO_LESTE;
	}
	
	public void girarDireita() {
		if (orientacao == ORIENTACAO_NORTE) {
			orientacao = ORIENTACAO_LESTE;
		} else if (orientacao == ORIENTACAO_LESTE) {
			orientacao = ORIENTACAO_SUL;
		} else if (orientacao == ORIENTACAO_SUL) {
			orientacao = ORIENTACAO_OESTE;
		} else if (orientacao == ORIENTACAO_OESTE) {
			orientacao = ORIENTACAO_NORTE;
		}
	}
	
	public void girarEsquerda() {
		if (orientacao == ORIENTACAO_NORTE) {
			orientacao = ORIENTACAO_OESTE;
		} else if (orientacao == ORIENTACAO_LESTE) {
			orientacao = ORIENTACAO_NORTE;
		} else if (orientacao == ORIENTACAO_SUL) {
			orientacao = ORIENTACAO_LESTE;
		} else if (orientacao == ORIENTACAO_OESTE) {
			orientacao = ORIENTACAO_SUL;
		}
	}
	
	public void abaixarCaneta() {
		canetaAbaixada = true;
	}
	
	public void levantarCaneta() {
		canetaAbaixada = false;
	}
	
	public void avancar(int qtdPassos, Tabuleiro tabuleiro) {
		if (orientacao == ORIENTACAO_NORTE) {
			if (y - qtdPassos < 0) {
				y = 0;
			} else {
				y = y - qtdPassos;
			}
			tabuleiro.setyTartaruga(y);
		} else if (orientacao == ORIENTACAO_LESTE) {
			if (x + qtdPassos > tabuleiro.getDimensaoX() - 1) {
				x = tabuleiro.getDimensaoX() - 1;
			} else {
				x = x + qtdPassos;
			}
			tabuleiro.setxTartaruga(x);
		} else if (orientacao == ORIENTACAO_SUL) {
			if (y + qtdPassos > tabuleiro.getDimensaoY() - 1) {
				y = tabuleiro.getDimensaoY() - 1;
			} else {
				y = y + qtdPassos;
			}
			tabuleiro.setyTartaruga(y);
		} else if (orientacao == ORIENTACAO_OESTE) {
			if (x - qtdPassos < 0) {
				x = 0;
			} else {
				x = x - qtdPassos;
			}
			tabuleiro.setxTartaruga(x);
		}
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
	public boolean getCanetaAbaixada() {
		return canetaAbaixada;
	}
	public void setCanetaAbaixada(boolean canetaAbaixada) {
		this.canetaAbaixada = canetaAbaixada;
	}

}

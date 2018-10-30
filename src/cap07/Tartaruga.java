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
	
	public void avancar(int qtdPassos, Tabuleiro tabuleiro) throws InterruptedException  {
		if (orientacao == ORIENTACAO_NORTE) {
			for (int i = 0; i < qtdPassos; i++) {
				if (y - 1 < 0) {
					y = 0;
					break;
			 	} else {
					y = y - 1;
				}
				if (this.canetaAbaixada) {
					tabuleiro.riscar();
				}
				tabuleiro.setyTartaruga(y);
				tabuleiro.exibirTabuleiro();
				Thread.sleep(1000);
			}
		} else if (orientacao == ORIENTACAO_LESTE) {
			for (int i = 0; i < qtdPassos; i++) {
				if (x + 1 > tabuleiro.getDimensaoX() - 1) {
					x = tabuleiro.getDimensaoX() - 1;
					break;
			 	} else {
					x = x + 1;
				}
				if (this.canetaAbaixada) {
					tabuleiro.riscar();
				}
				tabuleiro.setxTartaruga(x);
				tabuleiro.exibirTabuleiro();
				Thread.sleep(1000);
			}
		} else if (orientacao == ORIENTACAO_SUL) {
			for (int i = 0; i < qtdPassos; i++) {
				if (y + 1 > tabuleiro.getDimensaoY() - 1) {
					y = tabuleiro.getDimensaoY() - 1;
					break;
			 	} else {
					y = y + 1;
				}
				if (this.canetaAbaixada) {
					tabuleiro.riscar();
				}
				tabuleiro.setyTartaruga(y);
				tabuleiro.exibirTabuleiro();
				Thread.sleep(1000);
			}
		} else if (orientacao == ORIENTACAO_OESTE) {
			for (int i = 0; i < qtdPassos; i++) {
				if (x - 1 < 0) {
					x = 0;
					break;
			 	} else {
					x = x - 1;
				}
				if (this.canetaAbaixada) {
					tabuleiro.riscar();
				}
				tabuleiro.setxTartaruga(x);
				tabuleiro.exibirTabuleiro();
				Thread.sleep(1000);
			}
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

package cap07;

public class Questao7_23 {
	
	public static void main(String[] args) {
		String[] comandos = {"5,4", "3", "5,2", "4", "5,3"};
		
		Tartaruga tartaruga = new Tartaruga();
		
		Tabuleiro tabuleiro = new Tabuleiro(tartaruga.getX(), tartaruga.getY());
		tabuleiro.exibirTabuleiro();
		
		
		
	}

}

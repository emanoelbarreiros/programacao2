package excecoes;

public class TestaExcecoes {
	
	public static void main(String[] args) {
		try {
			LancaExcecoes lancador = new LancaExcecoes();
			
			lancador.m3();
		} catch(ExcecaoB e) {
			System.out.println("A excecao B foi lançada.");
		} catch(ExcecaoA e) {
			System.out.println("A excecao A foi lançada.");
		} 
	}

}

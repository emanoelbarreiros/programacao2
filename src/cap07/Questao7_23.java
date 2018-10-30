package cap07;

public class Questao7_23 {
	
	public static void main(String[] args) {
		String[] comandos = {"5,4", "3", "5,3", "2", 
				"5,4", "4", "5,4", "4", "5,4", "4", "5,4", "1", "5,1"};
		
		Tartaruga tartaruga = new Tartaruga();
		
		Tabuleiro tabuleiro = new Tabuleiro(tartaruga.getX(), tartaruga.getY());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		for (String comando : comandos) {
			if (comando.equals("1")){//subir caneta
				tartaruga.levantarCaneta();
			} else if (comando.equals("2")) { //descer caneta
				tartaruga.abaixarCaneta();
			} else if (comando.equals("3")) { //virar pra a direita
				tartaruga.girarDireita();
			} else if (comando.equals("4")) { //virar pra a esquerda
				tartaruga.girarEsquerda();
			} else if (comando.startsWith("5")) { //avancar
				String[] comandoDividido = comando.split(",");
				int qtdPassos = Integer.parseInt(comandoDividido[1]);
				try {
					tartaruga.avancar(qtdPassos, tabuleiro);
				} catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}
			} else if (comando.equals("6")) { //exibir o terreno
				
			} else if (comando.equals("9")) { //finalizar
				
			}
		}
		
		
		
	}

}

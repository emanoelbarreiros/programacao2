package polimorfismo;

public class Simulador {
	
	public static void main(String[] args) {
		Animal[] animais = new Animal[3];
		
		animais[0] = new Peixe(0,0);
		animais[1] = new Sapo(2,3);
		animais[2] = new Passaro(1,5);
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < animais.length; j++) {
				animais[j].mover();
			}
		}
		
		for(int j = 0; j < animais.length; j++) {
			animais[j].imprimirLocalizacao();
		}
		
	}

}

package programacao2;

public class ExemploSwitch {
	
	public static void main(String[] args) {
		int var = 2;
		switch(var) {
			case 1:
			case 2:
			case 3:
				System.out.println("var era 1, 2 ou 3");
				break;
			default:
				System.out.println("nao era nem 1, nem 2, nem 3");
				break;
		}
	}

}

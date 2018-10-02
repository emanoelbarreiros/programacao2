package programacao2;

public class ExemploContinue {
	
	public static void main(String[] args) {
		for (int i = 0; i < 15; i++) {
			if (i == 10) {
				continue;
			}
			System.out.println(i);
		}
	}

}

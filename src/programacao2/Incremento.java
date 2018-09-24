package programacao2;

public class Incremento {

	public static void main(String[] args) {
		int c = 5;
		
		System.out.println(c);
		System.out.println(c++);
		System.out.println(c);
		
		int a = 10 + c++;
		System.out.println(a);
		
		System.out.println(c);
		System.out.println(++c);
		System.out.println(c);
	}

}

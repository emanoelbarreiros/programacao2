package heranca;

public class TesteForma {
	
	public static void main(String[] args) {
		Circulo c = new Circulo("azul", 3, 10, 2.5);
		
		Forma2D f2d = new Forma2D("azul", 123.0892);
		
		Forma f = new Forma("branco");
		Forma f2 = new Forma("preto");
		Forma f3 = f;
		
		System.out.println(c.toString());
		System.out.println(f2d.toString());
		System.out.println("uma forma: " + f);
		
		boolean iguais = f == f3;
		System.out.println("f e f3 sao iguais: " + iguais);
		
		
		
		
		
		
		
		
	}

}

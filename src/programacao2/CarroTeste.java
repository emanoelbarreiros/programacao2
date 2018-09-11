package programacao2;

public class CarroTeste {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		carro1.setCor("Branco");
		carro2.setCor("Preto");
		
		String corCarro1 = carro1.getCor();
		String corCarro2 = carro2.getCor();
		System.out.println(corCarro1);
		System.out.println(corCarro2);
	}

}

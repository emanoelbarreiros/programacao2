package cap3;

public class InvoiceTest {
	
	public static void main(String[] args) {
		Invoice inv1 = new Invoice("1931", "Teclado Gamer Razer Black Widow", 5, -599.0);
		
		double valor = inv1.getInvoiceAmount();
		
		String a = inv1.getNumero();
		
		System.out.println(valor);
	}

}

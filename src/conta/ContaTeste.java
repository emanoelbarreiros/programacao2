package conta;

public class ContaTeste {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.creditar(-100);
		conta1.debitar(-100);
		
		double valor = conta1.getSaldo();
		
		System.out.printf("Saldo da conta 1: R$ %.2f\n", conta1.getSaldo());
		System.out.printf("Saldo da conta 2: R$ %.2f\n", conta2.getSaldo());
	}

}

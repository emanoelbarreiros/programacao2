package conta;

public class Conta {

	private double saldo;

	public void creditar(double montante) {
		if (montante > 0) {
			saldo = saldo + montante;
		}
	}

	public void debitar(double montante) {
		if (montante > 0) {
			saldo = saldo - montante;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

	
}

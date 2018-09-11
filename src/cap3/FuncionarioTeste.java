package cap3;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Emanoel", "Barreiros", 1000);
		Funcionario f2 = new Funcionario("James", "Victor", 3000);
		
		System.out.println("Dados funcionario 1");
		System.out.printf("Nome completo: %s %s. Salário anual: R$ %.2f.\n", f1.getNome(), f1.getSobrenome(), f1.getSalario()*12);
		
		System.out.println("Dados funcionario 2");
		System.out.printf("Nome completo: %s %s. Salário anual: R$ %.2f.\n", f2.getNome(), f2.getSobrenome(), f2.getSalario()*12);
		
		double salarioAtualF1 = f1.getSalario();
		double aumentoF1 = salarioAtualF1 * 1.1;
		f1.setSalario(aumentoF1);
		
		System.out.println("Salario anual de F1: " + f1.getSalario() * 12);
		System.out.println("Salario anual de F2: " + f2.getSalario() * 12);
	}
}

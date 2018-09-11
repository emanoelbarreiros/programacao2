package cap3;

public class Funcionario {
	
	private String nome;
	private String sobrenome;
	private double salario;

	public Funcionario(String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public void setSalario(double salario) {
		if (salario > 0) {
			this.salario = salario;
		}
	}
	
	public double getSalario() {
		return this.salario;
	}

}

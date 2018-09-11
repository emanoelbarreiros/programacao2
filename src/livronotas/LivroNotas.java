package livronotas;

public class LivroNotas {
	
	private String nomeCurso;
	private boolean turmaExtra;
	private String nomeInstrutor;
	
	public LivroNotas(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public LivroNotas(String nomeCurso, String nomeInstrutor) {
		this.nomeCurso = nomeCurso;
		this.nomeInstrutor = nomeInstrutor;
	}
	
	public LivroNotas(String nomeCurso, boolean turmaExtra) {
		this.nomeCurso = nomeCurso;
		this.turmaExtra = turmaExtra;
	}

	public void exibirBoasVindas() {
		System.out.printf("Bem-vindo ao Livro de Notas do curso %s.\n", this.nomeCurso);
		if (turmaExtra) {
			System.out.println("Este curso é uma turma EXTRA.");
		} else {
			System.out.println("Este curso é uma turma REGULAR.");
		}
	}
	
	public void exibirMensagem() {
		exibirBoasVindas();
		System.out.printf("Este curso é ministrado por %s.\n", this.nomeInstrutor);
	}
	
	public void setNomeCurso(String nome) {
		this.nomeCurso = nome;
	}
	
	public String getNomeCurso() {
		return this.nomeCurso;
	}
	
	public boolean getTurmaExtra() {
		return this.turmaExtra;
	}
	
	public void setTurmaExtra(boolean valor) {
		this.turmaExtra = valor;
	}

	public void setNomeInstrutor(String nome) {
		this.nomeInstrutor = nome;
	}
	
	public String getNomeInstrutor() {
		return this.nomeInstrutor;
	}
}

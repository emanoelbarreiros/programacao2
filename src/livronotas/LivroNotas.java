package livronotas;

public class LivroNotas {
	
	private String nomeCurso;
	private boolean turmaExtra;
	private String nomeInstrutor;
	private double notasSomadas;
	private int quantidadeNotas;
	private int quantidadeNotasAbaixoMedia;
	
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
	
	public double determinarMediaTurma() {
		double resultado = notasSomadas / quantidadeNotas;
		return resultado;
	}
	
	public void adicionarNota(double nota) {
		notasSomadas = notasSomadas + nota;
		quantidadeNotas = quantidadeNotas + 1;
		
		if (nota < 7) {
			quantidadeNotasAbaixoMedia = quantidadeNotasAbaixoMedia + 1;
		}
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

	public double getNotasSomadas() {
		return notasSomadas;
	}

	public void setNotasSomadas(double notasSomadas) {
		this.notasSomadas = notasSomadas;
	}

	public int getQuantidadeNotas() {
		return quantidadeNotas;
	}

	public void setQuantidadeNotas(int quantidadeNotas) {
		this.quantidadeNotas = quantidadeNotas;
	}

	public int getQuantidadeNotasAbaixoMedia() {
		return quantidadeNotasAbaixoMedia;
	}

	public void setQuantidadeNotasAbaixoMedia(int quantidadeNotasAbaixoMedia) {
		this.quantidadeNotasAbaixoMedia = quantidadeNotasAbaixoMedia;
	}
}

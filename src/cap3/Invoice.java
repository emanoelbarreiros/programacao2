package cap3;

public class Invoice {

	private String numero;
	private String descricao;
	private int quantidade;
	private double valorUnitario;

	public Invoice(String numero, String descricao, int quantidade, double valorUnitario) {
		this.numero = numero;
		this.descricao = descricao;
		setQuantidade(quantidade);
		setValorUnitario(valorUnitario);
	}

	public double getInvoiceAmount() {
		double valorTotal = valorUnitario * quantidade;
		return valorTotal;
	}

	public void setNumero(String valor) {
		this.numero = valor;
	}

	public String getNumero() {
		return this.numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if (quantidade < 0) {
			this.quantidade = 0;
		} else {
			this.quantidade = quantidade;
		}
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		if (valorUnitario < 0) {
			this.valorUnitario = 0;
		} else {
			this.valorUnitario = valorUnitario;
		}
	}
}

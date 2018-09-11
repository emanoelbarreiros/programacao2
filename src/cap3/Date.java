package cap3;

public class Date {
	
	private int dia;
	private int mes;
	private int ano;

	public Date(int dia, int mes, int ano) {
		this.dia = dia;
		this.ano = ano;
		this.mes = mes;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getDia() {
		return this.dia;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public void displayDate() {
		System.out.printf("%d/%d/%d\n", dia, mes, ano);
	}

}

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
	
	public boolean antes(Date outraData) {
		boolean retorno = true;
		
		if (this.ano > outraData.getAno()) {
			retorno = false;
		} else if (this.ano < outraData.getAno()) {
			retorno = true;
		} else {
			if (this.mes > outraData.getMes()) {
				retorno = false;
			} else if (this.mes < outraData.getMes()) {
				retorno = true;
			} else {
				if (this.dia < outraData.getDia()) {
					retorno = true;
				} else {
					retorno = false;
				}
			}
		}
		
		return retorno;
	}
	
	public int diferenca(Date data2) {
		int dif = 0;
		
		return dif;
	}
	
	public void adicionarDia() {
		int diasMes = 0 ;
		if (this.mes == 1 || this.mes == 3 || this.mes == 5 
				|| this.mes == 7 || this.mes == 8
				|| this.mes == 10 || this.mes == 12) {
			diasMes = 31;
		} else if (this.mes == 4 || this.mes == 6 
				|| this.mes == 9 || this.mes == 11) {
			diasMes = 30;
		} else {
			boolean anoBissexto = this.ano % 4 == 0;
			if (anoBissexto) {
				diasMes = 29;
			} else {
				diasMes = 28;
			}
		}
		
		if (dia + 1 <= diasMes) {
			dia = dia + 1;
		} else {
			dia = 1;
			if (mes + 1 <= 12) {
				mes = mes + 1;
			} else {
				dia = 1;
				mes = 1;
				ano = ano + 1;
			}
		}
	}

}

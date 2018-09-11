package cap3;

public class DateTeste {

	public static void main(String[] args) {
		Date data1 = new Date(29, 2, 2017);
		//Date data2 = new Date(22, 12, 2018);
		//boolean anterior = data1.antes(data2);
		//boolean anterior2 = data2.antes(data1);
		
		//System.out.println(anterior);
		
		//System.out.println(anterior2);
		
		data1.displayDate();
		data1.adicionarDia();
		data1.displayDate();
	}

}

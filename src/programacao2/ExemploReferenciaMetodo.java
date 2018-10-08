package programacao2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ExemploReferenciaMetodo {
	
	public static void main(String[] args) {
		String[] val = {"f"," abc", "xyz ", "g"};
		
		ArrayList<String> valores = new ArrayList<>();
		Object[] val2 = Arrays.asList(val).stream().map(String::trim).toArray();
		
		Arrays.stream(val).forEach(System.out::print);
		System.out.println();
		Stream.of(val2).forEach(System.out::print);
		
		int res = Stream.of(1,2,3,4,5,6).reduce(1, (x,y) -> x*y);
		System.out.println(res);
	}
	

}

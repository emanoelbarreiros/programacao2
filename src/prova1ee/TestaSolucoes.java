package prova1ee;

import java.util.Arrays;

public class TestaSolucoes {

public static int [] array(int [] a1, int [] a2){
		
		
		int []ct = new int [a1.length+a2.length];
		
		int indiceDeC = 0;

		for(int i = 0; i < a1.length; i++)
			ct[indiceDeC++] = a1[i];

		for (int i = 0; i < a2.length; i++)
			ct[indiceDeC++] = a2[i];
			

		return ct;



	}

	public static void main(String[] args) {
		

		int [] a1 = {1,2,3,4,5};
		int [] a2 = {6,7,8,9,10};
		int [] ct = array (a1,a2);
		
		 System.out.println(Arrays.toString(ct));
	

	}

}

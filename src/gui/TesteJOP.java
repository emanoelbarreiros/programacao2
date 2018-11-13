package gui;

import javax.swing.JOptionPane;

public class TesteJOP {
	
	public static void main(String[] args) {
		String numero1 = JOptionPane.showInputDialog("Informe o primeiro inteiro.");
		String numero2 = JOptionPane.showInputDialog("Informe o segundo inteiro.");
		
		int num1 = Integer.parseInt(numero1);
		int num2 = Integer.parseInt(numero2);
		
		int soma = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "A soma é " + soma, 
				"Soma de dois inteiros", 
				JOptionPane.ERROR_MESSAGE);
	}

}

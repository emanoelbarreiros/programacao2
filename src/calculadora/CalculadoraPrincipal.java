package calculadora;

import javax.swing.JFrame;

public class CalculadoraPrincipal {
	
	public static void main(String[] args) {
		CalculadoraFrame frame = new CalculadoraFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

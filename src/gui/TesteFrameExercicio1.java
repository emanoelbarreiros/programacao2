package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TesteFrameExercicio1 {
	
	public static void main(String[] args) {
		
		String textoTemperatura = JOptionPane.showInputDialog("Informe a temperatura em Farenheit");
		
		double farenheit = Double.parseDouble(textoTemperatura);
		double celsius = 5.0 / 9.0 * (farenheit - 32);
		
		FrameExercicio1 frame = new FrameExercicio1(celsius);
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}

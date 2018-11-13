package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameExercicio1 extends JFrame {
	
	private JLabel labelTemperatura;
	
	public FrameExercicio1(double temperatura) {
		super("Conversão de temperatura");
		
		labelTemperatura = new JLabel("Temperatura em celsius: " + String.format("%.2f", temperatura));
		add(labelTemperatura);
	}
	
	

}

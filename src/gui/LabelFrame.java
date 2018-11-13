package gui;

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelFrame extends JFrame {
	
	private final JLabel label1;
	private final JLabel label2;
	private final JLabel label3;
	
	public LabelFrame() {
		super("Testando labels");
		setLayout(new FlowLayout());
		
		label1 = new JLabel("Label com texto");
		label1.setToolTipText("Este é o label1");
		add(label1);
		
		ImageIcon icone = new ImageIcon(getClass().getResource("nautico.png"));
		//redimensionar a imagem do icone (preguiça de editar a imagem)
		Image imagem = icone.getImage();  
		Image novoIcone = imagem.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);  
		icone = new ImageIcon(novoIcone);
		
		label2 = new JLabel("Label com texto e icone", icone, SwingConstants.LEFT);
		add(label2);
		
		label3 = new JLabel("Label com texto e icone abaixo");
		label3.setIcon(icone);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("Este é o label3");
		add(label3);
	}

}

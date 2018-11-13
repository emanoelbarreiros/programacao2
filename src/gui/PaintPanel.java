package gui;

import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {
	private final ArrayList<Point> pontos = new ArrayList<>();

	public PaintPanel() {
		addMouseMotionListener(new MouseMotionAdapter() 
		{
			public void mouseDragged(MouseEvent event) {
				pontos.add(event.getPoint());
				repaint(); 
			}
		});
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g); 

		for (Point ponto : pontos)
			g.fillOval(ponto.x, ponto.y, 4, 4);
	}
} 
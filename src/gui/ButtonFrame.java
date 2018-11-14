package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame 
{
   private final JButton botaoSimples; 
   private final JButton botaoDinamico; 

   public ButtonFrame()
   {
      super("Testando botões");
      setLayout(new FlowLayout()); 

      botaoSimples = new JButton("Botão Simples"); 
      add(botaoSimples); 

      Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif"));
      Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));
      botaoDinamico = new JButton("Botão Dinâmico", bug1); 
      botaoDinamico.setRolloverIcon(bug2); 
      add(botaoDinamico); 

      ButtonHandler handler = new ButtonHandler();
      botaoDinamico.addActionListener(handler);
      botaoSimples.addActionListener(handler);
   }

   private class ButtonHandler implements ActionListener 
   {
	   public void actionPerformed(ActionEvent event)
      {
         JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
            "Você pressionou: %s", event.getActionCommand()));
      }
   } 
} 

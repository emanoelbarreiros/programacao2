package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Painter
{
   public static void main(String[] args)
   { 
      JFrame janela = new JFrame("Uma aplicação simples");

      PaintPanel painel = new PaintPanel(); 
      janela.add(painel, BorderLayout.CENTER); 
      
      janela.add(new JLabel("Arraste o mouse para desenhar"), 
         BorderLayout.SOUTH);

      janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      janela.setSize(400, 200); 
      janela.setVisible(true); 
   } 
} 
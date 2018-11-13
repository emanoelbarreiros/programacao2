package gui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame 
{
   private final JTextField textField; 
   private final JCheckBox negritoJCheckBox; 
   private final JCheckBox italicoJCheckBox; 

   public CheckBoxFrame()
   {
      super("JCheckBox Test");
      setLayout(new FlowLayout());

      textField = new JTextField("Observe a fonte mudar", 20);
      textField.setFont(new Font("Serif", Font.PLAIN, 14));
      add(textField); 

      negritoJCheckBox = new JCheckBox("Negrito"); 
      italicoJCheckBox = new JCheckBox("Itálico"); 
      add(negritoJCheckBox); 
      add(italicoJCheckBox); 

      CheckBoxHandler handler = new CheckBoxHandler();
      negritoJCheckBox.addItemListener(handler);
      italicoJCheckBox.addItemListener(handler);
   } 

   private class CheckBoxHandler implements ItemListener 
   {
      public void itemStateChanged(ItemEvent event)
      {
         Font font = null; 

         if (negritoJCheckBox.isSelected() && italicoJCheckBox.isSelected()) {
            font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
         } else if (negritoJCheckBox.isSelected()) {
            font = new Font("Serif", Font.BOLD, 14);
         } else if (italicoJCheckBox.isSelected()) {
            font = new Font("Serif", Font.ITALIC, 14);
         } else {
            font = new Font("Serif", Font.PLAIN, 14);
         }

         textField.setFont(font); 
      } 
   }
} 
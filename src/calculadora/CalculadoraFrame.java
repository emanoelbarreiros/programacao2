package calculadora;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalculadoraFrame extends JFrame {
	
	private JTextField visor;
	
	private JButton botao1;
	private JButton botao2;
	private JButton botao3;
	private JButton botao4;
	private JButton botao5;
	private JButton botao6;
	private JButton botao7;
	private JButton botao8;
	private JButton botao9;
	private JButton botao0;
	
	private JButton botaoPonto;
	private JButton botaoMais;
	private JButton botaoMenos;
	private JButton botaoVezes;
	private JButton botaoDivisao;
	private JButton botaoIgual;
	
	private JButton botaoDelete;
	private JButton botaoClear;
	
	private int ladoBotao = 50;
	
	public CalculadoraFrame() {
		super("Calculadora");
		
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setSize(4*ladoBotao, 6*ladoBotao+22);
		BotaoHandler handler = new BotaoHandler();
		
		botao1 = new JButton("1");
		botao1.setPreferredSize(new Dimension(ladoBotao,ladoBotao));
		botao1.addActionListener(handler);
		
		botao2 = new JButton("2");
		botao2.setPreferredSize(new Dimension(ladoBotao,ladoBotao));
		botao2.addActionListener(handler);
		
		botao3 = new JButton("3");
		botao3.setPreferredSize(new Dimension(ladoBotao,ladoBotao));
		botao3.addActionListener(handler);
		
		botao4 = new JButton("4");
		botao4.setPreferredSize(new Dimension(ladoBotao,ladoBotao));
		
		botao5 = new JButton("5");
		botao5.setPreferredSize(new Dimension(ladoBotao,ladoBotao));
		
		botao6 = new JButton("6");
		botao6.setPreferredSize(new Dimension(ladoBotao,ladoBotao));
		
		botao7 = new JButton("7");
		botao7.setPreferredSize(new Dimension(ladoBotao,ladoBotao));
		
		botao8 = new JButton("8");
		botao8.setPreferredSize(new Dimension(ladoBotao,ladoBotao));
		
		botao9 = new JButton("9");
		botao9.setPreferredSize(new Dimension(ladoBotao,ladoBotao));
		
		botao0 = new JButton("0");
		botao0.setPreferredSize(new Dimension(ladoBotao,ladoBotao));
		
		botaoMais = new JButton("+");
		botaoMais.setPreferredSize(new Dimension(ladoBotao,ladoBotao));
		botaoMais.addActionListener(handler);
		
		botaoMenos = new JButton("-");
		botaoMenos.setPreferredSize(new Dimension(ladoBotao,ladoBotao));
		
		botaoVezes = new JButton("x");
		botaoVezes.setPreferredSize(new Dimension(ladoBotao,ladoBotao));
		
		botaoDivisao = new JButton("/");
		botaoDivisao.setPreferredSize(new Dimension(ladoBotao,ladoBotao));
		
		botaoIgual = new JButton("=");
		botaoIgual.setPreferredSize(new Dimension(ladoBotao,ladoBotao));
		botaoIgual.addActionListener(handler);
		
		botaoPonto = new JButton(".");
		botaoPonto.setPreferredSize(new Dimension(ladoBotao,ladoBotao));
		
		botaoDelete = new JButton("DEL");
		botaoDelete.setPreferredSize(new Dimension(2*ladoBotao,ladoBotao));
		
		botaoClear = new JButton("C");
		botaoClear.setPreferredSize(new Dimension(2*ladoBotao,ladoBotao));
		
		visor = new JTextField();
		visor.setEditable(false);
		visor.setHorizontalAlignment(JTextField.RIGHT);
		visor.setFont(new Font("SansSerif", Font.BOLD, 20));
		visor.setPreferredSize(new Dimension(4*ladoBotao,ladoBotao));
		
		add(visor);
		add(botaoDelete);
		add(botaoClear);
		add(botao1);
		add(botao2);
		add(botao3);
		add(botaoMais);
		add(botao4);
		add(botao5);
		add(botao6);
		add(botaoMenos);
		add(botao7);
		add(botao8);
		add(botao9);
		add(botaoVezes);
		add(botao0);
		add(botaoPonto);
		add(botaoIgual);
		add(botaoDivisao);
	}
	
	private class BotaoHandler implements ActionListener {

		String textoVisor;
		int operacao = 0;
		int operando1 = 0;
		int operando2 = 0;
		boolean limparVisor = false;
		final int MAIS = 1;
		final int MENOS = 1;
		final int VEZES = 1;
		final int DIVISAO = 1;
		int resultado = 0;
		@Override
		public void actionPerformed(ActionEvent evento) {
			textoVisor = visor.getText();
			if (evento.getSource() == botao1) {
				if (limparVisor) {
					limparVisor = false;
					textoVisor = "";
				}
				visor.setText(textoVisor + "1");
			} else if (evento.getSource() == botao2) {
				if (limparVisor) {
					limparVisor = false;
					textoVisor = "";
				}
				visor.setText(textoVisor + "2");
			} else if (evento.getSource() == botao3) {
				if (limparVisor) {
					limparVisor = false;
					textoVisor = "";
				}
				visor.setText(textoVisor + "3");
			} else if (evento.getSource() == botaoMais) {
				operacao = MAIS;
				operando1 = Integer.parseInt(textoVisor);
				limparVisor = true;
			} else if (evento.getSource() == botaoIgual) {
				if (operacao > 0) {
					operando2 = Integer.parseInt(visor.getText());
					if (operacao == MAIS) {
						resultado = operando2 + operando1;
					}
					
					visor.setText("" + resultado);
					operacao = 0;
					limparVisor = true;
				}
				 
			}
			
		}
		
	}
}



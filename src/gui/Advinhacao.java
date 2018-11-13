package gui;

import java.util.Random;

import javax.swing.JOptionPane;

public class Advinhacao {

	public static void main(String[] args) {

		// passo 1. sortear o número
		Random rand = new Random();
		int numero = rand.nextInt(1000) + 1;
		int palpite = 0;
		String palpiteStr;

		while (palpite != numero) {
			// passo 2. solicitar um numero do usuario
			palpiteStr = JOptionPane.showInputDialog("Tente advinhar o número que estou pensando...");
			palpite = Integer.parseInt(palpiteStr);

			// passo 3. checar se acertou. se acertou encerrar
			if (palpite == numero) {
				JOptionPane.showMessageDialog(null, "Parabéns, você acertou: " + numero);
			} else {
				// passo 3. se nao acertou informar se o numero fornecido
				// foi maior ou menor do que o esperado. retornar para passo 2.
				if (palpite < numero) {
					JOptionPane.showMessageDialog(null, "Estou pensando em um número maior...");
				} else {
					JOptionPane.showMessageDialog(null, "Estou pensando em um número menor...");
				}
			}
			// fim do laço
		}
	}

}

package pratica_06;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Pratica_06_2 {

	public static void pratica() {
		String entrada;
		int numero1, numero2, soma;
		do {
			entrada = JOptionPane.showInputDialog("Informe o primeiro n�mero: ");
			// Converte a entrada para inteiro e armazena em numero1:
			numero1 = Integer.parseInt(entrada);
			entrada = JOptionPane.showInputDialog("Informe o segundo n�mero: ");
			// Converte a entrada para inteiro e armazena em numero2:
			numero2 = Integer.parseInt(entrada);
			soma = numero1 + numero2;
			JOptionPane.showMessageDialog(null, "A soma �: " + soma);
			int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (resp == JOptionPane.YES_OPTION)
				entrada = "sim";
			else if (resp == JOptionPane.NO_OPTION)
				entrada = "n�o";
		} while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
		System.exit(0);
	}
}

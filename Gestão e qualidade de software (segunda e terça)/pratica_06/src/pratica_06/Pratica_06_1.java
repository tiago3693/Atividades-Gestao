package pratica_06;

import javax.swing.JOptionPane;

public class Pratica_06_1 {

	public static void pratica() {
		int nota, idade;
		float salario;
		String sexo, entrada;
		do {
			do {
				nota = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota (0 a 10)"));
			} while (nota < 0 && nota > 10);

			do {
				salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o salario"));
			} while (salario < 0);
			
			do {
				sexo = JOptionPane.showInputDialog("Informe o sexo");
			} while (!sexo.equals("m") && !sexo.equals("f"));
			
			do {
				idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
			} while (idade < 0 || idade > 150);
			
			JOptionPane.showMessageDialog(null, "nota: " + nota
					+"\nsalario: " + salario
					+"\nsexo: " + sexo
					+"\nidade: " + idade);
			int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (resp == JOptionPane.YES_OPTION)
				entrada = "sim";
			else
				entrada = "não";
		} while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
		System.exit(0);
	}
}

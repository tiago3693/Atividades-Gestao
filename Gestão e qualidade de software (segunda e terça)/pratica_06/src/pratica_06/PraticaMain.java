package pratica_06;

import javax.swing.JOptionPane;

public class PraticaMain {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("selecione a questão"));
		System.out.println();
		switch (num1) {
		case 1:
			Pratica_06_1.pratica();
			break;
		case 2:
			Pratica_06_2.pratica();
			break;
		}

	}

}

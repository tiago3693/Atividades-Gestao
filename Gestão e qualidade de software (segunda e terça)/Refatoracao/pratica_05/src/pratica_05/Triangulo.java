package pratica_05;

import javax.swing.JOptionPane;

public class Triangulo {
	private int opcao;

	public Triangulo() {

		do {
			Lado lado1 = new Lado();
			Lado lado2 = new Lado();
			Lado lado3 = new Lado();

			// C�lculo (processamento):
			if (lado1.getLado() == lado2.getLado() && lado2.getLado() == lado3.getLado())
				JOptionPane.showMessageDialog(null, "Triangulo equil�tero.");
			else if (lado1.getLado() == lado2.getLado() || lado1.getLado() == lado3.getLado()
					|| lado2.getLado() == lado3.getLado())
				JOptionPane.showMessageDialog(null, "Triangulo is�sceles");
			else
				JOptionPane.showMessageDialog(null, "Triangulo escaleno.");

			opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirma��o", JOptionPane.YES_NO_OPTION);

		} while (opcao == JOptionPane.YES_OPTION);
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

}

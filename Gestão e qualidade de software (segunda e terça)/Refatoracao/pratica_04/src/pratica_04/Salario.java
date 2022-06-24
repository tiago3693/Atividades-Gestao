package pratica_04;

import javax.swing.JOptionPane;

public class Salario extends PessoaInfo {

	private double salario = 0;

	public Salario() {
		/*---------------------------------
		* Leitura e validação do salário:
		*---------------------------------
		*/
		do {
			setResp(JOptionPane.showInputDialog("Infome o salário", 0));

// Verifica se o botão "cancelar foi pressionado."
			if (getResp() == null) {
				System.err.println("Aviso: o botão \"cancelar\" foi pressionado.");

				System.exit(1);
			}
			try {
				setSalario(Double.parseDouble(getResp()));
				if (getSalario() > 0)
					setRepetir(false);
				else
					setRepetir(true);
			} catch (NumberFormatException e) {
				System.err.println("ERRO: número não identificado.");
				setRepetir(true);
			}
		} while (isRepetir() == true);
		JOptionPane.showMessageDialog(null, "Salário informado: " + getSalario());
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}

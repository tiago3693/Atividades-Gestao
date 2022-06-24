package pratica_04;

import javax.swing.JOptionPane;

public class Salario extends PessoaInfo {

	private double salario = 0;

	public Salario() {
		/*---------------------------------
		* Leitura e valida��o do sal�rio:
		*---------------------------------
		*/
		do {
			setResp(JOptionPane.showInputDialog("Infome o sal�rio", 0));

// Verifica se o bot�o "cancelar foi pressionado."
			if (getResp() == null) {
				System.err.println("Aviso: o bot�o \"cancelar\" foi pressionado.");

				System.exit(1);
			}
			try {
				setSalario(Double.parseDouble(getResp()));
				if (getSalario() > 0)
					setRepetir(false);
				else
					setRepetir(true);
			} catch (NumberFormatException e) {
				System.err.println("ERRO: n�mero n�o identificado.");
				setRepetir(true);
			}
		} while (isRepetir() == true);
		JOptionPane.showMessageDialog(null, "Sal�rio informado: " + getSalario());
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}

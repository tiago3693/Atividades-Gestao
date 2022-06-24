package pratica_04;

import javax.swing.JOptionPane;

public class Idade extends PessoaInfo {

	private int idade;

	public Idade() {

		/*-------------------------------
		* Leitura e valida��o da idade:
		*-------------------------------
		*/
		do {
			setResp(JOptionPane.showInputDialog("Infome a idade", 6));
//Verifica se o bot�o "cancelar foi pressionado."
			if (getResp() == null) {
				System.err.println("Aviso: o bot�o \"cancelar\" foi pressionado.");

				System.exit(1);
			}
			try {
				setIdade(Integer.parseInt(getResp()));
				if (getIdade() >= 6 && getIdade() <= 150)
					setRepetir(false);

				else
					setRepetir(true);
			} catch (NumberFormatException e) {
				System.err.println("ERRO: n�mero n�o identificado.");
				setRepetir(true);
			}
		} while (isRepetir() == true);
		JOptionPane.showMessageDialog(null, "Idade informada: " + getIdade());
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}

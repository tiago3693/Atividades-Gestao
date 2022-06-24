package pratica_04;

import javax.swing.JOptionPane;

public class Sexo extends PessoaInfo {

	private String sexo = "";

	public Sexo() {

		/*-------------------------------
		* Leitura e validação do sexo:
		*-------------------------------
		*/
		do {
			setSexo(JOptionPane.showInputDialog("Infome o sexo"));
// Verifica se o botão "cancelar foi pressionado."
			if (getSexo() == null) {
				System.err.println("Aviso: o botão \"cancelar\" foi pressionado.");

				System.exit(1);
			}
			if (getSexo().equalsIgnoreCase("f") == true || getSexo().equalsIgnoreCase("m")

					== true)

				setRepetir(false);
			else
				setRepetir(true);
		} while (isRepetir() == true);
		JOptionPane.showMessageDialog(null, "Sexo informado: " + getSexo());
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}

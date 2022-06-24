package pratica_04;

import javax.swing.JOptionPane;

public class Nota extends PessoaInfo{

	private double nota = 0;

	public Nota() {
		/*-------------------------------
		* Leitura e validação da nota:
		*-------------------------------
		*/
		do {
			setResp(JOptionPane.showInputDialog("Infome a nota [0, 10]", 0));
// Verifica se o botão "cancelar foi pressionado."
			if (getResp() == null) {
				System.err.println("Aviso: o botão \"cancelar\" foi pressionado.");

				System.exit(1);
			}
			try {
				setNota(Double.parseDouble(getResp()));
				if (getNota() >= 0 && getNota() <= 10)
					setRepetir(false);
				else
					setRepetir(true);
			} catch (NumberFormatException e) {
				System.err.println("ERRO: número não identificado.");
				setRepetir(true);
			}	
		} while (isRepetir() == true);
		JOptionPane.showMessageDialog(null, "Nota informada: " + getNota());
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
}

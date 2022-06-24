package pratica_05;

import javax.swing.JOptionPane;

public class Lado {
	private double lado = 0;
	private String resp = null;
	private boolean repetir = true;

	public Lado() {
		do {
			resp = JOptionPane.showInputDialog("Informe o primeiro lado:", 0);

			// Verifica se o botão "cancelar" foi pressionado:
			if (resp == null) {
				System.err.println("Aviso: o botão \"cancelar\" foi pressionado para sair do programa.");

				System.exit(0);
			}
			// Verifica se um número válido foi informado:
			try {
				lado = Double.parseDouble(resp);
				repetir = false;
			} catch (NumberFormatException e) {
				System.err.println("ERRO: número não identificado.");
				repetir = true;
			}
		} while (repetir);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public String getResp() {
		return resp;
	}

	public void setResp(String resp) {
		this.resp = resp;
	}

	public boolean isRepetir() {
		return repetir;
	}

	public void setRepetir(boolean repetir) {
		this.repetir = repetir;
	}

}

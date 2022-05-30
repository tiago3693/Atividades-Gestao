package pratica_11_1;

import java.util.Scanner;

public class Veiculo {

	private int numeroChassi, placa;

	public Veiculo(int numeroChassi, int placa) {
		this.numeroChassi = numeroChassi;
		this.placa = placa;
	}

	public int getNumeroChassi() {
		return numeroChassi;
	}

	public void setNumeroChassi(int numeroChassi) {
		this.numeroChassi = numeroChassi;
	}

	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

}

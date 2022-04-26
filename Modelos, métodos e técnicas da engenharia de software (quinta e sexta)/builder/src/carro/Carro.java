package carro;

public class Carro {

	private final CarroTipo tipo;
	private final int assentos;
	private final CarroMotor motor;
	private float combustivel = 0;

	public Carro(CarroTipo tipo, int assentos, CarroMotor motor) {
		this.tipo = tipo;
		this.assentos = assentos;
		this.motor = motor;
	}

	public float getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(float combustivel) {
		this.combustivel = combustivel;
	}

	public CarroTipo getTipo() {
		return tipo;
	}

	public int getAssentos() {
		return assentos;
	}

	public CarroMotor getMotor() {
		return motor;
	}

}

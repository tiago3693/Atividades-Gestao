package carro;

public class Manual {
	private CarroTipo tipo;
	private int assentos;
	private CarroMotor motor;
	
	public Manual(CarroTipo tipo, int assentos, CarroMotor motor) {
		super();
		this.tipo = tipo;
		this.assentos = assentos;
		this.motor = motor;
	}
	
	public String print() {
		return "Tipo de carro: " + tipo
				+"\nAssentos: " + assentos
				+"\nCilindrada do motor: " + motor.getCilindrada();
	}
}

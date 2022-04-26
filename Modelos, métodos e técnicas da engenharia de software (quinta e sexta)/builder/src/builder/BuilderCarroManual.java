package builder;

import carro.CarroMotor;
import carro.CarroTipo;
import carro.Manual;
import interf.BuilderInterface;

public class BuilderCarroManual implements BuilderInterface {
	private CarroTipo tipo;
	private int assentos;
	private CarroMotor motor;
	
	public void setTipo(CarroTipo tipo) {
		this.tipo = tipo;
	}
	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	public void setMotor(CarroMotor motor) {
		this.motor = motor;
	}
	
	public Manual novoManual() {
		return new Manual(tipo, assentos, motor);
	}
}

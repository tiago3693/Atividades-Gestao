package builder;

import carro.Carro;
import carro.CarroMotor;
import carro.CarroTipo;
import interf.BuilderInterface;

public class BuilderCarro implements BuilderInterface{
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
	
	public Carro novoCarro() {
		return new Carro(tipo, assentos, motor);
	}
}

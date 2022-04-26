package builder;

import carro.CarroMotor;
import carro.CarroTipo;
import interf.BuilderInterface;

public class BuilderDiretor {
	public void construirCarroConversivel(BuilderInterface builder) {
		builder.setTipo(CarroTipo.Carro_Conversivel);
		builder.setAssentos(4);
		builder.setMotor(new CarroMotor(3));;
	}
	
	public void construirCarroSeda(BuilderInterface builder) {
		builder.setTipo(CarroTipo.Carro_Seda);
		builder.setAssentos(4);
		builder.setMotor(new CarroMotor(2));;
	}
	
	public void construirSUV(BuilderInterface builder) {
		builder.setTipo(CarroTipo.SUV);
		builder.setAssentos(4);
		builder.setMotor(new CarroMotor(4));;
	}
}

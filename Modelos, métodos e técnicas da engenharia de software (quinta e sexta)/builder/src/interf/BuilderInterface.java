package interf;

import carro.CarroMotor;
import carro.CarroTipo;

public interface BuilderInterface {
	void setTipo(CarroTipo tipo);
    void setAssentos(int assentos);
    void setMotor(CarroMotor motor);
}

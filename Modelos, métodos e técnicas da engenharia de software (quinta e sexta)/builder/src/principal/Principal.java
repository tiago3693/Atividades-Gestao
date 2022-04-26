package principal;

import builder.BuilderCarro;
import builder.BuilderCarroManual;
import builder.BuilderDiretor;
import carro.Carro;
import carro.CarroMotor;
import carro.CarroTipo;
import carro.Manual;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuilderDiretor diretor = new BuilderDiretor();
		
		BuilderCarro builderCarro = new BuilderCarro();
		diretor.construirCarroConversivel(builderCarro);
		Carro carro = builderCarro.novoCarro();
		
		
		BuilderCarroManual builderManual = new BuilderCarroManual();
		diretor.construirCarroConversivel(builderManual);
		Manual manual = builderManual.novoManual();
		
		System.out.println(manual.print());
		
		
		
		builderManual.setAssentos(1);
		builderManual.setTipo(CarroTipo.Carro_Seda);
		builderManual.setMotor(new CarroMotor(5));
		
		Manual manual2 = builderManual.novoManual();
		
		System.out.println(manual2.print());
	}

}

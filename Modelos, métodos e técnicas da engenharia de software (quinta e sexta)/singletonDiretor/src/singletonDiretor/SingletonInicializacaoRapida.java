package singletonDiretor;

public class SingletonInicializacaoRapida {

	private static final SingletonInicializacaoRapida instancia = new SingletonInicializacaoRapida();

	private SingletonInicializacaoRapida() {
	}

	public static SingletonInicializacaoRapida getInstancia() {
		return instancia;
	}
}
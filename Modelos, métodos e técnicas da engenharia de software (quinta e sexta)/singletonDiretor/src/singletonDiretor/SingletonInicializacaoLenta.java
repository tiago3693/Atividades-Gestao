package singletonDiretor;

public class SingletonInicializacaoLenta {

	private static SingletonInicializacaoLenta instancia = new SingletonInicializacaoLenta();
	
	private SingletonInicializacaoLenta() {}
	
	public static SingletonInicializacaoLenta getInstancia() {
		if(instancia == null) {
			instancia = new SingletonInicializacaoLenta();
		}
		return instancia;
	}
	
}

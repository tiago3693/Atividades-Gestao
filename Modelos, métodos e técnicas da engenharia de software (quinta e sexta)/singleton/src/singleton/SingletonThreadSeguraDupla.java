package singleton;

public class SingletonThreadSeguraDupla {

	private static SingletonThreadSeguraDupla instancia;

	private SingletonThreadSeguraDupla() {
	}

	public static synchronized SingletonThreadSeguraDupla getInstancia() {
		if (instancia == null) {
			synchronized (SingletonThreadSeguraDupla.class) {
				if (instancia == null) {
					instancia = new SingletonThreadSeguraDupla();
				}
			}
		}
		return instancia;
	}

}

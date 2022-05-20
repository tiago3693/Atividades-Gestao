package singletonDiretor;

public class SingletonBlocoEstatico {
	
	private static SingletonBlocoEstatico instancia;
	
	private SingletonBlocoEstatico() {}
	
	static {
		try {
			instancia = new SingletonBlocoEstatico();
		} catch(Exception e) {
			throw new RuntimeException("Erro ao criar objeto");
		}
	}
	
	public static SingletonBlocoEstatico getInstancia() {
		return instancia;
	}

}

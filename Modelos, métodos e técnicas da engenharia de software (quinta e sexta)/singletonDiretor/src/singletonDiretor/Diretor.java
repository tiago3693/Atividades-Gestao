package singletonDiretor;

public class Diretor {
	private static String nome;
	private static Diretor instanciaUnica;

	private Diretor() {}

	public static synchronized Diretor getInstancia() {
		if (instanciaUnica == null) {
			instanciaUnica = new Diretor();
		}
		return instanciaUnica;
	}

	public static String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
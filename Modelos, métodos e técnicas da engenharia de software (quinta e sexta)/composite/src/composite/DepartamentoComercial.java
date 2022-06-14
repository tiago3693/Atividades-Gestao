package composite;

public class DepartamentoComercial implements Departamento {
	private String nome;
	private int id;

	public DepartamentoComercial(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	// Imprime os detalhes dessa classe
	@Override
	public void imprimeDetalhesDepartamento() {
		System.out.println("id: " + id + " | nome: " + nome);
	}
}

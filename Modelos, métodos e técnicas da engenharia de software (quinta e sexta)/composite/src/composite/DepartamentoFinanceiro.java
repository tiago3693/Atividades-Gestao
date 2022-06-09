package composite;

public class DepartamentoFinanceiro implements Departamento {
	private String nome;
	private int id;

	public DepartamentoFinanceiro(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	
	// Imprime os detalhes dessa classe
	@Override
	public void imprimeDetalhesDepartamento() {
		System.out.println("id: " + id + " | nome: " + nome);
	}
}

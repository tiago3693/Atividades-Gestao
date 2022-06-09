package composite;

import java.util.ArrayList;
import java.util.List;

// Molde para as classes Composite (que vão delegar/organizar)

public class DepartamentoChefe implements Departamento {
	
	// Lista para agrupar classes Folha (que vão manipular e manter os dados)
	private List<Departamento> listaDepartamento = new ArrayList<Departamento>();

	// Imprime os detalhes das classes filhas
	@Override
	public void imprimeDetalhesDepartamento() {
		for (Departamento dep : listaDepartamento) {
			dep.imprimeDetalhesDepartamento();
		}
	}

	// Adiciona uma Folha a lista de Folhas acima
	public void addDepartamento(Departamento dep) {
		listaDepartamento.add(dep);
	}

	// Remove uma Folha da lista de Folhas acima
	public void removeDepartamento(Departamento dep) {
		listaDepartamento.remove(dep);
	}
}

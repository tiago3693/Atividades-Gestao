package composite;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoChefe implements Departamento {
	private List<Departamento> listaDepartamento = new ArrayList<Departamento>();

	@Override
	public void imprimeDetalhesDepartamento() {
		for (Departamento dep : listaDepartamento) {
			dep.imprimeDetalhesDepartamento();
		}
	}

	public void addDepartamento(Departamento dep) {
		listaDepartamento.add(dep);
	}

	public void removeComponentInterface(Departamento dep) {
		listaDepartamento.remove(dep);
	}
}

package composite;

public class Main {

	public static void main(String[] args) {

		// Cria 2 departamentos da classe Folha "DepartamentoComercial"
		DepartamentoComercial dep1 = new DepartamentoComercial(1, "Departamento de vendas de cosmeticos");
		DepartamentoComercial dep2 = new DepartamentoComercial(2, "Departamento de vendas de eletronicos");

		// Cria 1 departamento da classe Composite "DepartamentoChefe" para delegar os
		// dois departamentos comerciais
		DepartamentoChefe depChefeComercial = new DepartamentoChefe();

		// Adiciona os 2 departamentos Folha para a lista do objeto "depChefeComercial"
		depChefeComercial.addDepartamento(dep1);
		depChefeComercial.addDepartamento(dep2);

		// Cria 2 departamentos da classe Folha "DepartamentoFinanceiro"
		DepartamentoFinanceiro dep3 = new DepartamentoFinanceiro(3, "Departamento financeiro de cosmeticos");
		DepartamentoFinanceiro dep4 = new DepartamentoFinanceiro(4, "Departamento financeiro de eletronicos");

		// Cria 1 departamento da classe Composite "DepartamentoChefe" para delegar os
		// dois departamentos financeiros
		DepartamentoChefe depChefeFinanceiro = new DepartamentoChefe();

		// Adiciona os 2 departamentos Folha para a lista do objeto "depChefeFinanceiro"
		depChefeFinanceiro.addDepartamento(dep3);
		depChefeFinanceiro.addDepartamento(dep4);

		// Cria 1 departamento da classe Composite "DepartamentoChefe" para delegar os
		// dois departamentos chefes (comercial e financeiro)
		DepartamentoChefe depChefe = new DepartamentoChefe();

		// Adiciona os 2 departamentos Composite para a lista do objeto "depChefe"
		depChefe.addDepartamento(depChefeComercial);
		depChefe.addDepartamento(depChefeFinanceiro);

		// Imprime os detalhes das classes Folha ultilizando o objeto Composite
		// "depChefe"
		depChefe.imprimeDetalhesDepartamento();
	}

}

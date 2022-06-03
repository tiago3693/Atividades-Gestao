package composite;

public class Main {

	public static void main(String[] args) {
		DepartamentoComercial dep1 = new DepartamentoComercial(1, "Departamento de vendas de cosmeticos");
        DepartamentoComercial dep2 = new DepartamentoComercial(2, "Departamento de vendas de eletronicos");
        
        DepartamentoChefe depChefeComercial = new DepartamentoChefe();
        depChefeComercial.addDepartamento(dep1);
        depChefeComercial.addDepartamento(dep2);
        
        DepartamentoFinanceiro dep3 = new DepartamentoFinanceiro(3, "Departamento financeiro de cosmeticos");
        DepartamentoFinanceiro dep4 = new DepartamentoFinanceiro(4, "Departamento financeiro de eletronicos");
        
        DepartamentoChefe depChefeFinanceiro = new DepartamentoChefe();
        depChefeFinanceiro.addDepartamento(dep3);
        depChefeFinanceiro.addDepartamento(dep4);
        
        
        DepartamentoChefe depChefe = new DepartamentoChefe();
        depChefe.addDepartamento(depChefeComercial);
        depChefe.addDepartamento(depChefeFinanceiro);
        depChefe.imprimeDetalhesDepartamento();
	}

}

package pratica_11_2;

public class PessoaFisica extends Pessoa{
	
	private int CPF;

	public PessoaFisica(String nome, int CPF) {
		super(nome);
		this.CPF = CPF;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int CPF) {
		this.CPF = CPF;
	}
		
}	

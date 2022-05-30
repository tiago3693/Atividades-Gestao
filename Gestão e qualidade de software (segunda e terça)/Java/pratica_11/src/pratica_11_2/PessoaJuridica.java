package pratica_11_2;

public class PessoaJuridica extends Pessoa{
	
	private int CNPJ;

	public PessoaJuridica(String nome, int CNPJ) {
		super(nome);
		this.CNPJ = CNPJ;
	}

	public int getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(int CNPJ) {
		this.CNPJ = CNPJ;
	}
		
}	

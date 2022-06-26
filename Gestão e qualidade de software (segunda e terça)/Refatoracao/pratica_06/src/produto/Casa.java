package produto;

public class Casa extends Produto {


	public Casa(int codigo, String nome, String tipo, double valor, boolean desconto) {
		super(codigo, nome, tipo, valor, desconto);
		// TODO Auto-generated constructor stub
	}
	

	
	@Override
	public double getValor() {
		if (temDesconto()) {
			return getValor() * 0.97;
		} else {
			return getValor();
		}
	}
}

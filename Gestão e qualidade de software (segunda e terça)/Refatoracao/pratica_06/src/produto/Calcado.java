package produto;

public class Calcado extends Produto {

	public Calcado(int codigo, String nome, String tipo, double valor, boolean desconto) {
		super(codigo, nome, tipo, valor, desconto);

		// TODO Auto-generated constructor stub
	}

	@Override
	public double getValor() {
		if (temDesconto()) {
			return getValor() * 0.96;
		} else {
			return getValor();
		}
	}
}

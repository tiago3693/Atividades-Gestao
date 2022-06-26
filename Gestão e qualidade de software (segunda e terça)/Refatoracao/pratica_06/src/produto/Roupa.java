package produto;

public class Roupa extends Produto {
	public Roupa(int codigo, String nome, String tipo, double valor, boolean desconto) {
		super(codigo, nome, tipo, valor, desconto);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getValor() {
		if (temDesconto()) {
			return getValor() * 0.95;
		} else {
			return getValor();
		}
	}
}

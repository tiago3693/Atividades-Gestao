package decoratorCardapio;

public class Acai implements Adicional {

	/*enum tamanho {
		p, m, g
	}*/
	private Character tamanho;
	
	public Acai(Character tamanho) {
		this.tamanho = tamanho;
	}

	private String descricao = "açai";
	private float custoI = 10;

	@Override
	public String getDescricao() {
		return descricao;
	}

	@Override
	public float custo() {
		return custoI;
	}
	
	public Character tamanho() {
		return tamanho;
	}
	
	
}
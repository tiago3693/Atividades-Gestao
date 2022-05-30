package decoratorCardapio;

public class Acai implements Adicional {

	/*enum tamanho {
		p, m, g
	}*/
	private Character tamanho;
	private float custoI;
	
	public Acai(Character tamanho) {
		this.tamanho = tamanho;
		if (tamanho.equals('p')) {
			this.custoI = 10;
		} else if (tamanho.equals('m')) {
			this.custoI = 15;
		} else if (tamanho.equals('g')) {
			this.custoI = 20;
		}
	}

	private String descricao = "açai";
	

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
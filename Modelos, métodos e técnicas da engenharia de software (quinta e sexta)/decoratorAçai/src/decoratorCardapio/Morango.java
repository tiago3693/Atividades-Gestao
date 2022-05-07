package decoratorCardapio;

public class Morango extends BaseDecorator{
	
	public Morango(Adicional add) {
		super(add);
	}
	
	@Override
	public String getDescricao() {
		return super.getDescricao() + ", morango";
	}
	
	@Override
	public float custo() {
		if (super.tamanho().equals('p'))
		return super.custo() + 2;
		else if (super.tamanho().equals('m'))
		return super.custo() + 4;
		else if (super.tamanho().equals('g'))
		return super.custo() + 6;
		else 
		return super.custo();
	}
}

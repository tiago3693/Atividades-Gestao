package decoratorCardapio;

public class LeiteCondensado extends BaseDecorator{
	
	public LeiteCondensado(Adicional add) {
		super(add);
	}
	
	@Override
	public String getDescricao() {
		return super.getDescricao() + ", leite condensado";
	}
	
	@Override
	public float custo() {
		if (super.tamanho().equals('p'))
		return super.custo() + 2.5f;
		else if (super.tamanho().equals('m'))
		return super.custo() + 4.5f;
		else if (super.tamanho().equals('g'))
		return super.custo() + 6.5f;
		else 
		return super.custo();
	}
}

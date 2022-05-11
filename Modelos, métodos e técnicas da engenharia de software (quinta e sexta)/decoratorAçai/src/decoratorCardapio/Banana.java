package decoratorCardapio;

public class Banana extends BaseDecorator{
	
	public Banana(Adicional add) {
		super(add);
	}
	
	@Override
	public String getDescricao() {
		return super.getDescricao() + ", banana";
	}
	
	@Override
	public float custo() {

		if (super.tamanho().equals('p'))
		return super.custo() + 3.7f;
		else if (super.tamanho().equals('m'))
		return super.custo() + 6.7f;
		else if (super.tamanho().equals('g'))
		return super.custo() + 9.7f;
		else 
		return super.custo();
	}
}

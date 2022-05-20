package decorator;

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
		return super.custo() + 2.5f;
	}
}

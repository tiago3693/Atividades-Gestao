package decorator;

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
		return super.custo() + 3.7f;
	}
}

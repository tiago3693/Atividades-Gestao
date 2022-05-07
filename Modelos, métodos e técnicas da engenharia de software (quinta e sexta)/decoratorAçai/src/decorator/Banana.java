package decorator;

public class Banana extends BaseDecorator{
	
	public Banana(Adicional add) {
		super(add);
	}
	
	@Override
	public String getDescricão() {
		return super.getDescricão() + ", banana";
	}
	
	@Override
	public float custo() {
		return super.custo() + 3.7f;
	}
}

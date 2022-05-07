package decorator;

public class Morango extends BaseDecorator{
	
	public Morango(Adicional add) {
		super(add);
	}
	
	@Override
	public String getDescricão() {
		return super.getDescricão() + ", morango";
	}
	
	@Override
	public float custo() {
		return super.custo() + 2;
	}
}

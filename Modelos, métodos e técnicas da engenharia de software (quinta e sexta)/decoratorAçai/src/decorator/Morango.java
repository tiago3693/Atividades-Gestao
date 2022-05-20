package decorator;

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
		return super.custo() + 2;
	}
}

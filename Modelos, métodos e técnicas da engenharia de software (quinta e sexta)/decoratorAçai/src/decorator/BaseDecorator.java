package decorator;

public class BaseDecorator implements Adicional {

	private Adicional wrapper;
	
	public BaseDecorator(Adicional add) {
		this.wrapper = add;
	}
	
	@Override
	public String getDescricao() {
		return wrapper.getDescricao();
	}
	
	@Override
	public float custo() {
		return wrapper.custo();
	}
	
}

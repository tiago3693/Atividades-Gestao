package formas;

public class Circulo extends Forma {
	public int radius;

	public Circulo() {
	}

	public Circulo(Circulo tipo) {
		super(tipo);
		if (tipo != null) {
			this.radius = tipo.radius;
		}
	}

	@Override
	public Forma clone() {
		return new Circulo(this);
	}

}

package formas;

public abstract class Forma {
	public int x;
    public int y;
    public String cor;

    public Forma() {
    }

    public Forma(Forma tipo) {
        if (tipo != null) {
            this.x = tipo.x;
            this.y = tipo.y;
            this.cor = tipo.cor;
        }
    }

    public abstract Forma clone();
}

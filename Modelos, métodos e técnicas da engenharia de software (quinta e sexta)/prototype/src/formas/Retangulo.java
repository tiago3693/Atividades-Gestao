package formas;

public class Retangulo extends Forma {
    public int width;
    public int height;

    public Retangulo() {
    }

    public Retangulo(Retangulo tipo) {
        super(tipo);
        if (tipo != null) {
            this.width = tipo.width;
            this.height = tipo.height;
        }
    }

    @Override
    public Forma clone() {
        return new Retangulo(this);
    }

}

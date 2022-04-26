package singleton;

public class CaldeiraChocolate {

	/*
	 * private static SingletonThreadSegura instancia;
	 * 
	 * private SingletonThreadSegura() { }
	 * 
	 * private static synchronized SingletonThreadSegura getInstancia() { if
	 * (instancia == null) { instancia = new SingletonThreadSegura(); } return
	 * instancia; }
	 */
	private static boolean vazia;
	private static boolean fervida;

	private static CaldeiraChocolate instancia;

	private CaldeiraChocolate(/*boolean vazia, boolean fervida*/) {
		/*
		 * vazia = this.vazia; fervida = this.fervida;
		 */
		this.vazia = true;
		this.fervida = false;
	}

	public static synchronized CaldeiraChocolate getInstancia() {
		if (instancia == null) {
			instancia = new CaldeiraChocolate();
		}
		return instancia;
	}

	/*
	 * CaldeiraChocolate() { vazia = true; fervida = false; }
	 */

	public static boolean estaVazia() {
		//System.out.println(vazia);
		return vazia;
	}

	public static boolean estaFervida() {
		System.out.println(fervida);
		return fervida;
	}

	public static void preencher() {
		if (estaVazia()) {
			vazia = false;
			fervida = false;
			// preencher a caldeira com leite e chocolate
		}
	}

	public static void drenar() {
		if (!estaVazia() && estaFervida()) {
			// drenar o leite e chocolate fervidos
			vazia = true;
		}
	}

	public static void ferver() {
		if (!estaVazia() && !estaFervida()) {
			// colocar em ebulição
			fervida = true;
		}
	}
}

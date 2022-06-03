package singletonDiretor;

public class SingletonThreadSegura {

	private static SingletonThreadSegura instancia;

	private SingletonThreadSegura() {
	}

	public static synchronized SingletonThreadSegura getInstancia() {
		if (instancia == null) {
			instancia = new SingletonThreadSegura();
		}
		return instancia;
	}

	/*public class CaldeiraChocolate {
		private boolean vazia;
		private boolean fervida;

		CaldeiraChocolate() {
			vazia = true;
			fervida = false;
		}

		public boolean estaVazia() {
			return vazia;
		}

		public boolean estaFervida() {
			return fervida;
		}

		public void preencher() {
			if (estaVazia()) {
				vazia = false;
				fervida = false;
				// preencher a caldeira com leite e chocolate
			}
		}

		public void drenar() {
			if (!estaVazia() && estaFervida()) {
				// drenar o leite e chocolate fervidos
				vazia = true;
			}
		}

		public void ferver() {
			if (!estaVazia() && !estaFervida()) {
				// colocar em ebulição
				fervida = true;
			}
		}
	}*/
}

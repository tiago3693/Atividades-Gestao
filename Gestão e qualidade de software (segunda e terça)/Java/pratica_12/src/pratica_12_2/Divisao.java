package pratica_12_2;

public class Divisao extends ArithmeticException{

	private int num1;
	private int num2;

	public Divisao(int num1, int num2) {
		super("N�o � possivel dividir por 0 !!!");
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int dividir() {
		if(num2 == 0)
			throw new Divisao(num1, num2);
		else
			return num1/num2;
	}

	/*
	 * System.out.println("resultado " + num1 / num2); if (Float.isInfinite((num1 /
	 * num2))) { throw new ArithmeticException("N�o � possivel dividir por 0 !"); }
	 */
}

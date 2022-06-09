package main;

public class Calculadora {

	public static int calcular(String cal) {
		String[] calculo = cal.trim().replaceAll(" +", " ").split(" ");
		int a = Integer.parseInt(calculo[0]);
		int b = Integer.parseInt(calculo[2]);

		switch (calculo[1]) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "/":
			return a / b;
		case "*":
			return a * b;
		default:
			return 0;
		}
	}
}

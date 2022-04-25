package pratica_03;

import java.util.Scanner;

public class Pratica_03_4 {

	public static void pratica() {
		Scanner scanner = new Scanner(System.in);
		float salario;
		do {
		System.out.println("salario: ");
		salario = scanner.nextFloat();
		
		System.out.println("salario + aumento: " + salario * 1.25);
		} while (salario != -1);
	}

}

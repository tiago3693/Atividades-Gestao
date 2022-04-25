package pratica_03;

import java.util.Scanner;

public class Pratica_03_7 {

	public static void pratica() {
		Scanner scanner = new Scanner(System.in);
		float salarioM, salario;
		do {
		System.out.println("salario minimo: ");
		salarioM = scanner.nextFloat();
		
		System.out.println("salario: ");
		salario = scanner.nextFloat();
		
		System.out.println("quantidade salarios minimos: " + (salario/salarioM));
		} while (salarioM != -1 && salario != -1);
	}

}

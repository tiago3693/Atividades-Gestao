package pratica_04;

import java.util.Scanner;

public class Pratica_04_7 {

	public static void pratica() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("salario minimo: ");
		float salarioM = scanner.nextFloat();
		
		System.out.println("salario: ");
		float salario = scanner.nextFloat();
		
		System.out.println("quantidade salarios minimos: " + (salario/salarioM));

	}

}

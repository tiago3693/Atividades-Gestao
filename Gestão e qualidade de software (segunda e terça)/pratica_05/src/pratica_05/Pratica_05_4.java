package pratica_05;

import java.util.Scanner;

public class Pratica_05_4 {

	public static void pratica() {
		Scanner scan = new Scanner(System.in);
		float salario = 0, salarioT = 0, filhos = 0, filhosT = 0, x = 0;

		while (salario >= 0) {

			System.out.println("\nsalario: ");
			salario = scan.nextFloat();

			if (salario >= 0) {

				System.out.println("filhos: ");
				filhos = scan.nextFloat();
				
				x++;
				salarioT = salario + salarioT;
				filhosT	= filhosT + filhos;
				System.out.println("media salarial população: " + salarioT/x);
				System.out.println("media de filhos população: " + filhosT/x);
				
				
			}

		}
	}
}

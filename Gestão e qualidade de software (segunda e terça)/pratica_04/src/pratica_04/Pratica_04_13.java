package pratica_04;

import java.util.Scanner;

public class Pratica_04_13 {

	public static void pratica() {
		Scanner scan = new Scanner(System.in);
		String num1;
		int num2;
		do {
		System.out.print("Digite o tipo de apartamento (simples / duplo): ");
		num1 = scan.next();

		System.out.print("Digite a quantidade de dias: ");
		num2 = scan.nextInt();

		apartamento(num1, num2);
		} while (!num1.equals("-1") && num2 != -1);
		}

	public static void apartamento(String ap, int qtd) {
		ap = ap.toLowerCase();
		if (ap.equals("simples") && qtd < 10 || ap.equals("duplo") && qtd > 15) {
			System.out.println("total: " + qtd * 100);
		} else if (ap.equals("simples") && qtd >= 10 && qtd <= 15) {
			System.out.println("total: " + qtd * 90);
		} else if (ap.equals("simples") && qtd > 15) {
			System.out.println("total: " + qtd * 90);
		} else if (ap.equals("duplo") && qtd < 10) {
			System.out.println("total: " + qtd * 140);
		} else if (ap.equals("duplo") && qtd >= 10 && qtd <= 15) {
			System.out.println("total: " + qtd * 120);
		}
	}
}

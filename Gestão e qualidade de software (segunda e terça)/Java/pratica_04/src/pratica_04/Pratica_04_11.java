package pratica_04;

import java.util.Iterator;
import java.util.Scanner;

public class Pratica_04_11 {

	public static void pratica() {
		Scanner scan = new Scanner(System.in);
		int num1;
		do {
			System.out.print("Digite a quantidade de dias: ");
			num1 = scan.nextInt();

			diaria(num1);
		} while (num1 != -1);
	}

	public static void diaria(int num1) {
		if (num1 < 15) {
			System.out.println(500 + 15 * num1);
		} else if (num1 == 15) {
			System.out.println(500 + 10 * num1);
		} else if (num1 > 15) {
			System.out.println(500 + 5 * num1);
		}
	}
}

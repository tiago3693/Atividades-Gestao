package pratica_07;

import java.util.Scanner;

public class Pratica_07_4 {

	public static void pratica() {
		Scanner scan = new Scanner(System.in);
		int num1 = 0, total = 0;
		
		for (int i = 1; num1 != -1; i++) {
			System.out.print("Digite a idade: ");
			num1 = scan.nextInt();
			total += num1;
			System.out.println("media das idades: " + total/i);
		}
	}
}

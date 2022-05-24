package pratica_07;

import java.util.Scanner;

public class Pratica_07_2 {

	public static void pratica() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Selecione o numero inicial: ");
		int num1 = scan.nextInt();
		
		System.out.print("Selecione o numero final: ");
		int num2 = scan.nextInt();
		for (int i = 0; num1 <= num2; num1++) {
			System.out.println(num1);
		}
	}
}

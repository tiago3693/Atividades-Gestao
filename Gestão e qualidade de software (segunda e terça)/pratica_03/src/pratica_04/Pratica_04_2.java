package pratica_04;

import java.util.Scanner;

public class Pratica_04_2 {

	public static void pratica() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ano nascimento: ");
		int anon = scanner.nextInt();

		System.out.println("ano atual: ");
		int anoa = scanner.nextInt();

		System.out.println("idade: " + (anoa - anon));
		System.out.println("idade em 2050: " + (2050 - anon));
	}

}

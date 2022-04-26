package pratica_03;

import java.util.Scanner;

public class Pratica_03_2 {

	public static void pratica() {
		Scanner scanner = new Scanner(System.in);
		int anon, anoa;
		do {
		System.out.println("ano nascimento: ");
		anon = scanner.nextInt();

		System.out.println("ano atual: ");
		anoa = scanner.nextInt();

		System.out.println("idade: " + (anoa - anon));
		System.out.println("idade em 2050: " + (2050 - anon));
		} while (anon != -1 && anoa != -1);
		}

}

package pratica_04;

import java.util.Scanner;

public class Pratica_04_1 {

	public static void pratica() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("notas: ");
		int nota1 = scanner.nextInt();
		int nota2 = scanner.nextInt();
		int nota3 = scanner.nextInt();

		System.out.format("Media: %.2f \n\n", media(nota1, nota2, nota3));
	}

	public static float media(int a, int b, int c) {
		float media;
		media = a + b + c / 3;
		return media;
	}
}

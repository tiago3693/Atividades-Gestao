package pratica_03;

import java.util.Scanner;

public class Pratica_03_1 {

	public static void pratica() {
		int nota1, nota2, nota3;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("notas: ");
			nota1 = scanner.nextInt();
			nota2 = scanner.nextInt();
			nota3 = scanner.nextInt();

			System.out.format("Media: %.2f \n\n", media(nota1, nota2, nota3));
		} while (nota1 != -1 && nota2 != -1 && nota3 != -1);
	}

	public static float media(int a, int b, int c) {
		float media;
		media = a + b + c / 3;
		return media;
	}
}

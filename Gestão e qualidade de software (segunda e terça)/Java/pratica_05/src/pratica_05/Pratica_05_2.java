package pratica_05;

import java.util.Scanner;

public class Pratica_05_2 {

	public static void pratica() {
		Scanner scan = new Scanner(System.in);
		float matr = 0, nota1 = 0, nota2 = 0, nota3 = 0, media;

		while (matr >= 0) {

			System.out.println("\nmatricula: ");
			matr = scan.nextInt();

			if (matr >= 0) {

				System.out.println("nota: ");
				nota1 = scan.nextFloat();

				System.out.println("nota: ");
				nota2 = scan.nextFloat();

				System.out.println("nota: ");
				nota3 = scan.nextFloat();

				media = (nota1 + nota2 + nota3) / 3;
				if (media >= 70) {
					System.out.println("aprovado");
				} else if (media >= 60 || media < 70) {
					System.out.println("recuperação");
				} else if (media < 60) {
					System.out.println("reprovado");
				}

			}
		}

	}

}

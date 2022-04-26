package pratica_05;

import java.util.Scanner;

public class Pratica_05_1 {

	public static void pratica() {
		Scanner scan = new Scanner(System.in);
		float nota = 0, maiorN = 0, menorN = 100, y = 0, x = 0, media;
		int nota90 = 0, nota70 = 0, faltas = 0;

		while (nota >= 0) {

			System.out.println("\nnota final: ");
			nota = scan.nextFloat();

			if (nota >= 0) {

				System.out.println("total de faltas: ");
				faltas = scan.nextInt();

				if (nota >= 90) {
					nota90++;
				}
				if (nota < 70 || faltas >= 20) {
					nota70++;
				}
				if (nota > maiorN) {
					maiorN = nota;
				}
				if (nota < menorN) {
					menorN = nota;
				}
				x++;
				y = nota + y;
				media = y / x;
				
				System.out.println("quantidade de notas maior ou igual a 90: " + nota90 
						+ "\nreprovados: " + nota70
						+ "\nmaior nota: " + maiorN + " menor nota: " + menorN
						+ "\nmedia das notas: " + media);
			}
		}

	}

}

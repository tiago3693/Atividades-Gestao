package pratica_05;

import java.util.Scanner;

public class Pratica_05_3 {

	public static void pratica() {
		Scanner scan = new Scanner(System.in);
		float canal = -1, pessoas = 0, pessoasT = 0, canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0;

		while (canal != 0) {

			System.out.println("\ncanal: ");
			canal = scan.nextFloat();

			if (canal != 0 || canal != 4 || canal != 5 || canal != 7 || canal != 12) {

				System.out.println("pessoas assistindo: ");
				pessoas = scan.nextFloat();

				pessoasT = pessoas + pessoasT;
				if (canal == 4) {
					canal4 = pessoas + canal4;
					System.out.println("audiencia: " + (canal4 / pessoasT)*100 + "%");
				} else if (canal == 5) {
					canal5 = pessoas + canal5;
					System.out.println("audiencia: " + (canal5 / pessoasT)*100 + "%");
				} else if (canal == 7) {
					canal7 = pessoas + canal7;
					System.out.println("audiencia: " + (canal7 / pessoasT)*100 + "%");
				} else if (canal == 12) {
					canal12 = pessoas + canal12;
					System.out.println("audiencia: " + (canal12 / pessoasT)*100 + "%");
				}
			}

		}
	}
}

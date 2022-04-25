package pratica_04;

import java.util.Iterator;
import java.util.Scanner;

public class Pratica_04_9 {

	public static void pratica() {
		Scanner scan = new Scanner(System.in);
		String sair;
		do {
			String produto[][] = { { "Mercurio", "3,7" }, { "Venus", "8,8" }, { "Terra", "9,8" }, { "Marte", "3,8" },
					{ "Jupiter", " 26,4" }, { "Saturno", "11,5" }, { "Urano", "9,3" }, { "Neturno", " 12,2" },
					{ "Plutao", "0,6" } };

			for (String[] i : produto) {
				System.out.print(i[0] + " | " + i[1] + "\n");
			}

			System.out.print("Escolha o planeta: ");
			String num1 = scan.nextLine();

			System.out.print("Digite a velocidade: ");
			float v = scan.nextFloat();

			System.out.print("Digite o instante: ");
			float t = scan.nextFloat();

			for (String[] i : produto) {
				if (num1.toLowerCase().equals(i[0].toLowerCase())) {
					float g = Float.parseFloat(i[1].replace(",", "."));
					System.out.print(i[0] + " | " + i[1] + " | " + "\nvelocidade: " + (v - g * t) + "\naltura: "
							+ (v * t - (g * t * t) / 2));
				}
			}

			System.out.println("sair ?: (S ou N)");
			sair = scan.next();
		} while (!sair.equalsIgnoreCase("S"));
	}
}

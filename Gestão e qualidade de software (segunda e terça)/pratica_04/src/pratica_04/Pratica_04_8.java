package pratica_04;

import java.util.Iterator;
import java.util.Scanner;

public class Pratica_04_8 {

	public static void pratica() {
		Scanner scan = new Scanner(System.in);
		String sair;
		do {
			System.out.print("Digite codigo do produto: ");
			String num1 = scan.nextLine();

			String produto[][] = { { "1", "sapato", "99,99" }, { "2", "bolsa", "103,89" }, { "3", "camisa", "49,98" },
					{ "4", "calça", "89,72" }, { "5", "blusa", " 97,35" } };

			for (String[] i : produto) {
				if (num1.equals(i[0])) {
					System.out.print(i[0] + " | " + i[1] + " | " + i[2]);
				}
			}

			System.out.println("sair ?: (S ou N)");
			sair = scan.next();
		} while (!sair.equalsIgnoreCase("S"));
	}
}

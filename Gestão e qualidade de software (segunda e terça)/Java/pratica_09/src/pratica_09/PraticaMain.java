package pratica_09;

import java.util.Scanner;

public class PraticaMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Selecione a quest?o: ");
		int num1 = scan.nextInt();
		System.out.println();
		switch (num1) {
		case 1:
			Pratica_09_1.pratica();
			break;
		case 2:
			Pratica_09_2.pratica();
			break;
		case 3:
			Pratica_09_3.pratica();
			break;
		case 4:
			Pratica_09_4.pratica();
			break;
		}

		scan.close();

	}

}

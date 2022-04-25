package pratica_05;

import java.util.Scanner;

public class PraticaMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Selecione a questão: ");
		int num1 = scan.nextInt();
		System.out.println();
		switch (num1) {
		case 1:
			Pratica_05_1.pratica();
			break;
		case 2:
			Pratica_05_2.pratica();
			break;
		case 3:
			Pratica_05_3.pratica();
			break;
		case 4:
			Pratica_05_4.pratica();
			break;
		}

		scan.close();

	}

}

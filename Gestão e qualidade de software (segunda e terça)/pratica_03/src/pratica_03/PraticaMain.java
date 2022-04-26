package pratica_03;

import java.util.Scanner;

public class PraticaMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Selecione a questão: ");
		int num1 = scan.nextInt();
		System.out.println();
		switch (num1) {
		case 1:
			Pratica_03_1.pratica();
			break;
		case 2:
			Pratica_03_2.pratica();
			break;
		case 3:
			Pratica_03_3.pratica();
			break;
		case 4:
			Pratica_03_4.pratica();
			break;
		case 5:
			Pratica_03_5.pratica();
			break;
		case 6:
			Pratica_03_6.pratica();
			break;
		case 7:
			Pratica_03_7.pratica();
			break;
		case 8:
			Pratica_03_8.pratica();
			break;
		case 9:
			Pratica_03_9.pratica();
			break;
		case 10:
			Pratica_03_10.pratica();
			break;
		case 11:
			Pratica_03_11.pratica();
			break;
		case 12:
			Pratica_03_12.pratica();
			break;
		}

		scan.close();

	}

}

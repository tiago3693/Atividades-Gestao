package pratica_04;

import java.util.Scanner;

public class PraticaMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Selecione a questão: ");
		int num1 = scan.nextInt();
		System.out.println();
		switch (num1) {
		case 1:
			Pratica_04_1.pratica();
			break;
		case 2:
			Pratica_04_2.pratica();
			break;
		case 3:
			Pratica_04_3.pratica();
			break;
		case 4:
			Pratica_04_4.pratica();
			break;
		case 5:
			Pratica_04_5.pratica();
			break;
		case 6:
			Pratica_04_6.pratica();
			break;
		case 7:
			Pratica_04_7.pratica();
			break;
		case 8:
			Pratica_04_8.pratica();
			break;
		case 9:
			Pratica_04_9.pratica();
			break;
		case 10:
			Pratica_04_10.pratica();
			break;
		case 11:
			Pratica_04_11.pratica();
			break;
		case 12:
			Pratica_04_12.pratica();
			break;
		case 13:
			Pratica_04_13.pratica();
			break;
		}

		scan.close();

	}

}

package pratica_12;

import java.util.Scanner;

import pratica_12_2.Pratica_12_2Main;

public class PraticaMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Selecione a questão: ");
		int num1 = scan.nextInt();
		System.out.println();
		switch (num1) {
		case 1:
			//try {
				Pratica_12_1.pratica();
			/*} catch (ArithmeticException e) {
			System.out.println("estou tratando o erro da calsse pratica_12_1");
			System.out.println(e);
			}*/
			break;

		case 2:
			Pratica_12_2Main.pratica();
			break;
		}

		scan.close();

	}

}

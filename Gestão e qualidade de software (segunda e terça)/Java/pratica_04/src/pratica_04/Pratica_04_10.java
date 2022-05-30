package pratica_04;

import java.util.Iterator;
import java.util.Scanner;

public class Pratica_04_10 {

	public static void pratica() {
		Scanner scan = new Scanner(System.in);
		float num1,num2;
		int num3;
		do {
		System.out.print("Digite o numero: ");
		num1 = scan.nextFloat();

		System.out.print("Digite o numero: ");
		num2 = scan.nextFloat();

		System.out.println("1 - Somar os dois números\n" + "2 - Multiplicar os dois números\n"
				+ "3 - Subtrair o número maior pelo número menor\n" + "4 - Dividir o primeiro número pelo segundo");
		System.out.print("Selecione a opção: ");
		 num3 = scan.nextInt();

		menu(num1, num2, num3);
		} while (num1 != -1 && num2 != -1 && num3 != -1);
	}

	public static void menu(float num1, float num2, int num3) {
		switch (num3) {
		case 1: {
			System.out.println(num1 + num2);
			break;
		}
		case 2: {
			System.out.println(num1 * num2);
			break;
		}
		case 3: {
			if (num1 > num2) {
				System.out.println(num1 - num2);
			} else if (num1 < num2) {
				System.out.println(num2 - num1);
			} else {
				System.out.println(0);
			}
			break;
		}
		case 4: {
			if (num2 == 0 ) {
				System.out.println("não é possivel dividir por 0");
			} else {
				System.out.println(num1/num2);
			}
			break;
		}
		}
	}
}

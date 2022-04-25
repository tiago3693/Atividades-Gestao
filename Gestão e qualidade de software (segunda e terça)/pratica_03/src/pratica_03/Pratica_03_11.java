package pratica_03;

import java.util.Scanner;

public class Pratica_03_11 {

	public static void pratica() {
		Scanner scanner = new Scanner(System.in);
		int numero;
		do {
		System.out.println("numero: ");
		numero = scanner.nextInt();
		
		for(int i=0; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero*i);
		}
		} while (numero != -1);
	}

}

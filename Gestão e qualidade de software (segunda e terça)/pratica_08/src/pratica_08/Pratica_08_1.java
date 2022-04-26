package pratica_08;

import java.util.Scanner;

public class Pratica_08_1 {

	public static void pratica() {
		int[] num = new int[10];
		int soma = 0;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < num.length ; i++) {
			 num[i] = scan.nextInt();
			 if (i == (num.length -1)) {
				 for (int j : num) {
					System.out.println("numeros do vetor: " + j);
					if (j%2 == 0) {
						soma += j;
					}
				 }
				 System.out.println("soma dos valores pares: " + soma);
			 }
		}
	}
}

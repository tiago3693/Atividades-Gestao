package pratica_08;

import java.util.Scanner;

public class Pratica_08_2 {

	public static void pratica() {
		float[] num = new float[10];
		int soma = 0;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < num.length ; i++) {
			 num[i] = scan.nextFloat();
			 if (i == (num.length -1)) {
				 for (int j = 0; j < num.length ; j++) {
					System.out.println("numeros do vetor: " + num[j]);
					if (num[j] < 0) {
						System.out.println("posição do vetor que armazena numero negativo: " + j);
					}
				 }
			 }
		}
	}
}

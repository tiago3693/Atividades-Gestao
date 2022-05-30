package pratica_08;

import java.util.Scanner;

public class Pratica_08_3 {

	public static void pratica() {
		float[] num = new float[10];
		float menorN = Float.MAX_VALUE, maiorN = Float.MIN_VALUE;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < num.length ; i++) {
			 num[i] = scan.nextFloat();
			 if (i == (num.length -1)) {
				 for (float j : num) {
					System.out.println("numeros do vetor: " + j);
					if (j < menorN) 
						menorN = j;
					if (j > maiorN)
						maiorN = j;
				 }
				 System.out.println("maior numero: " + maiorN
						 +"\nmenor numero: " + menorN);
			 }
		}
	}
}

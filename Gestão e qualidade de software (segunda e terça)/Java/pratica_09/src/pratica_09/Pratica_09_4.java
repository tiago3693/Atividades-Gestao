package pratica_09;

import java.util.Scanner;

public class Pratica_09_4 {

	public static void pratica() {
		int[][] num = { { 1, 2, 3, 4, 5 }, 
				        { 6, 7, 8, 9, 10 }, 
				        { 11, 12, 13, 14, 15 }, 
				        { 16, 17, 18, 19, 20 },
				        { 21, 22, 23, 24, 25 } 
				      };
		int temp;

		System.out.println("Matriz:");
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++)
				System.out.format("%5s", num[i][j]);
			System.out.println();
		}

		System.out.println("Diagonal principal:");
		for (int i = 0; i < num.length; i++)
			System.out.println(num[i][i]);

		System.out.println("Diagonal secundária:");
		for (int i = 0; i < num.length; i++)
			System.out.println(num[i][num.length - 1 - i]);

		for (int i = 0; i < num.length; i++) {
			temp = num[i][i];
			num[i][i] = num[i][num[i].length - 1 - i];
			num[i][num[i].length - 1 - i] = temp;
			//System.out.println(num[i][num[i].length - 1 - i]);
		}

		System.out.println("Matriz modificada:");
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++)
				System.out.format("%5s", num[i][j]);
			System.out.println();
		}

		System.out.println("Diagonal principal da matriz modificada:");
		for (int i = 0; i < num.length; i++)
			System.out.println(num[i][i]);

		System.out.println("Diagonal secundária da matriz modificada:");
		for (int i = 0; i < num.length; i++)
			System.out.println(num[i][num.length - 1 - i]);
	}
}

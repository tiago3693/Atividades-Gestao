package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a sua opera��o:");
		String c = scan.nextLine();
		System.out.println("Resultado: " + Calculadora.calcular(c));
		scan.close();

	}

}

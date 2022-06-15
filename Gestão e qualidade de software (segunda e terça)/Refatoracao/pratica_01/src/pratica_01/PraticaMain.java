package pratica_01;

import java.util.Scanner;

public class PraticaMain {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		try {
			String opcao = "s";
			do {
				System.out.print("a: ");
				double a = scan.nextInt();

				System.out.print("b: ");
				double b = scan.nextInt();

				System.out.print("c: ");
				double c = scan.nextInt();

				if (a == 0)
					if (b == 0)
						if (c == 0)
							System.out.println("Igualdade confirmada: 0 = 0");
						else
							System.out.println("Coeficientes informados incorretamente.");
					else {
						System.out.println("Esta é uma equação de primeiro grau.");
						System.out.println("x = " + (-c / b));
					}
				else {
					System.out.println("Esta é uma equação de segundo grau.");
					double discr = (b * b) - (4 * a * c);
					if (discr < 0)
						System.out.println("Esta equação não possui raízes reais.");
					else if (discr == 0)
						System.out.println(
								"Esta equação possui duas raízes reais iguais" + "\nx1 = x2 = " + -b / (2 * a));
					else {
						System.out.println("Esta equação possui duas raízes reais diferentes.");
						System.out.println("x1 =" + ((-b + Math.sqrt(discr)) / (2 * a)));
						System.out.println("x2 =" + ((-b - Math.sqrt(discr)) / (2 * a)));
					}
				}
				System.out.println("Deseja continuar ? ");
				opcao = scan.next();
			} while (opcao.equalsIgnoreCase("s"));
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			scan.close();
		}*/
		SegundoGrau.pratica();
	}
}

package slide09retangulo;

import java.util.Scanner;

public class RetanguloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Retangulo ret = new Retangulo();
		Scanner input = new Scanner(System.in);
		System.out.print("Informe a altura do ret�ngulo: ");
		ret.setAltura(input.nextFloat());
		System.out.print("Informe a largura do ret�ngulo: ");
		ret.setLargura(input.nextFloat());
		ret.exibe();
	}

}

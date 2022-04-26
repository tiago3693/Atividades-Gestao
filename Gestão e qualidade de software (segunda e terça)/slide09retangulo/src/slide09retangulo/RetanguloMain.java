package slide09retangulo;

import java.util.Scanner;

public class RetanguloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Retangulo ret = new Retangulo();
		Scanner input = new Scanner(System.in);
		System.out.print("Informe a altura do retângulo: ");
		ret.setAltura(input.nextFloat());
		System.out.print("Informe a largura do retângulo: ");
		ret.setLargura(input.nextFloat());
		ret.exibe();
	}

}

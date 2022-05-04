package pratica_11_1;

import java.util.ArrayList;
import java.util.Scanner;

public class PraticaMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	ArrayList<Veiculo> veiculo = new ArrayList<Veiculo>();
	String sair;;
	do {
		System.out.print("Digite o numero do chassi: ");
		int numeroChassi = scan.nextInt();
		
		System.out.print("Digite o numero da placa: ");
		int placa = scan.nextInt();
		
		veiculo.add(new Veiculo(numeroChassi, placa));
		
		System.out.println("Sair ? S | N: ");
		sair = scan.next();
		
	} while (!sair.equalsIgnoreCase("S"));
	
	for (Veiculo classe : veiculo) {
		System.out.println("Numero do chassi: " + classe.getNumeroChassi()
		+ "\nnumero da placa: " + classe.getPlaca());
	}
	
	}
}

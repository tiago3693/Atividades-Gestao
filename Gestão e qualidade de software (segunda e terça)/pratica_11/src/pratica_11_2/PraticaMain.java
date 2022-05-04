package pratica_11_2;

import java.util.ArrayList;
import java.util.Scanner;

public class PraticaMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	ArrayList<PessoaFisica> pessoaF = new ArrayList<PessoaFisica>();
	ArrayList<PessoaJuridica> pessoaJ = new ArrayList<PessoaJuridica>();
	String sair;;
	do {
		System.out.print("Digite o nome: ");
		String nome = scan.next();
		
		System.out.print("Selecione (CPF | CNPJ): ");
		String tipo = scan.next();
		
		if (tipo.equalsIgnoreCase("CPF")) {
			System.out.print("Digite o CPF: ");
			int CPF = scan.nextInt();
			pessoaF.add(new PessoaFisica(nome, CPF));
		} else if (tipo.equalsIgnoreCase("CNPJ")) {
			System.out.print("Digite o CNPJ: ");
			int CNPJ = scan.nextInt();
			pessoaJ.add(new PessoaJuridica(nome, CNPJ));
		}
		
		System.out.println("Sair ? S | N: ");
		sair = scan.next();
		
	} while (!sair.equalsIgnoreCase("S"));
	
	for (PessoaFisica classe : pessoaF) {
		System.out.println("Nome: " + classe.getNome()
		+ "\nCPF: " + classe.getCPF());
	}
	for (PessoaJuridica classe : pessoaJ) {
		System.out.println("Nome: " + classe.getNome()
		+ "\nCPF: " + classe.getCNPJ());
	}
	
	}
}

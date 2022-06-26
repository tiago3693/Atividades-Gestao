package produto;

import java.util.Scanner;

public class Relatorio {
	int codigo = 0;
	String sair, nome, linha, tipo, descontoS;
	double valor;
	boolean descontoB;
	ListaProdutos lista = new ListaProdutos();
	Scanner scan = new Scanner(System.in);

	public Relatorio() {
		
		do {
			receberDados();
			inserirDados();
			codigo++;
			
			System.out.println("Encerrar (S) (N)");
			sair = scan.next();
			
		} while (!sair.equalsIgnoreCase("S"));

		System.out.println("Total de produtos vendidos sem a aplicação dos descontos: " + lista.getTotalSemDesconto());
		System.out.println("Total de produtos vendidos com a aplicação dos descontos: " + lista.getTotalDesconto());
		scan.close();
	}

	private void receberDados() {
		
		System.out.print("Escolha a linha de produtos (Roupas) | (Calçados) | (Casas): ");
		linha = scan.next();

		System.out.print("Escolha o nome do produto: ");
		nome = scan.next();

		System.out.print("Escolha o tipo do produto: ");
		tipo = scan.next();

		System.out.print("Escolha o valor do produto: ");
		valor = scan.nextDouble();

		System.out.print("O produto tem desconto (S) (N): ");
		descontoS = scan.next();
		if (descontoS.equalsIgnoreCase("S")) {
			descontoB = Boolean.parseBoolean(descontoS = "true");
		} else {
			descontoB = Boolean.parseBoolean(descontoS = "false");
		}
		
	}

	private void inserirDados() {
		switch (linha.toLowerCase()) {
		case "roupas":
			lista.inserirProduto(new Roupa(codigo, nome, tipo, valor, descontoB));
			break;
		case "calçados":
			lista.inserirProduto(new Calcado(codigo, nome, tipo, valor, descontoB));
			break;
		case "casas":
			lista.inserirProduto(new Casa(codigo, nome, tipo, valor, descontoB));
			break;
		}
	}
}

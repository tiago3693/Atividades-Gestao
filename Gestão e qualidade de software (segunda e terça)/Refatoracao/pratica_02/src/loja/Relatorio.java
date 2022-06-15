package loja;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class Relatorio implements InterfaceRelatorio {

	public void relatorio() {

		boolean clienteVIP = false;

		Produto p1 = new Produto("Arroz", 5, 18.75);
		Produto p2 = new Produto("Feijão", 1, 4.95);
		Produto p3 = new Produto("Leite", 1, 3.49);

		ArrayList<Produto> produtos = new ArrayList<Produto>();
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);

		double total = total(produtos);
		desconto(clienteVIP, total);
		taxaDeEntrega(total);
		System.out.println(total);
	}

	@Override
	public double total(ArrayList<Produto> produtos) {
		// Calcula o somatório dos preços:
		double total = 0;
		for (Produto produto : produtos) {
			total += produto.getPreco() * produto.getQuantidade();
		}
		return total;
	}

	@Override
	public void desconto(boolean clienteVIP, double total) {
		// Aplica desconto:
		if (clienteVIP) {
			total *= 0.90;
		} else {
			total *= 0.95;
		}
	}

	@Override
	public void taxaDeEntrega(double total) {
		DayOfWeek diaSemana = LocalDate.now().getDayOfWeek();
		if (diaSemana == DayOfWeek.SUNDAY) {
			total += 10.00;
		} else {
			total += 5.00;
		}
	}

}

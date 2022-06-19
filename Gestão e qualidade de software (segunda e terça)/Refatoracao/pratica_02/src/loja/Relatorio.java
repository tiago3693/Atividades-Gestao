package loja;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class Relatorio extends Carrinho implements InterfaceRelatorio {
	private double total;

	public Relatorio(boolean clienteVIP) {
		super(clienteVIP);
		// TODO Auto-generated constructor stub
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void imprimirRelatorio() {
		total();
		desconto();
		taxaDeEntrega();
		System.out.println("preço: " + getTotal());
	}

	@Override
	public void total() {
		// Calcula o somatório dos preços:
		setTotal(0);
		for (Produto produto : getProdutos()) {
			setTotal(getTotal() +  (produto.getPreco() * produto.getQuantidade()));
		}
		System.out.println("preço total dos produtos: " + total);
	}

	@Override
	public void desconto() {
		// Aplica desconto:
		double temp = getTotal();
		if (getClienteVIP()) {
			setTotal(getTotal() * 0.9);
			System.out.println("desconto: " + (temp - getTotal()));
		} else {
			setTotal(getTotal() * 0.95);
			System.out.println("desconto: " + (temp - getTotal()));
		}
	}

	@Override
	public void taxaDeEntrega() {
		DayOfWeek diaSemana = LocalDate.now().getDayOfWeek();
		if (diaSemana == DayOfWeek.SUNDAY) {
			setTotal(getTotal() + 10.00);
			System.out.println("taxa de entrega: 10.00");
		} else {
			setTotal(getTotal() + 5.00);
			System.out.println("taxa de entrega: 5.00");
		}
	}

}

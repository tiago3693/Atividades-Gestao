package loja;

import java.util.ArrayList;

public interface InterfaceRelatorio {
	public double total(ArrayList<Produto> produtos);
	public void desconto(boolean clienteVIP, double total);
	public void taxaDeEntrega(double total);
}

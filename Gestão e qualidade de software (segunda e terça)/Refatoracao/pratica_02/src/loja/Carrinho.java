package loja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carrinho {
	private boolean clienteVIP;
	private ArrayList<Produto> produtos = new ArrayList<Produto>();

	public Carrinho(boolean clienteVIP) {
		this.clienteVIP = clienteVIP;
	}
	
	public void inserirProduto(Produto produto) {
		produtos.add(produto);
	}
	
	
	public boolean getClienteVIP() {
		return clienteVIP;
	}

	public List<Produto> getProdutos() {
		return Collections.unmodifiableList(produtos);
	}
}

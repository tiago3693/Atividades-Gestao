package produto;

import java.util.ArrayList;

public class ListaProdutos {

	private int totalDesconto = 0;
	private int totalSemDesconto = 0;
	private ArrayList<Produto> produtos = new ArrayList<Produto>();

	public int getTotalDesconto() {
		for (Produto produto : produtos) {
			if (produto.temDesconto()) {
				totalDesconto++;
			}
		}
		return totalDesconto;
	}

	public void setTotalDesconto(int totalDesconto) {
		this.totalDesconto = totalDesconto;
	}

	public int getTotalSemDesconto() {
		for (Produto produto : produtos) {
			if (!produto.temDesconto()) {
				totalSemDesconto++;
			}
		}
		return totalSemDesconto;
	}

	public void setTotalSemDesconto(int totalSemDesconto) {
		this.totalSemDesconto = totalSemDesconto;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void inserirProduto(Produto produto) {
		produtos.add(produto);
	}
}

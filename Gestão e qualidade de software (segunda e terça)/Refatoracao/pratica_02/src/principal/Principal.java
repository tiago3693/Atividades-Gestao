package principal;

import loja.Carrinho;
import loja.Produto;
import loja.Relatorio;

public class Principal {

	public static void main(String[] args) {
		Relatorio relatorio = new Relatorio(false);
		relatorio.inserirProduto(new Produto("Arroz", 5, 18.75));
		relatorio.inserirProduto(new Produto("Feijão", 1, 4.95));
		relatorio.inserirProduto(new Produto("Leite", 1, 3.49));

		relatorio.imprimirRelatorio();
	}
}
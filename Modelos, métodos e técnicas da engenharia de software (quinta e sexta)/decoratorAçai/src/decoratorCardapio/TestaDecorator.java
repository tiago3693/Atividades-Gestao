package decoratorCardapio;

public class TestaDecorator {
	public static void main(String[] args) {

		Adicional p1 = new Acai('m');
		Adicional p2 = new Banana(p1);
		Adicional p3 = new Morango(p2);
		Adicional pF = new LeiteCondensado(p3);

		System.out.println(pF.getDescricao() + "\n" + pF.custo());
	}
}

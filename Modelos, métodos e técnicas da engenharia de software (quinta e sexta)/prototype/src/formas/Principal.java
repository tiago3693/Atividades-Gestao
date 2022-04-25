package formas;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Forma> formas = new ArrayList<>();
		ArrayList<Forma> formasCopia = new ArrayList<>();

		Circulo circulo = new Circulo();
		circulo.x = 10;
		circulo.y = 20;
		circulo.radius = 15;
		circulo.cor = "red";
		formas.add(circulo);

		Circulo OutroCirculo = (Circulo) circulo.clone();
		formas.add(OutroCirculo);

		Retangulo retangulo = new Retangulo();
		retangulo.width = 10;
		retangulo.height = 20;
		retangulo.cor = "blue";
		formas.add(retangulo);

		clonarComparar(formas, formasCopia);
	}

	private static void clonarComparar(ArrayList<Forma> formas, ArrayList<Forma> formasCopia) {
		for (Forma forma : formas) {
			formasCopia.add(forma.clone());
		}

		for (int i = 0; i < formas.size(); i++) {
			Forma a = formas.get(i);
			Forma b = formasCopia.get(i);
			if (a != b) {
				System.out.println(i + ": formas e formasCopia são objetos diferentes");
				if (a.cor.equals(b.cor) && a.x == b.x && a.y == b.y) {
					System.out.println(i + ": E tem o mesmo conteudo");
				} else {
					System.out.println(i + ": E não tem o mesmo conteudo");
				}
			} else {
				System.out.println(i + ": formas e formasCopia são objetos iguais");
			}
		}
	}
}

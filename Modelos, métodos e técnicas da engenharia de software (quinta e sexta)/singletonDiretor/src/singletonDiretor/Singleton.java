package singletonDiretor;

public class Singleton {

	public static void main(String[] args) {
		
		/*CaldeiraChocolate.getInstancia();
		
		
		CaldeiraChocolate.preencher();
		CaldeiraChocolate.ferver();
		CaldeiraChocolate.estaFervida();
		CaldeiraChocolate.estaVazia();*/
		
		Diretor.getInstancia().setNome("a");
		
		System.out.println(Diretor.getNome());

		
		Diretor.getInstancia().setNome("nom4");
		
		System.out.println(Diretor.getNome());
		
	}

}
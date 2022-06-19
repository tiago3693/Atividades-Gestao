package pratica_03;

public class Vetor {
	private double vet[];
	private double soma;
	private int id;

	public Vetor(double[] vet, int id) {
		this.id = id;
		this.vet = vet;
	}

	public double[] getVet() {
		return vet;
	}
	
	public int getId() {
		return id;
	}

	public double getSoma() {
		return soma;
	}

	private void setSoma(double soma) {
		this.soma = soma;
	}

	public void Media() {
		setSoma(0);
		for (double v : getVet()) {
			setSoma(getSoma() + v);
		}
		double media = getSoma() / getVet().length;
		System.out.println("Média do vetor " + getId() + ": " + media);
	}
}

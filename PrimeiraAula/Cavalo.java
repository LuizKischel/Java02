package PrimeiraAula;

public class Cavalo extends Animal2 {

	private String raca;
	
	public Cavalo(float tamanho, String cor) {
		super(tamanho, cor);
		this.raca = raca;
	}
	
	public void fugir() {
		System.out.println("Cavalo fugiu");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
}

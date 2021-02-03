package PrimeiraAula;

public class Leao extends Animal2 {

	private boolean juba;
	
	public Leao(float tamanho, String cor) {
		super(tamanho, cor);
		this.juba = juba;
	}
	
	public void cacar() {
		System.out.println("Leao caçando");
	}

	public boolean isJuba() {
		return juba;
	}

	public void setJuba(boolean juba) {
		this.juba = juba;
	}
	
	

}

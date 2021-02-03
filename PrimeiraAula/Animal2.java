package PrimeiraAula;

public class Animal2 {
	
	private float tamanho;
	private String cor;
	
	public Animal2 (float tamanho, String cor) {
		this.tamanho = tamanho;
		this.cor = cor;
	}
	
	public void comer() {
		System.out.println("Comendo");
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}

package PrimeiraAula;

public class Aquatico extends Transporte {
	
	public Aquatico(int capacidade, int codigo, String nome, String destino, String origem) {
		super(capacidade, codigo, nome, destino, origem);
	}
	
	public void velejar() {
		System.out.println("Velejando");
	}
	
	

}

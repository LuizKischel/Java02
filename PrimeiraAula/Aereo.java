package PrimeiraAula;

public class Aereo extends Transporte {

	private int capacidadeCombustivel;
	private int altura;
	
	public Aereo(int capacidade, int codigo, String nome, String destino, String origem) {
		super(capacidade, codigo, nome, destino, origem);
	}

}

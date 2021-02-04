package PrimeiraAula;

public class Automovel extends Terrestre {
	
	private String cor;
	private int numeroPortas;
	private String placa;
	
	public Automovel(int capacidade, int codigo, String nome, String destino, String origem, int numeroRodas,
			boolean motorizado, String andaFrente) {
		super(capacidade, codigo, nome, destino, origem, numeroRodas, motorizado, andaFrente);
		this.cor = cor;
		this.numeroPortas = numeroPortas;
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	
}

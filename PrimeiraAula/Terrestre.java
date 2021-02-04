package PrimeiraAula;

public class Terrestre extends Transporte {
	
	private int numeroRodas;
	private String tipo;
	private boolean motorizado;
	private String andaFrente;
	

	public Terrestre(int capacidade, int codigo, String nome, String destino, String origem, int numeroRodas, boolean motorizado,String andaFrente) {
		super(capacidade, codigo, nome, destino, origem);
		this.numeroRodas = numeroRodas;
		this.andaFrente = andaFrente;
		this.motorizado = motorizado;
	}
	
	public void andaFrente() {
		System.out.println("Anda pra frente");
	}
	
	public void andaTras() {
		System.out.println("Anda pra trás");
	}
	
	public boolean isMotorizado() {
		if(motorizado) {
			return true;
		}return false;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean getMotorizado() {
		return motorizado;
	}

	public void setMotorizado(boolean motorizado) {
		this.motorizado = motorizado;
	}

	public String getAndaFrente() {
		return andaFrente;
	}

	public void setAndaFrente(String andaFrente) {
		this.andaFrente = andaFrente;
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}
	
	

}

package PrimeiraAula;

public class Carro {
	
	private String modelo;
	private String marca;
	private int anoFabricacao;
	private String localFabricacao;
	private String cor;
	private double motor;
	private double valorCarro;
	private int portas;
	private String cambio;
	private int cvMotor;
	
	public void ligar() {
		System.out.println("Ligou");
	}
	
	public void desligar() {
		System.out.println("Desligou");
	}
	
	public void acelerar() {
		System.out.println("Acelerando");
	}
	
	public void freiar() {
		System.out.println("Freiando");
	}
	
	public void passarMarcha() {
		System.out.println("Proxima marcha");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getLocalFabricacao() {
		return localFabricacao;
	}

	public void setLocalFabricacao(String localFabricacao) {
		this.localFabricacao = localFabricacao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	public double getValorCarro() {
		return valorCarro;
	}

	public void setValorCarro(double valorCarro) {
		this.valorCarro = valorCarro;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public int getCvMotor() {
		return cvMotor;
	}

	public void setCvMotor(int cvMotor) {
		this.cvMotor = cvMotor;
	}
}

package PrimeiraAula;

public class Barco extends Aquatico {
	
	private String modelo;
	private double potencia;
	private int qntdPassageiros;
	private double velocidade;
	private double autonomia;

	public Barco(int capacidade, int codigo, String nome, String destino, String origem, String modelo, double potencia, int qntdPassageiros,
double velocidade, double autonomia) {
		super(capacidade, codigo, nome, destino, origem);
		this.autonomia = autonomia;
		this.modelo = modelo;
		this.potencia = potencia;
		this.qntdPassageiros = qntdPassageiros;
		this.velocidade = velocidade;
	}
	
	public void mexerMotor() {
		System.out.println("Mechendo no motor");
	}
	
	public void pescar() {
		System.out.println("Pescando");
	}

}

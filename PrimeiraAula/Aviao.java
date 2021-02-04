package PrimeiraAula;

public class Aviao extends Aereo {
	
	private String modelo;
	private double potencia;
	private int qntdPassageiros;
	private double velocidade;
	private double autonomia;

	public Aviao(int capacidade, int codigo, String nome, String destino, String origem, String modelo, double potencia, int qntdPassageiros,
double velocidade, double autonomia) {
		super(capacidade, codigo, nome, destino, origem);
		this.autonomia = autonomia;
		this.modelo = modelo;
		this.potencia = potencia;
		this.qntdPassageiros = qntdPassageiros;
		this.velocidade = velocidade;
	}
	
	public void voar() {
		System.out.println("voando");
	}
	
	public void Pousar() {
		System.out.println("Pousando");
	}
	
	public void decolar() {
		System.out.println("Decolando");
	}
	
	public void abastecer() {
		System.out.println("Abastecendo");
	}
	
	public void reduzirTurbina() {
		System.out.println("Reduzindo turbinas");
	}

}

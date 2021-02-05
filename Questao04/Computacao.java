package Questao04;

public class Computacao extends Laboratorios {
	
	private int qntdComputadores;
	private double velocidadeInternet;

	public Computacao(int bancadas, String local, String aula, int qntdComputadores, double velocidadeInternet) {
		super(bancadas, local, aula);
		this.qntdComputadores = qntdComputadores;
		this.velocidadeInternet= velocidadeInternet;
	}

}

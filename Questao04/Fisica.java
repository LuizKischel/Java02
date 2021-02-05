package Questao04;

public class Fisica extends Laboratorios {

	private String ferramentas;
	private int calculos;
	
	public Fisica(int bancadas, String local, String aula, String ferramentas, int calculos) {
		super(bancadas, local, aula);
		this.calculos = calculos;
		this.ferramentas = ferramentas;
	}

}

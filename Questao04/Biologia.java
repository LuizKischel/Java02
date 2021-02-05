package Questao04;

public class Biologia extends Laboratorios {

	private int animais;
	
	public Biologia(int bancadas, String local, String aula, int animais) {
		super(bancadas, local, aula);
		this.animais = animais;
	}
	
	public void coletarAnimal() {
		System.out.println("Coletando");
	}

}

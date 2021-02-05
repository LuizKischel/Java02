package Questao04;

public class Laboratorios {

	private int bancadas;
	private String local;
	private String aula;
	
	public Laboratorios(int bancadas, String local, String aula) {
		this.aula = aula;
		this.bancadas = bancadas;
		this.local = local;
	}

	public int getBancadas() {
		return bancadas;
	}

	public void setBancadas(int bancadas) {
		this.bancadas = bancadas;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}
	
	

}

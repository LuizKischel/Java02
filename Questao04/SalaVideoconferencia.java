package Questao04;

public class SalaVideoconferencia extends SalaConferencia {

	private int cameras;
	private int microfones;
	private int computadores;
	private String senhaWifi;
	private int telas;
	
	public SalaVideoconferencia(int assentosAlunos, int quadros, int mesaProfessor, int capacidade, String assunto, int cameras,int microfones,int computadores, String senhaWifi,int telas) {
		super(assentosAlunos, quadros, mesaProfessor, capacidade, assunto);
		this.cameras = cameras;
		this.computadores = computadores;
		this.microfones = microfones;
		this.senhaWifi = senhaWifi;
		this.telas = telas;
	}

	public int getCameras() {
		return cameras;
	}

	public void setCameras(int cameras) {
		this.cameras = cameras;
	}

	public int getMicrofones() {
		return microfones;
	}

	public void setMicrofones(int microfones) {
		this.microfones = microfones;
	}

	public int getComputadores() {
		return computadores;
	}

	public void setComputadores(int computadores) {
		this.computadores = computadores;
	}

	public String getSenhaWifi() {
		return senhaWifi;
	}

	public void setSenhaWifi(String senhaWifi) {
		this.senhaWifi = senhaWifi;
	}

	public int getTelas() {
		return telas;
	}

	public void setTelas(int telas) {
		this.telas = telas;
	}

	
	
}

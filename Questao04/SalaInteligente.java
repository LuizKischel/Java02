package Questao04;

public class SalaInteligente extends SalaNormal {

	private String Rede;
	private String Audio;
	private String Projetor;
	
	public SalaInteligente(int assentosAlunos, int quadros, int mesaProfessor, String Rede, String Audio, String Projetor) {
		super(assentosAlunos, quadros, mesaProfessor);
		this.Audio = Audio;
		this.Projetor = Projetor;
		this.Rede = Rede;
	}

	public boolean isComputadores(boolean contem) {
		if(contem) {
			System.out.println("Esta sala contem computadores");
			return true;
		}System.out.println("Esta sala não contem computadores"); return false;
	}
	
	public void navegarRede() {
		System.out.println("Usando a rede da universidade");
	}
	
	public void ligarAudio() {
		System.out.println("Ligando sistema de áudio");
	}
	
	public void ligarProjetor() {
		System.out.println("Ligando Projetor");
	}
	
	public String getRede() {
		return Rede;
	}

	public void setRede(String rede) {
		Rede = rede;
	}

	public String getAudio() {
		return Audio;
	}

	public void setAudio(String audio) {
		Audio = audio;
	}

	public String getProjetor() {
		return Projetor;
	}

	public void setProjetor(String projetor) {
		Projetor = projetor;
	}

	
	
	

}

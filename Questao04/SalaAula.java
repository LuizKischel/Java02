package Questao04;

public class SalaAula {
	
	private int assentosAlunos;
	private int quadros;
	private int mesaProfessor;

	public SalaAula(int assentosAlunos, int quadros, int mesaProfessor) {
		this.assentosAlunos = assentosAlunos;
		this.mesaProfessor = mesaProfessor;
		this.quadros = quadros;
	}
	
	public int getAssentosAlunos() {
		return assentosAlunos;
	}

	public void setAssentosAlunos(int assentosAlunos) {
		this.assentosAlunos = assentosAlunos;
	}

	public int getQuadros() {
		return quadros;
	}

	public void setQuadros(int quadros) {
		this.quadros = quadros;
	}

	public int getMesaProfessor() {
		return mesaProfessor;
	}

	public void setMesaProfessor(int mesaProfessor) {
		this.mesaProfessor = mesaProfessor;
	}
	
	

}

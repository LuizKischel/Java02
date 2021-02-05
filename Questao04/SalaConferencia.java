package Questao04;

public class SalaConferencia extends SalaNormal {

	private int capacidade;
	private String assunto;
	
	public SalaConferencia(int assentosAlunos, int quadros, int mesaProfessor, int capacidade, String assunto) {
		super(assentosAlunos, quadros, mesaProfessor);
		this.assunto = assunto;
		this.capacidade = capacidade;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
	

}

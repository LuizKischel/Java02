package Questao04;

public class SalaNormal extends SalaAula {

	private boolean salaRetroprojetor;
	private boolean salaTV;
	
	
	public SalaNormal(int assentosAlunos, int quadros, int mesaProfessor) {
		super(assentosAlunos, quadros, mesaProfessor);
	}
	
	public boolean isSalaRetroprojetor(boolean contem) {
		if(contem) {
			System.out.println("Esta sala cont�m retroprojetor");
			return true;
		}System.out.println("Esta sala N�O cont�m retroprojetor");return false;
	}

	public boolean isSalatv(boolean contem) {
		if(contem) {
			System.out.println("Esta sala cont�m TV ligada a cabo");
			return true;
		}System.out.println("Esta sala N�O cont�m TV ligada a cabo");return false;
	}
	
}

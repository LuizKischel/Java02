package Questao04;

public class SalaNormal extends SalaAula {

	private boolean salaRetroprojetor;
	private boolean salaTV;
	
	
	public SalaNormal(int assentosAlunos, int quadros, int mesaProfessor) {
		super(assentosAlunos, quadros, mesaProfessor);
	}
	
	public boolean isSalaRetroprojetor(boolean contem) {
		if(contem) {
			System.out.println("Esta sala contém retroprojetor");
			return true;
		}System.out.println("Esta sala NÃO contém retroprojetor");return false;
	}

	public boolean isSalatv(boolean contem) {
		if(contem) {
			System.out.println("Esta sala contém TV ligada a cabo");
			return true;
		}System.out.println("Esta sala NÃO contém TV ligada a cabo");return false;
	}
	
}

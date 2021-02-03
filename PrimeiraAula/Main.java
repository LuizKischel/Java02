package PrimeiraAula;

public class Main {

	public static void main(String[] args) {
		
		Agenda cont = new Agenda();
		cont.adicionar("Luiz", 0);
		cont.listar();
		cont.excluir(0);
		cont.listar();
	}

}

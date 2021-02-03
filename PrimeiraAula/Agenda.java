package PrimeiraAula;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Integer> contatos = new ArrayList<>();

	public Agenda() {
		this.contatos = contatos;
	}
	
	public void listar() {
		System.out.println("Lista: " + contatos);
	}
	
	public void excluir(int contato) {
		contatos.remove(contato);
	}
	
	public void adicionar(String nomePessoa, int idContato) {
		contatos.add(idContato);
		System.out.println("Foi adicionado: " + nomePessoa + " no contato " + idContato);
	}
	
	
	

}

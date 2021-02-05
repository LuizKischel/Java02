package Questao04;

public class Quimica extends Laboratorios {

	private int produtos;
	private String pesquisa;
	
	public Quimica(int bancadas, String local, String aula, int produtos, String pesquisa) {
		super(bancadas, local, aula);
		this.pesquisa = pesquisa;
		this.produtos = produtos;
	}

	public void aplicarFormula() {
		System.out.println("Aplicando fórmula");
	}
	
	public int getProdutos() {
		return produtos;
	}

	public void setProdutos(int produtos) {
		this.produtos = produtos;
	}

	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}
	
	

}

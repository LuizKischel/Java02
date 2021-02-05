package Questao05;

public class Cinemas {

	private String nomeFanatasia;
	private int capacidadeLotacao;
	private int qntdSalasTotal;
	private int qntdSalasDisponiveis;
	private int telefones;
	Endereco endereco;
	
	public Cinemas(String nomeFanatasia, int capacidadeLotacao, int qntdSalasTotal, int qntdSalasDisponiveis,
			int telefones, Endereco endereco) {
		this.nomeFanatasia = nomeFanatasia;
		this.capacidadeLotacao = capacidadeLotacao;
		this.qntdSalasTotal = qntdSalasTotal;
		this.qntdSalasDisponiveis = qntdSalasDisponiveis;
		this.telefones = telefones;
		this.endereco = endereco;
	}
	
	

	public String getNomeFanatasia() {
		return nomeFanatasia;
	}

	public void setNomeFanatasia(String nomeFanatasia) {
		this.nomeFanatasia = nomeFanatasia;
	}

	public int getCapacidadeLotacao() {
		return capacidadeLotacao;
	}

	public void setCapacidadeLotacao(int capacidadeLotacao) {
		this.capacidadeLotacao = capacidadeLotacao;
	}

	public int getQntdSalasTotal() {
		return qntdSalasTotal;
	}

	public void setQntdSalasTotal(int qntdSalasTotal) {
		this.qntdSalasTotal = qntdSalasTotal;
	}

	public int getQntdSalasDisponiveis() {
		return qntdSalasDisponiveis;
	}

	public void setQntdSalasDisponiveis(int qntdSalasDisponiveis) {
		this.qntdSalasDisponiveis = qntdSalasDisponiveis;
	}

	public int getTelefones() {
		return telefones;
	}

	public void setTelefones(int telefones) {
		this.telefones = telefones;
	}
	
	
	
	

}

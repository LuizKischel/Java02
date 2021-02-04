package PrimeiraAula;

public class Transporte {

	private int capacidade;
	private int codigo;
	private String nome;
	private String destino;
	private String origem;
	
	public Transporte(int capacidade, int codigo, String nome, String destino, String origem) {
		this.capacidade = capacidade;
		this.codigo = codigo;
		this.nome = nome;
		this.destino = destino;
		this.origem = origem;
	}	
	
	public void trajeto() {
		System.out.println("ver trajeto");
	}
	
	public void carregar() {
		System.out.println("Carregando");
	}
	
	public void descarregar() {
		System.out.println("Descarregando");
	}
	
	public void iniciarTransporte() {
		System.out.println("Iniciando transporte");
	}
	
	public void ligar() {
		System.out.println("Ligando");
	}
	
	public void desligar() {
		System.out.println("Desligando");
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	
}

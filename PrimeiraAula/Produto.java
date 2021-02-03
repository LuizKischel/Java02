package PrimeiraAula;

public class Produto {
	
	private int codigo;
	private double preco;
	private String origem;
	private int validade;
	private String embalagem;
	private String Marca;
	private String beneficio;
	private double tamanho;
	private String pontoVenda;
	private String relevancia;
	
	public void vender() {
		System.out.println("Vender");
	}
	
	public void comprar() {
		System.out.println("Comprou");
	}
	
	public void experimentar() {
		System.out.println("Experimentando");
	}
	
	public void trocar() {
		System.out.println("Trocando");
	}
	
	public void elogiar() {
		System.out.println("Elogiou");
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public int getValidade() {
		return validade;
	}

	public void setValidade(int validade) {
		this.validade = validade;
	}

	public String getEmbalagem() {
		return embalagem;
	}

	public void setEmbalagem(String embalagem) {
		this.embalagem = embalagem;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public String getPontoVenda() {
		return pontoVenda;
	}

	public void setPontoVenda(String pontoVenda) {
		this.pontoVenda = pontoVenda;
	}

	public String getRelevancia() {
		return relevancia;
	}

	public void setRelevancia(String relevancia) {
		this.relevancia = relevancia;
	}

	
	
}

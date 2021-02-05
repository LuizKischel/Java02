package Questao05;

public class Endereco {

	private String rua;
	private String cidade;
	private int numero;
	private String Bairro;
	private int CEP;
	private String pais;
	
	public Endereco(String rua, String cidade, int numero, String Bairro, int CEP, String pais) {
		this.Bairro = Bairro;
		this.CEP = CEP;
		this.cidade = cidade;
		this.numero = numero;
		this.pais = pais;
		this.rua = rua;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public int getCEP() {
		return CEP;
	}

	public void setCEP(int cEP) {
		CEP = cEP;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	

}

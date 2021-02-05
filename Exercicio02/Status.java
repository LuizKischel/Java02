package Exercicio02;

public enum Status {
	
	EMPREGADO("Empregado"),
	EMPREGADOR("Empregador"),
	DESEMPREGADO("Desempregado");
	
	private String descricao;
	
	private Status(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao () {
		return descricao;
	}

}

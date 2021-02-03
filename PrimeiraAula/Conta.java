package PrimeiraAula;

public class Conta {
	
	private String nome;
	private String tipoConta;
	private int CPFCNPJ;
	private double saque;
	private double limite;
	private double capital;
	private String endereço;
	private double poupanca;
	private double emprestimo;
	private double transferencia;
	
	public void tirarExtrato() {
		System.out.println("Extrato");
	}
	
	public void sacar() {
		System.out.println("Sacando");
	}
	
	public void depositar() {
		System.out.println("Depositando");
	}
	
	public void transferir() {
		System.out.println("Transferindo");
	}
	
	public void ajustarLimite() {
		System.out.println("Limite Ajustado");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public int getCPFCNPJ() {
		return CPFCNPJ;
	}

	public void setCPFCNPJ(int cPFCNPJ) {
		CPFCNPJ = cPFCNPJ;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public double getPoupanca() {
		return poupanca;
	}

	public void setPoupanca(double poupanca) {
		this.poupanca = poupanca;
	}

	public double getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(double emprestimo) {
		this.emprestimo = emprestimo;
	}

	public double getTransferencia() {
		return transferencia;
	}

	public void setTransferencia(double transferencia) {
		this.transferencia = transferencia;
	}
	
}

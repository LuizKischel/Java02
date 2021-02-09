package Polimorfismo;

public class Desconto {
	
	private double valorCompraCliente;
	private double valorCompraFuncionario;
	private double valorCompraGerente;
	private double descontoCliente;
	private double descontoFuncionario;
	private double descontoGerente;
	
	public void descontoCliente(double valorCompra) {
		this.valorCompraCliente = valorCompra;
		descontoCliente = valorCompra * 0.05;
		valorCompra = valorCompra - descontoCliente;
	}
	
	public void descontoFuncion�rio(double valorCompra) {
		this.valorCompraFuncionario = valorCompra;
		descontoFuncionario = valorCompra * 0.25;
		valorCompra = valorCompra - descontoFuncionario;
	}
	
	public void descontoGerente(double valorCompra) {
		this.valorCompraGerente = valorCompra;
		descontoGerente = valorCompra * 0.28;
		valorCompra = valorCompra - descontoGerente;
		System.out.println("O valor total da compra �: " + valorCompraGerente + " E o desconto � de: " + descontoGerente);
	}
	
	public void impostoFuncionario() {
		double imposto = valorCompraFuncionario;
		imposto = imposto *= 0.11;
		System.out.println("O valor total da compra �: " + valorCompraFuncionario + " O imposto do cliente �: " + imposto + " reais. E o desconto � de: " + descontoFuncionario);
	}
	
	public void impostoCliente() {
		double imposto = valorCompraCliente;
		imposto = imposto *= 0.03;
		System.out.println("O valor total da compra �: " + valorCompraCliente + " O imposto do cliente �: " + imposto + " reais. E o desconto � de: " + descontoCliente);
	}
}

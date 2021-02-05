package Exercicio02;

import java.util.Scanner;

public class Cadastro {
	
	private String nomeCompleto;
	private int dataNascimento;
	private Status status;
	private String estado;
	private boolean isAposentado;
	private int qtdFuncionarios;
	private double mesesDesempregado;
	
	public Cadastro(String nomeCompleto, int dataNascimento, Status status, String estado) {
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.status = status;
		this.estado = estado;
	}
	
	public void Categoria(boolean isAposentado) {
		if(status == Status.EMPREGADO) {
			if(isAposentado) {
				System.out.println("Pessoa aposentada"); 
				this.isAposentado = isAposentado;
			} else {System.out.println("Pessoa não aposentada");}
		}else {System.out.println("Categoria não encontrada.");}
	}

	public void Categoria(int qtdFuncionario) {
		if(status == Status.EMPREGADOR) {
			this.qtdFuncionarios = qtdFuncionario;
			System.out.println("Você possui: " + qtdFuncionario + "funcionários");
		}
		else {
			System.out.println("Categoria não encontrada.");
		}
	}
	
	public void Categoria(Status status, double mesesDesempregado) {
		if(status == Status.DESEMPREGADO) {
			this.mesesDesempregado = mesesDesempregado;
			System.out.println("Você está há: " + mesesDesempregado + "meses desempregado");
		}
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public int getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public boolean isAposentado() {
		return isAposentado;
	}

	public void setAposentado(boolean isAposentado) {
		this.isAposentado = isAposentado;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public double getMesesDesempregado() {
		return mesesDesempregado;
	}

	public void setMesesDesempregado(double mesesDesempregado) {
		this.mesesDesempregado = mesesDesempregado;
	}

	
	
	
	

}

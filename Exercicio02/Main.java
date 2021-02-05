package Exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Cadastro ca = new Cadastro("Luiz", 19, Status.EMPREGADO, "SC");
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		if(ca.getStatus() == Status.EMPREGADO) {
			System.out.println("É aposentado?");
		}	
		else if(ca.getStatus() == Status.DESEMPREGADO) {
			System.out.println("Quantos meses desempregados?");
		}
		else if(ca.getStatus() == Status.EMPREGADOR) {
			System.out.println("Quantos funcionarios?");
		}
		ca.Categoria(teclado.nextBoolean());	
	}

}

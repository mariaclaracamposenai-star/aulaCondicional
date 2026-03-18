package aulaCondicional;

import java.util.Scanner;

public class Aula6desafio06 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String cpf, senha;
		double saldototal = 2000, saque, total;

		System.out.println("Informe o CPF: ");
		cpf = ler.nextLine();
		System.out.println("Informe a senha: ");
		senha = ler.nextLine();

		if (cpf.equals("1234567") && senha.equals("321")) {
			System.out.println("Informe o valor do saque: ");
			saque = ler.nextDouble();
			total = saldototal - saque;
			System.out.println("Saldo atual: " + total);
			if (saque > saldototal) {
				System.out.println("Saldo Insuficiente!");
				System.out.println("Saldo atual: " + saldototal);
			}
		} else {
			System.out.println("Senha ou CPF inválido");
		}
		ler.close();
	}
}

		

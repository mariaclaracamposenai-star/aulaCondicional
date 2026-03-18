package aulaCondicional;

import java.util.Scanner;

public class Aula6desafio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println(" informe 3 números: ");
		double n1 = entrada.nextDouble();
		double n2 = entrada.nextDouble();
		double n3 = entrada.nextDouble();
		double maior = Math.max (n1, Math.max(n2, n3));

		System.out.println(" o maior é: " + maior);

		entrada.close();

	}

}

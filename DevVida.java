package aulaCondicional;

import java.util.Scanner;

public class DevVida {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int nota1, nota2, nota3, nota4, total;

		System.out.println("informe a primeira nota do estudante: ");
		nota1 = ler.nextInt();

		System.out.println("informe a segunda nota do estudante: ");
		nota2 = ler.nextInt();

		System.out.println("informe a terceira nota do estudante: ");
		nota3 = ler.nextInt();

		System.out.println("informe a quarta nota do estudante: ");
		nota4 = ler.nextInt();

		total = nota1 + nota2 + nota3 + nota4;

		if (total > 6) {
			System.out.println("aprovado");
		} else if (total < 6) {
			System.out.println("reprovado");
		}

		ler.close();
	}
}

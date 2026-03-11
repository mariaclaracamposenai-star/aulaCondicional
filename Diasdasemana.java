package aulaCondicional;

import java.util.Scanner;

public class Diasdasemana {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int domingo, segunda, terça, quarta, quinta, sexta, sábado, dia;

		System.out.println("Número do dia da semana: ");
		dia = ler.nextInt();

		if (dia > 7) {
			System.out.println("invalido");
		} else if (dia == 1) {
			System.out.println("domingo");
		} else if (dia == 2) {
			System.out.println("segunda");
		} else if (dia == 3) {
			System.out.println("terça");
		} else if (dia == 4) {
			System.out.println("quarta");
		} else if (dia == 5) {
			System.out.println("quinta");
		} else if (dia == 6) {
			System.out.println("sexta");
		} else if (dia == 7) {
			System.out.println("sábado");
		}
		ler.close();

	}

}

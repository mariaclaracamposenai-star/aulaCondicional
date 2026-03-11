package aulaCondicional;

import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int mês;

			System.out.println("Número do mês: ");
			mês = ler.nextInt();

			if (mês > 12) {
				System.out.println("invalido");
			} else if (mês == 1) {
				System.out.println("janeiro");
			} else if (mês  == 2) {
				System.out.println("fevereiro");
			} else if (mês  == 3) {
				System.out.println("março");
			} else if (mês  == 4) {
				System.out.println("abril");
			} else if (mês  == 5) {
				System.out.println("maio");
			} else if (mês  == 6) {
				System.out.println("junho");
			} else if (mês  == 7) {
				System.out.println("julho");
			}  else if (mês  == 8) {
				System.out.println("agosto");
			}  else if (mês  == 9) {
				System.out.println("setembro");
			}  else if (mês  == 10) {
				System.out.println("outubro");
			}  else if (mês  == 11) {
				System.out.println("novembro");
			}  else if (mês  == 12) {
				System.out.println("dezembro");
			}
			ler.close();

		}

	}



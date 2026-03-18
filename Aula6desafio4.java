package aulaCondicional;

import java.util.Scanner;

public class Aula6desafio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int lado1, lado2, lado3;
		
		System.out.println("Informe o lado1:  ");
		lado1= ler.nextInt();
		
		System.out.println("Informe o lado2:  ");
		lado2= ler.nextInt();
		
		System.out.println("Informe o lado3:  ");
		lado3= ler.nextInt();
		
		if (lado1 == lado2 && lado1 == lado3) {
			System.out.println("O triângulo é equilátero");
		} else if (lado1 == lado2 && lado1 !=  lado3 && lado2 != lado3 || lado3 == lado2 && lado3 != lado1 && lado2 != lado3) {
			System.out.println("o triângulo é isóceles");
		}
		else {
			System.out.println("O triângulo é escaleno");
			
			ler.close();
		}
	}
}

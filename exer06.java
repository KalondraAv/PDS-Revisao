package revisao;

/*Escreva um programa que lê um inteiro, determina e imprime se ele é ímpar
ou par. Dica: Um numero par é múltiplo de 2. Qualquer múltiplo de 2 deixa
um resto 0 quando dividido por 2. */

import java.util.Scanner;

public class exer06 {
	public static void main(String[] args) {
		//Questão 6
		Scanner teclado = new Scanner(System.in);
		int a;
		System.out.print("Digite um número inteiro: ");
		a = Integer.parseInt(teclado.nextLine());
		if ( a % 2 == 0) {
			System.out.printf("O número " + a + " é par.");
		}else {
			System.out.printf("O número " + a + " é impar.");
		}
	}
}

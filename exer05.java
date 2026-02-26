package revisao;

/*Escreva um programa que solicita ao usuário inserir dois inteiros, obtém do
usuário eses números e exibe o número maior seguido pelas palavras "Este
é o maior". Se Os números forem iguais, imprime a mensagem
“Esses números são iguais". */

import java.util.Scanner;

public class exer05 {
	public static void main(String[] args) {
		//Questão 5
		Scanner teclado = new Scanner(System.in);
		int a, b;
		System.out.print("Valor de a: ");
		a = Integer.parseInt(teclado.nextLine());
		System.out.print("Valor de b: ");
		b = Integer.parseInt(teclado.nextLine());
		if (a > b){
			System.out.println("A é maior que B.");
		}if (a == b){
			System.out.println("A é igual a B.");
		}
	}
}

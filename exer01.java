package revisao;

import java.util.Scanner;

public class exer01 {
	/* Implemente um programa em Java que:
	● Inicialize duas variáveis do tipo int;
	● O usuário entre com os dois valores inteiros;
	● Realize as seguintes operações aritméticas entre as duas variáveis:
	adição, subtração, multiplicação e divisão.
	● Imprima o resultado de cada operação no console com mensagens
	explicativas.*/
		public static void main(String[] args) {
			//Questão 1
			Scanner teclado=new Scanner(System.in);
			int a,b, x, y,z,w;
			System.out.print("Valor de A: ");
			a = Integer.parseInt(teclado.nextLine());
			System.out.print("Valor de B: ");
			b = Integer.parseInt(teclado.nextLine());
			//Adição
			x = a + b;
			System.out.println("\nSoma : " + x);
			//Subtração
			y = a - b;
			System.out.println("Subtração: " + y);
			//Multiplicação
			z = a * b;
			System.out.println("Multiplicação: " + z);
			//Divisão
			w =  a / b;
			System.out.println("Divisão: " + w);
		}
	}



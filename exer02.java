package revisao;

/* Declare três variáveis do tipo double representando notas de um aluno.
Calcule e imprima:
● A soma das três notas;
● A média das notas */

import java.util.Scanner;

public class exer02 {
		public static void main(String[] args) {
			//Questão 2
			Scanner teclado = new Scanner(System.in);
			double a, b, c, somaNota, mediaNota;
			System.out.print("Nota 1: ");
			a = teclado.nextDouble();
			System.out.print("Nota 2: ");
			b = teclado.nextDouble();
			System.out.print("Nota 3: ");
			c = teclado.nextDouble();
			somaNota = a + b + c;
			System.out.println("Soma: " + somaNota);
			mediaNota = somaNota / 3.0;
			System.out.println("Média: " + mediaNota);
		}

}

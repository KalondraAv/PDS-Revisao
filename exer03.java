package revisao;

/* Crie um programa que declare duas variáveis do tipo float: base e altura.
Atribua valores e calcule a área de um retângulo utilizando a fórmula (área
= base * altura). Imprima o resultado com uma frase explicativa. */

import java.util.Scanner;

public class exer03 {
		public static void main(String[] args) {
			//Questão 3
			Scanner teclado = new Scanner(System.in);
			
			float base, altura, areaR;

			System.out.println("Calcule a área em centímetros de um retângulo.");
			System.out.println("Área = Base x Altura");
			System.out.print("Base: ");
			base = teclado.nextFloat();
			System.out.print("Altura: ");
			altura = teclado.nextFloat();
			areaR = base * altura;
			System.out.println("A área do retângulo é: " + areaR+" cm^2");
		}

}

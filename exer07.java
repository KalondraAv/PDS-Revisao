package revisao;

/*
 Faça um programa que peça ao usuário para digitar um número. Se esse
número for positivo, calcule a raiz quadrada do número. Se o número for
negativo, mostre uma mensagem dizendo que o número é inválido.
 */
import java.util.Scanner;

public class exer07 {
	public static void main(String[] args) {
		//Questão 7
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número: ");
		double a = teclado.nextDouble();
		if (a >= 0){
			double x = Math.sqrt(a);
			System.out.printf("A raiz quadrada de %.2f é %.2f", a, x);
		}else {
			System.out.println("Número inválido.");
		}
	}
}

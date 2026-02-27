package revisao;

/*
Escreva um programa que tenha um vetor do tipo String de N posições
denominado alunos e um vetor de N x 3 posições denominados notas. O primeiro
vetor é unidimensional, o segundo vetor é bidimensional. O vetor, denominado
nomes, tem a função de armazenar os nomes dos alunos da sala. O vetor
denominado notas tem a função de armazenar as notas do primeiro e do segundo
trabalho e as notas da avaliação de um dos bimestres do ano. 
OBSERVAÇÃO1: O PROGRAMA VAI PERGUNTAR QUANTOS ALUNOS TEM NA
SALA, O MENOR NÚMERO SERÁ 2 E O MAIOR NÚMERO SERÁ 10. SE O VALOR
DIGITADO FOR 6, O PROGRAMA SÓ LERÁ 6 NOMES DE ALUNOS E SUAS
RESPECTIVAS NOTAS. SE FOR 7, O PROGRAMA SÓ LERÁ 7 NOMES E SUAS
RESPECTIVAS NOTAS. E ASSIM POR DIANTE...
OBSERVAÇÃO2: SE A NOTA FINAL DO ALUNO FOR MAIOR OU IGUAL A 60, ELE
ESTARÁ APROVADO, SE FOR MENOR DO QUE 60, ELE ESTARÁ DESAPROVADO
*/

import java.text.DecimalFormat; 
import java.util.Locale;        
import java.util.Scanner;       

public class ativ03 {
	public static void main(String[] args) {
	Scanner tecladoScanner = new Scanner(System.in);
	DecimalFormat dfBrasileiro = (DecimalFormat) DecimalFormat.getInstance(new Locale("pt", "BR"));
	dfBrasileiro.applyPattern("###,###,##0.00"); 

		  System.out.println("**** Sisteminha de vetores\n");
		  System.out.print("  Quantos alunos tem na sala? ");
		  int tamanho = tecladoScanner.nextInt(); 

		  if (tamanho < 2 || tamanho > 10) {
		   System.out.print("  Número inválido!!! \n  Por favor digite outro número: ");
		   tamanho = tecladoScanner.nextInt();
		  }

		   String[] alunos = new String[tamanho]; 
		   double[][] notas = new double[tamanho][4]; 

		   System.out.println("\n**** Fase da digitação ****");
		   tecladoScanner.nextLine();

		   for (int a = 0; a < tamanho; a++) {
		     System.out.println("\n  **** Dados do aluno " + (a + 1) + " ****\n");

		     System.out.print("    Digite o nome do aluno....: ");
		     alunos[a] = tecladoScanner.nextLine();

		     System.out.print("    Digite nota do trabalho 1.: ");
		     notas[a][0] = tecladoScanner.nextDouble();

		     System.out.print("    Digite nota do trabalho 2.: ");
		     notas[a][1] = tecladoScanner.nextDouble();

		     System.out.print("    Digite nota da prova......: ");
		     notas[a][2] = tecladoScanner.nextDouble();

		     notas[a][3] = (((notas[a][0] + notas[a][1]) / 2) + notas[a][2]) / 2;
		     tecladoScanner.nextLine();
		   }

		    System.out.println("\n**** Fase do relatório ****\n");

		     for (int a = 0; a < tamanho; a++) {
		       System.out.println("  **** Dados do aluno " + (a + 1) + " ****");
		       System.out.println("    Aluno.....................: " + alunos[a]);
		       System.out.println("    Nota do trabalho 1........: " + dfBrasileiro.format(notas[a][0]));
		       System.out.println("    Nota do trabalho 2........: " + dfBrasileiro.format(notas[a][1]));
		       System.out.println("    Nota da prova.............: " + dfBrasileiro.format(notas[a][2]));
		       System.out.println("    Média final...............: " + dfBrasileiro.format(notas[a][3]));

		       if (notas[a][3] >= 60) {
		        System.out.println("    Situação..................: Aprovado");
		       } else {
		             System.out.println("    Situação..................: Reprovado");
		         }
		        }
		        tecladoScanner.close();
		    }

	}

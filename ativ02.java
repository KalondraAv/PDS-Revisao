package revisao;

/*Escreva um programa que tenha um vetor do tipo String de N posições
denominado alunos e três vetores de N posições denominados notaT1 (notas do
Trabalho 01), notasT2 (notas do trabalho 02) e notasP (notas da Prova Bimestral).
As notas do primeiro aluno (cujo nome está em alunos[0]) estão nas posições
notasT1[0], notasT2[0] e notasP[0]. As notas do segundo aluno (cujo nome está
em alunos[1]) estão na posição notasT1 [1], notasT2[1] e notasP[1].
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

public class ativ02 {

public static void main(String[] args) {
        Scanner tecladoScanner = new Scanner(System.in);
        DecimalFormat dfBrasileiro = (DecimalFormat) DecimalFormat.getInstance(new Locale("pt", "BR"));
        dfBrasileiro.applyPattern("###,###,##0.00"); 

        System.out.println("**** Sisteminha de vetores\n");
        System.out.print("  Quantos alunos tem na sala? ");
        int tamavetor = tecladoScanner.nextInt();

        if (tamavetor < 2 || tamavetor > 10) { 
            System.out.print("  Número inválido!!! \n  Por favor digite outro número: ");
            tamavetor = tecladoScanner.nextInt();
        }
        String alunos[] = new String[tamavetor];

        double notasT1[] = new double[tamavetor];

        double notasT2[] = new double[tamavetor];

        double notasP[] = new double[tamavetor];

        double notasFinais[] = new double[tamavetor];

        System.out.println("\n**** Fase da digitação");
        tecladoScanner.nextLine(); 

        for (int a = 0; a < tamavetor; a++) {

            System.out.println("\n  **** Dados do aluno " + (a + 1) + "\n");
            System.out.print("    Digite o nome do aluno....: ");
            alunos[a] = tecladoScanner.nextLine();
            System.out.print("    Digite nota do trabalho 1.: ");
            notasT1[a] = tecladoScanner.nextDouble();
            System.out.print("    Digite nota do trabalho 2.: ");
            notasT2[a] = tecladoScanner.nextDouble();
            System.out.print("    Digite nota da prova......: ");
            notasP[a] = tecladoScanner.nextDouble();
            tecladoScanner.nextLine(); 
            notasFinais[a] = (((notasT1[a] + notasT2[a]) / 2) + notasP[a]) / 2;
        }
        System.out.println("\n**** Fase do relatório \n");

        for (int a = 0; a < tamavetor; a++) {
            System.out.println("  **** Dados do aluno " + (a + 1) );
            System.out.println("    Aluno.....................: " + alunos[a]);
            System.out.println("    Digite nota do trabalho 1.: " + dfBrasileiro.format(notasT1[a]));
            System.out.println("    Digite nota do trabalho 2.: " + dfBrasileiro.format(notasT2[a]));
            System.out.println("    Digite nota da prova......: " + dfBrasileiro.format(notasP[a]));
            System.out.println("    Nota total................: " + dfBrasileiro.format(notasFinais[a]));

            if (notasFinais[a] >= 60) {
                System.out.println("    Situação..................: Aprovado");
            } else {
                System.out.println("    Situação..................: Reprovado");
            }
 
        }
        tecladoScanner.close();  
    }

}
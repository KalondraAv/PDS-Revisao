package projetoPDS;

import java.util.Scanner;

/*
Criar um método static para calcular o total
Criar um método static para exibir o resumo
Manter o main apenas como controlador do fluxo
O comportamento do programa não pode mudar. Apenas a organização interna deve melhorar.

Um método possui: tipo de retorno, nome, parâmetros e corpo.
Pergunte-se:
- Quais dados o método precisa receber? - Ele precisa retornar algo?
Evite repetir código dentro do main.

STATIC dentro do PUBLIC CLASS
*/

public class etapa02{
	
    static double calcularT( Double vh , Double hTrab){  //método serve para CALCULAR o VALOR TOTAL do serviço
    return vh * hTrab;
   }
    
    static void mostrarResumo(String nomeC, String prob, double vh, double hTrab, double total ){  //método para EXIBIR as INFORMAÇÕES do serviço
        System.out.println("\n--RESUMO DO SERVIÇO---");
        System.out.println("Olá, " + nomeC+"! O problema identificado e relatado por você foi: "+prob+".");
        System.out.println("O valor da hora é R$ "+vh+", e a quantidade de horas trabalhadas foi "+hTrab+" hora(s).");
        System.out.println("Portanto, o valor total a ser pago é: R$ " + total);
    }
    
    public static void main(String[] args) { //o MAIN deve agir apenas como CONTROLADOR DE FLUXO - organiza a execução e chama outros métodos
        Scanner teclado = new Scanner(System.in);
        String nomeC;
        String prob;
        double vh;
        double hTrab;
        double total;

        System.out.print("---REGISTRO DE SERVIÇO---\nDigite seu nome: "); //ENTRADA DE DADOS
        nomeC = teclado.nextLine();
        System.out.print("Descreva o problema identificado: ");
        prob = teclado.nextLine();
        System.out.print("Informe o valor da hora de serviço: ");
        vh = teclado.nextDouble();
        System.out.print("Informe a quantidade de hora(s) necessária(s): ");
        hTrab = teclado.nextDouble();
        total = calcularT (vh, hTrab);   //CHAMA o método calcularT
        mostrarResumo(nomeC, prob, vh, hTrab, total);   //CHAMA o método que imprime todas as informações do serviço (mostrarResumo)
        
        teclado.close();
        
     }
}

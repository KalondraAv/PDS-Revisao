package projetoPDS;

/*
Ler nome do cliente
Ler descrição do problema
Ler valor da hora de serviço
Ler quantidade de horas trabalhadas
Calcular o valor total
Exibir um resumo organizado
*/

import java.util.Scanner;

public class etapa01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nomeC;
		String prob;
		double valorHora;
		double valorTotal;
		int qtdeHora;
		
		System.out.print("-- REGISTRO DE MANUTENÇÃO TÉCNICA --\nPor favor, informe seu nome: "); //ENTRADA DE DADOS
		nomeC = teclado.nextLine();
		System.out.print("Agora, digite o problema identificado: ");
		prob =teclado.nextLine();
		System.out.print("Certo. Digite o valor da hora de serviço: R$ ");
		valorHora = teclado.nextDouble();
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		qtdeHora = teclado.nextInt();
		
		System.out.print("\n-- RESUMO DO SERVIÇO --\n"+"Cliente: "+nomeC+"\nProblema: " +prob+".\nHora de serviço: R$ "+valorHora+".\nTempo (horas): "+qtdeHora); //SAÍDA PARCIAL - RESUMO DO PEDIDO
		valorTotal = valorHora*qtdeHora; //PROCESSAMENTO - CÁLCULO
		System.out.print("Valor total do serviço: R$ "+valorTotal+"."); //SAÍDA FINAL - CONCLUSÃO
		
		teclado.close();
		}

}

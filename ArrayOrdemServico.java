package projetoPDS;

/*  ETAPA 6
Criar um ArrayList de OrdemServico
Permitir cadastrar várias ordens
Percorrer a lista e exibir todas
Calcular faturamento total
*/

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayOrdemServico {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Criando as coleções
		ArrayList<OrdemServico> ordens = new ArrayList<>(); // Vetor dinâmico p/inserção de qtde indefinida de valores
		ArrayList<Cliente> clientes = new ArrayList<>(); // Banco clientes e ordens - relacionamento de 1:n (BD)
		
		int opcao;
		String descricao;
		double valorHora;
		double qtdeHora;
		
		do { //EXECUÇÃO CONTÍNUA DO PROGRAMA, exceto que o usuário digite 0
			System.out.println("\n--- MENÚ DE SERVIÇOS ---");
			System.out.print("1- Cadastrar nova ordem \n2- Listar ordens \n3- Calcular faturamento total \n");
			System.out.print("4- Alterar status de uma ordem \n5- Cadastrar novo cliente \n0- Sair\n");
			System.out.print("Escolha o tipo de serviço: ");
			opcao = teclado.nextInt();
			teclado.nextLine(); // limpa buffer
			
			switch(opcao) {
			case 1:
				System.out.println("\n--- CADASTRAR NOVA ORDEM ---");
				System.out.print("Informe o problema: ");
				descricao = teclado.nextLine();
				
				System.out.print("Informe o valor da hora: ");
				valorHora = teclado.nextDouble();
				
				System.out.print("Informe a quantidade de horas trabalhadas: ");
				qtdeHora = teclado.nextDouble();
				
				// Vincular cliente
				System.out.print("Vincule o cliente (comece por 0): ");
				int index_cliente = teclado.nextInt();
				
				if(index_cliente >= 0 && index_cliente < clientes.size()) { //Evita erro de índice inválido
					OrdemServico ordem = new OrdemServico(clientes.get(index_cliente), descricao, valorHora, qtdeHora);
					ordens.add(ordem); //Ligação entre ordem e cliente
					System.out.print("Ordem cadastrada com sucesso!\n");
				} else {
					System.out.print("Cliente inválido! Clique em 5 para cadastrar.\n");
				}

				break;
				
			case 2:
				System.out.println("\n--- LISTAR ORDENS ---");
				if(ordens.isEmpty()) { //Verificação de existência de ordem
					System.out.print("Nenhuma ordem foi cadastrada.\n");
				} else {
					//para cada ordem de serviço 'ordem' dentro de 'ordens', imprima:
					for(int i = 0; i <ordens.size(); i++) {
						System.out.print("Ordem número "+(i+1)+"\n");
						ordens.get(i).exibirResumo(); //Reaproveitamento de código da classe OrdemServico
					}
				}
				break;
				
			case 3:
				double total = 0;
				System.out.print("\n--- CALCULAR FATURAMENTO TOTAL ---\n");
			    for(int i = 0; i < ordens.size(); i++) {
			        total += ordens.get(i).calcularTotal(); //ACUMULADOR - Soma TODAS as ordens cadastradas
			    }
			    System.out.println("Faturamento total: R$ " + total+"\n");
				
				break;
				
			case 4:
				System.out.print("--- ALTERAR STATUS DE UMA ORDEM ---\n");
				if(ordens.isEmpty()) { //Verifica se existem ordens
					System.out.print("Nenhuma ordem foi cadastrada.\n");
				}
				System.out.print("Digite o número da ordem: ");
				int indice = teclado.nextInt() -1;
				teclado.nextLine();
				
				if(indice >= 0 && indice < ordens.size()) { //Validação de índice
					System.out.print("Novo status: ");
					String status = teclado.nextLine();
					
					ordens.get(indice).alterarStatus(status); //Modifica diretamente o OBJETO
					System.out.print("Status atualizado!\n");
				} else {
					System.out.print("Ordem inválida!\n");
				}
				
				break;
				
				case 5:
				System.out.print("\n--- CADASTRAR NOVO CLIENTE ---");
				System.out.print("\nDigite seu nome:");
		        String nome = teclado.nextLine();
		        
		        System.out.print("Digite seu telefone: ");
		        String telefone = teclado.nextLine();
		        
		        System.out.print("Digite seu email: ");
		        String email = teclado.nextLine();
		        
		        Cliente cliente = new Cliente(nome, telefone, email);
		        clientes.add(cliente); //Adiciona na lista de "clientes"
		        
		        break;
		        
				default:
					System.out.print("Programa encerrado.");
			}
		} while(opcao != 0);
		//
	}
} 

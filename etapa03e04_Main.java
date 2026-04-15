package projetoPDS;

/* ETAPAS 3 E 4
FLUXO;
1- Criar cliente
2- Criar Ordem Serviço
3- Mostrar resumo inicial
4- Atualizar dados
5- Mostrar resumo atualizado
*/

import java.util.Scanner;

public class Main { //CLASSE DE EXECUÇÃO
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Dados CLIENTE
        System.out.print("--- REGISTRAR DADOS ---\nDigite seu nome:");
        String nome = teclado.nextLine();
        System.out.print("Digite seu telefone: ");
        String telefone = teclado.nextLine();
        System.out.print("Digite seu email: ");
        String email = teclado.nextLine();
        Cliente cliente = new Cliente(nome, telefone, email); //CRIA o OBJETO CLIENTE

        // Dados ORDEM SERVIÇO
        System.out.print("Informe o problema identficado: ");
        String descricao = teclado.nextLine();
        System.out.print("Informe o valor da hora: ");
        double valorHora = teclado.nextDouble();
        System.out.print("Informe a quantidade de horas: ");
        double qtdeHora = teclado.nextDouble();
        OrdemServico OrSer = new OrdemServico(cliente, descricao, valorHora, qtdeHora); //CRIA o OBJETO ORDEMSERVICO
        
        // Exibe dados iniciais
        OrSer.exibirResumo();

        // Atualização dos dados
        teclado.nextLine();
        System.out.print("\n--- ATUALIZAR DADOS ---\nDigite o novo status: ");
        String novoStatus = teclado.nextLine();
        System.out.print("Informe o novo valor da hora: ");
        double novoValorH = teclado.nextDouble();
        System.out.print("Informe a nova quantidade de horas: ");
        double novaQtdeH = teclado.nextDouble();

        // Teste ATUALIZAÇÕES
        OrSer.alterarStatus(novoStatus);
        OrSer.atualizarValorHora(novoValorH);
        OrSer.atualizarQtdeHora(novaQtdeH);

        // Exibe dados atualizados
        OrSer.exibirResumo();
        teclado.close();
    }
}

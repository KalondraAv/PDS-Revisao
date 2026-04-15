package projetoPDS;

/* ETAPAS 3 E 4
Criar a classe OrdemServico
Adicionar atributos (cliente, descrição, valorHora, horas)
Criar um construtor
Implementar calcularTotal()
Implementar exibirResumo()
*
Adicionar atributo status
Criar método alterarStatus()
Criar métodos para atualizar horas e valor
Garantir que o resumo reflita sempre o estado atual

Sempre que um atributo muda, o objeto precisa continuar consistente.
Teste alterações e veja se o cálculo continua correto.
*/

public class OrdemServico { //CLASSE PRINCIPAL - Associação com Cliente

    private Cliente cliente; //OBJETO Cliente
    private String descricao;
    private double valorHora;
    private double qtdeHora;
    private String status;
    
    // MÉTODO CONSTRUTOR - Controle de estado
    public OrdemServico(Cliente cliente, String descricao, double valorHora, double qtdeHora) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.valorHora = valorHora;
        this.qtdeHora = qtdeHora;
        this.status = "Aberto"; //Padrão
    }

    // MÉTODO calcularTotal() - Não armazena, sempre recalcula
    public double calcularTotal() {
        return valorHora * qtdeHora;
    }
    
    // MÉTODO alterarStatus() - Permite modoficar o estado do objeto - Sem validação ou verificação
    public void alterarStatus(String novoStatus) {
        	this.status = novoStatus; //método para comparar STRINGS por CONTEÚDO
    }

    // MÉTODO atualizarValorHora() - Permite modificar o estado do objeto
    public void atualizarValorHora(double novoValor) {
        	this.valorHora = novoValor;

    }
    
    // MÉTODO atualizarQtdeHora() - Permite modificar o estado do objeto - Sem validação ou verificação
    public void atualizarQtdeHora(double novaQtde) {
        	this.qtdeHora = novaQtde;
    }
    
    // MÉTODO exibirResumo() - O resumo acomapanha sempre o estado atual
    public void exibirResumo() {
        System.out.println("\n--- Resumo da Ordem de Serviço ---");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Problema: " + descricao);
        System.out.println("Valor da hora: " + valorHora);
        System.out.println("Quantidade de horas trabalhadas: " + qtdeHora);
        System.out.println("Status: " + status);
        System.out.println("Total: " + calcularTotal());
    }
}

package projetoPDS;

/*  ETAPA 5
Criar classe Cliente
Adicionar nome, telefone e email
Associar Cliente à OrdemServico
Atualizar o resumo para exibir dados do cliente
*/

public class Cliente { //Dados do cliente
    private String nome;
    private String telefone;
    private String email;

    //MÉTODO CONSTRUTOR
    public Cliente(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    // MÉTODOS GET
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}

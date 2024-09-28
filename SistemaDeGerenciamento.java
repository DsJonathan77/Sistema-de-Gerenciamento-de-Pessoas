public class SistemaDeGerenciamento {
    public static void main(String[] args) {
        GerenciadorDePessoas gerenciador = new GerenciadorDePessoas();

        // Cadastro de duas pessoas
        Pessoa pessoa1 = new Pessoa("João", "123.456.789-00", 25);
        Pessoa pessoa2 = new Pessoa("Maria", "987.654.321-00", 30);

        gerenciador.cadastrarPessoa1(pessoa1);
        gerenciador.cadastrarPessoa2(pessoa2);

        // Exibição das pessoas cadastradas
        System.out.println("Dados cadastrados:");
        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();

        // Atualização de dados
        Pessoa novaPessoa1 = new Pessoa("João Silva", "123.456.789-00", 26);
        gerenciador.atualizarPessoa1(novaPessoa1);

        // Exibição após atualização
        System.out.println("\nDados após atualização:");
        gerenciador.exibirPessoa1();
    }
}

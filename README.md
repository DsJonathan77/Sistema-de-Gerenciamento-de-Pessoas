Sistema de Gerenciamento de Pessoas

Breve descrição do sistema
O Sistema de Gerenciamento de Pessoas é uma aplicação Java que permite o cadastro, consulta e atualização de informações de indivíduos. O sistema utiliza conceitos de programação orientada a objetos, como encapsulamento, para gerenciar os dados de forma eficiente e segura. O usuário pode cadastrar até duas pessoas, visualizar suas informações e atualizar os dados quando necessário.

Instruções de compilação e execução
Para compilar e executar o sistema, siga os passos abaixo:

1. Certifique-se de que o Java JDK esteja instalado em sua máquina. Você pode baixá-lo em [Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) ou [AdoptOpenJDK](https://adoptopenjdk.net/).

2. Navegue até a pasta do projeto no terminal ou PowerShell.

3. Compile os arquivos Java com o seguinte comando:
   ```bash
   javac src/*.java
Execute a aplicação usando o seguinte comando:
bash
java -cp src SistemaDeGerenciamento
Exemplo de uso
Ao executar o sistema, o usuário será solicitado a cadastrar duas pessoas. Após o cadastro, é possível visualizar as informações e atualizar os dados conforme necessário. Aqui está um exemplo de interação:

yaml
Copiar código
Cadastre a primeira pessoa:
Nome: Jonathan
CPF: 123.456.789-00
Idade: 22

Cadastre a segunda pessoa:
Nome: Maria
CPF: 987.654.321-00
Idade: 30

Exibindo informações cadastradas:
Pessoa 1: Jonathan, CPF: 123.456.789-00, Idade: 22
Pessoa 2: Maria, CPF: 987.654.321-00, Idade: 30
Explicação de como a lógica de encapsulamento foi aplicada no sistema
A lógica de encapsulamento foi aplicada através da definição de atributos privados nas classes Pessoa e GerenciadorDePessoas. Os atributos, como nome, cpf e idade, são acessados e modificados somente através de métodos públicos (getters e setters). Isso garante que o acesso aos dados seja controlado, permitindo que o sistema mantenha a integridade e a segurança das informações dos indivíduos cadastrados. Por exemplo:

java
public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Outros métodos...
}

Com essa abordagem, qualquer modificação nos atributos passa por uma validação que pode ser implementada nos métodos, assegurando que os dados estejam sempre em um estado válido.

Finalizando
- Adicione tudo isso no seu `README.md`.
- Salve o arquivo, faça um commit e envie para o GitHub.

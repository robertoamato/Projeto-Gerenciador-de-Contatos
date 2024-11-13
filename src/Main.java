import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorContatos gerenciador = new GerenciadorContatos();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\nGerenciador de Contatos");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Contatos");
            System.out.println("3. Remover Contato");
            System.out.println("4. Atualizar Contato");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    gerenciador.adicionarContato(new Contato(nome, email, telefone));
                    break;
                case 2:
                    gerenciador.listarContatos();
                    break;
                case 3:
                    System.out.print("Nome do contato a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    gerenciador.removerContato(nomeRemover);
                    break;
                case 4:
                    System.out.print("Nome do contato a ser atualizado: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Novo Nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo Email: ");
                    String novoEmail = scanner.nextLine();
                    System.out.print("Novo Telefone: ");
                    String novoTelefone = scanner.nextLine();
                    gerenciador.atualizarContato(nomeAtualizar, new Contato(novoNome, novoEmail, novoTelefone));
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}

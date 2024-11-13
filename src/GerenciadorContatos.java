import java.util.ArrayList;
import java.util.List;

public class GerenciadorContatos {
    private List<Contato> contatos;

    public GerenciadorContatos() {
        this.contatos = new ArrayList<>();
    }

    // Adicionar contato
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    // Listar todos os contatos
    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
        } else {
            contatos.forEach(contato -> System.out.println(contato.toString()));
        }
    }

    // Remover contato pelo nome
    public void removerContato(String nome) {
        contatos.removeIf(contato -> contato.getNome().equalsIgnoreCase(nome));
        System.out.println("Contato removido com sucesso.");
    }

    // Atualizar contato
    public void atualizarContato(String nome, Contato novoContato) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNome(novoContato.getNome());
                contato.setEmail(novoContato.getEmail());
                contato.setTelefone(novoContato.getTelefone());
                System.out.println("Contato atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }
}

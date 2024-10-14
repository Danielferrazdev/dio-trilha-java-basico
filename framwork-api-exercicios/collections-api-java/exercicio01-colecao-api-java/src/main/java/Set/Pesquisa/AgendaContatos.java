package main.java.Set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {

    // atributo
    public Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        // contato == 0;
        contatoSet.add(new Contato(nome, numero));
    }

    // exibir todos os contatos
    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    // pesquisar por nome
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) { // só o primeiro nome
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    // retornando o contato atualizado
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("daniel", 1234);
        agendaContatos.adicionarContato("paulo", 7899);
        agendaContatos.adicionarContato("paulo jose", 11111);

        System.out.println("Todos os contato sao : ");
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("paulo"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("paulo jose", 44443333));
    }
}

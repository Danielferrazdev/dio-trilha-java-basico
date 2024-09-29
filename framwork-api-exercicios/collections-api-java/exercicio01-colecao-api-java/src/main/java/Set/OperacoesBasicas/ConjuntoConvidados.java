package main.java.Set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {
    // atributo
    private Set<Convidado> ConvidadoSet;

    // construtor
    public ConjuntoConvidados() {
        this.ConvidadoSet = new HashSet<>();
    }

    // adicionando convidado
    public void adicionarConvidado(String nome, int codigoConvite) {
        ConvidadoSet.add(new Convidado(nome, codigoConvite));
    }

    // removendo convidado pelo codigoConvite
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        // Agora vai passar dentro de cada convite, dentro dp ConvidadoList
        for (Convidado c : ConvidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        ConvidadoSet.remove(convidadoParaRemover);
    }

    // contando o número total de convidados
    public int contarConvidados() {
        return ConvidadoSet.size();
    }

    // Exibindo todos os convidados
    public void exibirConvidados() {
        System.out.println(ConvidadoSet);
    }

    // exibindo os resultado das perguntas
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out
                .println("Exsite " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

        // Adicionando itens ao carrinho
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        // listando os convidados
        conjuntoConvidados.exibirConvidados();

        System.out
                .println("Exsite " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

        // Após remover convidado pelo codigoConvidado
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1235);

        System.out
                .println("Exsite " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

    }
}

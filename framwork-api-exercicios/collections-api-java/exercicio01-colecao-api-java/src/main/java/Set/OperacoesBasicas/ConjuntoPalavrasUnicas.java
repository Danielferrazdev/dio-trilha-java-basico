package main.java.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    // atributo
    private Set<Palavra> palavraSet;

    // construtor
    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    // adicinionando as palavras
    public void adicionarPalavra(String palavra) {
        palavraSet.add(new Palavra(palavra));
    }

    // removendo uma palavra do conjunto
    public void removerPalavra(String palavra) {
        Palavra palavraParaRemover = null;
        // agora vai passar em todas as palavras do conjunto pra encontrar a que deseja
        // excluir
        for (Palavra p : palavraSet) {
            if (p.getPalavra() == palavra) {
                palavraParaRemover = p;
                break;
            }
        }
        palavraSet.remove(palavraParaRemover);

    }

    public Set<Palavra> verificarPalavra(String palavra) {
        Set<Palavra> nomePalavra = new HashSet<>();
        if (!palavraSet.isEmpty()) {
            for (Palavra p : palavraSet) {
                if (p.getPalavra().equalsIgnoreCase(palavra)) {
                    nomePalavra.add(p);
                }
            }
        }
        return nomePalavra;
    }

    // exibir todas as palavras do conjunto
    public void exibirPalavrasUnicas() {
        System.out.println(palavraSet);
    }

    // exibindo os resultados
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        // adicionando informações (palavras)
        conjuntoPalavrasUnicas.adicionarPalavra("JAVA");
        conjuntoPalavrasUnicas.adicionarPalavra("C++");
        conjuntoPalavrasUnicas.adicionarPalavra("PYTHON");
        conjuntoPalavrasUnicas.adicionarPalavra("C++");
        conjuntoPalavrasUnicas.adicionarPalavra("JAVASCRIPT");
        conjuntoPalavrasUnicas.adicionarPalavra("RUBY");

        // exibir as palavras
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        // remover palavra
        conjuntoPalavrasUnicas.removerPalavra("C++");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        // validar se a palavra se encontra no conjunto
        System.out.println("A palavra JAVA está no conjunto " + conjuntoPalavrasUnicas.verificarPalavra("JAVA"));

        // nova validação
        // conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}

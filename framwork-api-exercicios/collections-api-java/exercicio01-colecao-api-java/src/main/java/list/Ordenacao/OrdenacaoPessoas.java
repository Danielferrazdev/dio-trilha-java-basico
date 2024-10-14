package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> PessoaList;

    public OrdenacaoPessoas() {
        PessoaList = new ArrayList<>(); // PessoaList = new ArrayList<>() QUAL A DIFERENÇA?
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        PessoaList.add(new Pessoa(nome, idade, altura));
    }

    // colocando em ordem por idade, tem tb uma configuracao na classe pessoa, pra
    // dar certo (COMPARABLE)
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(PessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    // colocar em ordem usando o COMPARATOR, tem q criar uma class dentro da classe
    // pessoa
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(PessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Nome 1", 20, 1.70);
        ordenacaoPessoas.adicionarPessoa("Nome 2", 30, 1.93);
        ordenacaoPessoas.adicionarPessoa("Nome 3", 24, 1.80);
        ordenacaoPessoas.adicionarPessoa("Nome 4", 18, 1.40);

        System.out.println("Ordem por Idade...: " + ordenacaoPessoas.ordenarPorIdade());
        System.out.println("Ordem por altura...: " + ordenacaoPessoas.ordenarPorAltura());

    }
}

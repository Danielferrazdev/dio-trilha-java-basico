package main.java.list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {

    // atributos
    private String nome;
    private int idade;
    private double altura;

    // construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // configuração pra dar certo a ordem por idade
    @Override
    public int compareTo(Pessoa p) {
        // throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
        return Integer.compare(this.idade, p.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }

}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        // throw new UnsupportedOperationException("Unimplemented method 'compare'");
        // return Double.compare(0, 0)
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

}

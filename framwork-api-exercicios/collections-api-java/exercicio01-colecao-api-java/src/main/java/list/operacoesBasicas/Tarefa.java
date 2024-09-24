package main.java.list.operacoesBasicas;

public class Tarefa {

    private String descricao;

    // construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String toString() {
        return descricao;
    }
}

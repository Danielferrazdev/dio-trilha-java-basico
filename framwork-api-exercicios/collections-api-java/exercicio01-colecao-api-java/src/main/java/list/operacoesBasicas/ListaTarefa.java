package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // atributo
    private List<Tarefa> tarefaList;

    // construtor
    private ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // adicionando tarefa na lista
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    // removendo tarefa da lista
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        // vai passar dentro de cada tarefas dentro da tarefalist
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    // obtendo o número total de tarefas na lista (sempre precisar imprimir as
    // taerfas, mostrar só a quantidade "public int")
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    // obtendo a descrição de todas as tarefas na lista (essa vai precisar imprimir
    // as descrções "public void")
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");
        System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("tarefa 2");
        System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }

}

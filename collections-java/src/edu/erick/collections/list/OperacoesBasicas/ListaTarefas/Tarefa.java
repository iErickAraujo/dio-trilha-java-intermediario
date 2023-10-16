package edu.erick.collections.list.OperacoesBasicas.ListaTarefas;

public class Tarefa {
    // atributo
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Descrição da Tarefa = " + descricao;
    }
   
}

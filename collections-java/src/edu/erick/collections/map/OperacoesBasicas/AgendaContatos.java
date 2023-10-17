package edu.erick.collections.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // atributo
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()) {
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Erick", 123456);
        agendaContatos.adicionarContato("Erick", 5665);
        agendaContatos.adicionarContato("Erick Araújo", 1111111);
        agendaContatos.adicionarContato("Erick Fernando", 654987);
        agendaContatos.adicionarContato("Fernando", 1111111);
        agendaContatos.adicionarContato("Erick", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Erick Araújo");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Erick Fernando"));
    }
}

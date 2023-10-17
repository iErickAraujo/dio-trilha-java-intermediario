package edu.erick.collections.set.Pesquisa.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarConato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pequisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contato : contatosPorNome) {
            if (contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarConato("Erick", 123456);
        agendaContatos.adicionarConato("Erick", 654321);
        agendaContatos.adicionarConato("Erick Araujo", 111111);
        agendaContatos.adicionarConato("Erick Java", 222222);
        agendaContatos.adicionarConato("Fernando", 11111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pequisarPorNome("Fernando"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Fernando", 33333));
    }
}

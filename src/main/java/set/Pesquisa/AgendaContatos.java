package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        this.contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosEncontrados = new HashSet<>();
        if(!this.contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if(c.getNome().startsWith(nome)) {
                    contatosEncontrados.add(c);
                }
            }
        }
        return contatosEncontrados;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        //agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila Dio", 654987);
        agendaContatos.adicionarContato("Samuel", 654123);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Camila"));
    }
    
}

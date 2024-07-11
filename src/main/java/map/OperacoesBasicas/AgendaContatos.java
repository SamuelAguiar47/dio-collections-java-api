package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero) {
        this.agendaContatoMap.put(nome, numero);
    }

    public void removerContato(String nome) {
        if (!this.agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        
        if (!agendaContatoMap.isEmpty()) {
            return agendaContatoMap.get(nome);
        } else {
            return null;
        }
        
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila Dio", 654987);
        agendaContatos.adicionarContato("Samuel", 654123);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Camila Cavalcante");
        agendaContatos.exibirContatos();

        System.out.println("O número é: "+agendaContatos.pesquisarPorNome("Camila Dio"));

    }
}

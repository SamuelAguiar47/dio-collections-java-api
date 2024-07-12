package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    //Atributos
    private Map<LocalDate, Evento> eventosMap;
    
    //Construtor
    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    //Métodos
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        this.eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda9() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        //Set<LocalDate> dataSet = eventosMap.keySet();
        //Collection<Evento> values = eventosMap.values();
        //eventosMap.get();

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento é "+entry.getValue()+"e acontecerá na data"+entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
    }
}

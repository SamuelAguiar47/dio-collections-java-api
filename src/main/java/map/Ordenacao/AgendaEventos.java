package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
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

    public void exibirAgenda() {
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
                System.out.println("O próximo evento é "+entry.getValue()+"e acontecerá na data "+entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.APRIL, 9), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 7, 22), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2021, Month.APRIL, 25), "Evento 3", "Atracao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 12), "Evento 4", "Atracao 4");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.MARCH, 4), "Evento 5", "Atracao 5");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.SEPTEMBER, 18), "Evento 6", "Atracao 6");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 12), "Evento 7", "Atracao 7");
        
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}

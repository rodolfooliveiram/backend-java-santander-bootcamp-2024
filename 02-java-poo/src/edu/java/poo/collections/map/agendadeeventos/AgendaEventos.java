package edu.java.poo.collections.map.agendadeeventos;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

	Map<LocalDate, Evento> agendaEventos;
	
	public AgendaEventos() {
		this.agendaEventos = new TreeMap<>();
	}

	
	public void adicionarEvento(int dia, int mes, int ano, String nome, String atracao) {
		agendaEventos.put(LocalDate.of(ano, mes, dia), new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		if(!agendaEventos.isEmpty()) {
			System.out.println(agendaEventos);
		} else {
			System.out.println("A agenda de eventos está vazia!");
		}
	}
	
	public void obterProximoEvento() {
		if(!agendaEventos.isEmpty()) {
			for(Map.Entry<LocalDate, Evento> e : agendaEventos.entrySet()) {
				if(e.getKey().equals(LocalDate.now()) || e.getKey().isAfter(LocalDate.now())) {
					System.out.println("Dia: " + e.getKey());
					System.out.println("Evento: " + e.getValue().getNome());
					System.out.println("Atração principal: " + e.getValue().getAtracao());
					break;
				}
			}
		} else {
			System.out.println("A agenda de eventos está vazia!");
		}
	}
}

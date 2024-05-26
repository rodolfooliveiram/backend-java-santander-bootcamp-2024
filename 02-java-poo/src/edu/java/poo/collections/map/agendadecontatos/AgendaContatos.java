package edu.java.poo.collections.map.agendadecontatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

	private Map<String, Integer> agendaTelefonica;
	
	public AgendaContatos() {
		this.agendaTelefonica = new HashMap<>();
	}
	
	public void adicionarContato(String nome, int telefone) {
		agendaTelefonica.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!agendaTelefonica.isEmpty()) {
			
			if(agendaTelefonica.containsKey(nome)) {
				agendaTelefonica.remove(nome);
			} else {
				System.out.println("Nenhum contato encontrado.");
			}
			
		} else {
			System.out.println("A agenda está vazia!");
		}
	}
	
	public void exibirContatos() {		
		if(!agendaTelefonica.isEmpty()) {
			System.out.println(agendaTelefonica);
		} else {
			System.out.println("A agenda está vazia!");
		}
	}
	
	public int pesquisarPorNome(String nome) {
		
		if(!agendaTelefonica.isEmpty()) {
			
			if(agendaTelefonica.containsKey(nome)) {
				return agendaTelefonica.get(nome);
			} else {
				throw new RuntimeException("Nenhum contato encontrado.");
			}
			
		} else {
			throw new RuntimeException("A agenda está vazia!");
		}
	}
	
}

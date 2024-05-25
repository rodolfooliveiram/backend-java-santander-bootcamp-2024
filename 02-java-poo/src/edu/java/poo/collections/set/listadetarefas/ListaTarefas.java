package edu.java.poo.collections.set.listadetarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

	private Set<Tarefa> minhasTarefas;
	
	public ListaTarefas() {
		this.minhasTarefas = new HashSet<>();
	}
	
	public void adicionarTarefa(String descricao) {
		minhasTarefas.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		
		if(!minhasTarefas.isEmpty()) {
			Tarefa tarefaParaRemocao = null;
			
			for(Tarefa t : minhasTarefas) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					tarefaParaRemocao = t;
					break;
				}
			}
			
			minhasTarefas.remove(tarefaParaRemocao);
		} else {
			System.out.println("Sua lista está vazia!");
		}
	}
	
	public void exibirTarefas() {
		if(!minhasTarefas.isEmpty()) {
			System.out.println(minhasTarefas);
		} else {
			System.out.println("Sua lista está vazia!");
		}
	}
	
	public int contarTarefas() {
		return minhasTarefas.size();
	}
	
	public Set<Tarefa> obterTarefasConcluidas() {
		
		if(!minhasTarefas.isEmpty()) {
			Set<Tarefa> tarefasConcluidas = new HashSet<>();
			
			for(Tarefa t : minhasTarefas) {
				if(t.isConcluida()) {
					tarefasConcluidas.add(t);
				}
			}
			
			return tarefasConcluidas;
		} else {
			throw new RuntimeException("Sua lista está vazia!");
		}
	}
	
	public Set<Tarefa> obterTarefasPendentes() {
		
		if(!minhasTarefas.isEmpty()) {
			Set<Tarefa> tarefasPendentes = new HashSet<>();
			
			for(Tarefa t : minhasTarefas) {
				if(!t.isConcluida()) {
					tarefasPendentes.add(t);
				}
			}
			
			return tarefasPendentes;
		} else {
			throw new RuntimeException("Sua lista está vazia!");
		}
	}
	
	public void marcarTarefaConcluida(String descricao) {
		
		if(!minhasTarefas.isEmpty()) {
			for(Tarefa t : minhasTarefas) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setConcluida(true);
					break;
				}
			}
		} else {
			System.out.println("Sua lista está vazia!");
		}
	}
	
	public void marcarTarefaPendente(String descricao) {
		
		if(!minhasTarefas.isEmpty()) {
			for(Tarefa t : minhasTarefas) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setConcluida(false);
					break;
				}
			}
		} else {
			System.out.println("Sua lista está vazia!");
		}		
	}
	
	public void limparListaTarefas() {
		if(!minhasTarefas.isEmpty()) {
			Set<Tarefa> tarefasParaRemocao = new HashSet<>(minhasTarefas);
			
			minhasTarefas.removeAll(tarefasParaRemocao);
			
			System.out.println("Todas as tarefas foram removidas.");
		} else {
			System.out.println("Sua lista está vazia!");
		}
	}
}

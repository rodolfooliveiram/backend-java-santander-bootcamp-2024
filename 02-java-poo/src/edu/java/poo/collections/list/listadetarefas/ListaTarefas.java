package edu.java.poo.collections.list.listadetarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	
	private List<Tarefa> minhasTarefas;
	
	public ListaTarefas() {
		this.minhasTarefas = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		Tarefa novaTarefa = new Tarefa(descricao);
		minhasTarefas.add(novaTarefa);
	}
	
	public void removerTarefa(String descricao) {
		
		List<Tarefa> tarefasParaRemocao = new ArrayList<>();
		
		for(Tarefa tarefa : minhasTarefas) {
			if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemocao.add(tarefa);
			}
		}
		
		minhasTarefas.removeAll(tarefasParaRemocao);
	}
	
	public int obterNumeroTotalTarefas() {
		return minhasTarefas.size();
	}
	
	public void obterDescricoesTarefas() {	
		for(Tarefa t : minhasTarefas) {
			System.out.println(t.getDescricao());
		}
	}

}

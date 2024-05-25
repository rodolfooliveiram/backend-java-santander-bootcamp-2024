package edu.java.poo.collections.set.agendadecontatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	Set<Contato> meusContatos;
	
	public AgendaContatos() {
		this.meusContatos = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int telefone) {
		meusContatos.add(new Contato(nome, telefone));
	}
	
	public void exibirContatos() {
		System.out.println(meusContatos);
	}
	
	public Set<Contato> pesquisarPorNome(String nome) {
		
		Set<Contato> contatosPorNome = new HashSet<>();
		
		for(Contato c : meusContatos) {
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		
		return contatosPorNome;
	}
	
	public Contato atualizarTelefoneContato(String nome, int telefone) {
		
		Contato contatoAtualizado = null;
		
		for(Contato c : meusContatos) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setTelefone(telefone);
				contatoAtualizado = c;
				break;
			}
		}
		
		return contatoAtualizado;
	}
	
}

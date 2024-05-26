package edu.java.poo.collections.map.dicionario;

import java.util.Map;
import java.util.TreeMap;

public class Dicionario {
	
	private Map<String, String> dicionario;
	
	public Dicionario() {
		this.dicionario = new TreeMap<>();
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		dicionario.put(palavra, definicao);
	}
	
	public void removerPalavra(String palavra) {
		if(!dicionario.isEmpty()) {
			if(dicionario.containsKey(palavra)) {
				dicionario.remove(palavra);
			} else {
				System.out.println("Palavra não encontrada.");
			}
		} else {
			System.out.println("Seu dicionário está vazio!");
		}
	}
	
	public void exibirPalavras() {		
		if(!dicionario.isEmpty()) {
			System.out.println(dicionario);
		} else {
			System.out.println("Seu dicionário está vazio!");
		}
	}
	
	public String pesquisarPorPalavra(String palavra) {
		if(!dicionario.isEmpty()) {
			if(dicionario.containsKey(palavra)) {
				return dicionario.get(palavra);
			} else {
				throw new RuntimeException("Palavra não encontrada.");
			}
		} else {
			throw new RuntimeException("Seu dicionário está vazio!");
		}
	}
}

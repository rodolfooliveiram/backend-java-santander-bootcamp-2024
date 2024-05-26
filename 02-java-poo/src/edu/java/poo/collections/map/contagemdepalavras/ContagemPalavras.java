package edu.java.poo.collections.map.contagemdepalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	
	private Map<String, Integer> contagemPalavras;
	
	public ContagemPalavras() {
		this.contagemPalavras = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, int contagem) {
		contagemPalavras.put(palavra, contagem);
	}
	
	public void removerPalavra(String palavra) {
		if(!contagemPalavras.isEmpty()) {
			if(contagemPalavras.containsKey(palavra)) {
				contagemPalavras.remove(palavra);
			} else {
				System.out.println("Palavra não encontrada.");
			}
		} else {
			System.out.println("A contagem de palavras está vazia!");
		}
	}
	
	public void exibirContagemPalavras() {	
		if(!contagemPalavras.isEmpty()) {
			System.out.println(contagemPalavras);
		} else {
			System.out.println("A contagem de palavras está vazia!");
		}
	}
	
	public void encontrarPalavraMaisFrequente() {
		if(!contagemPalavras.isEmpty()) {
			Map.Entry<String, Integer> palavraMaisFrequente = null;
			int maiorContagem = Integer.MIN_VALUE;
			
			for(Map.Entry<String, Integer> p : contagemPalavras.entrySet()) {
				if(p.getValue() > maiorContagem) {
					palavraMaisFrequente = p;
					maiorContagem = p.getValue();
				}
			}
			
			System.out.println(palavraMaisFrequente);
			
		} else {
			System.out.println("A contagem de palavras está vazia!");
		}
	}
}

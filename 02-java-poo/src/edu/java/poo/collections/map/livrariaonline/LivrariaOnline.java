package edu.java.poo.collections.map.livrariaonline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {

	private Map<String, Livro> livraria;
	
	public LivrariaOnline() {
		this.livraria = new HashMap<>();
	}
	
	public void adicionarLivro(String link, String titulo, String autor, double preco) {
		livraria.put(link, new Livro(titulo, autor, preco));
	}
	
	public void removerLivro(String titulo) {
		if(!livraria.isEmpty()) {
			
//			String livroParaRemocao;			
			for(Map.Entry<String, Livro> l : livraria.entrySet()) {
				if(l.getValue().getTitulo().equalsIgnoreCase(titulo)) {
					livraria.remove(l.getKey());
					System.out.println("Livro removido.");
					break;
				} 
			}
		} else {
			System.out.println("Ainda não há livros na livraria!");
		}
	}
	
	public void exibirLivros() {
		System.out.println(livraria);
	}
	
	public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
		if(!livraria.isEmpty()) {
			List<Map.Entry<String, Livro>> livrosParaOrdenacao = new ArrayList<>(livraria.entrySet());
			
			Collections.sort(livrosParaOrdenacao, new ComparatorPorPreco());
			
			Map<String, Livro> livrosPorPreco = new LinkedHashMap<>();
			
			for(Map.Entry<String, Livro> l : livrosParaOrdenacao) {
				livrosPorPreco.put(l.getKey(), l.getValue());
			}			
			return livrosPorPreco;
			
		} else {
			throw new RuntimeException("Ainda não há livros na livraria!");
		}
	}
	
	public Map<String, Livro> exibirLivrosOrdenadosPorTitulo() {
		if(!livraria.isEmpty()) {
			List<Map.Entry<String, Livro>> livrosParaOrdenacao = new ArrayList<>(livraria.entrySet());
			
			Collections.sort(livrosParaOrdenacao, new ComparatorPorTitulo());
			
			Map<String, Livro> livrosPorTitulo = new LinkedHashMap<>();
			
			for(Map.Entry<String, Livro> l : livrosParaOrdenacao) {
				livrosPorTitulo.put(l.getKey(), l.getValue());
			}			
			return livrosPorTitulo;
			
		} else {
			throw new RuntimeException("Ainda não há livros na livraria!");
		}
	}
	
	public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
		if(!livraria.isEmpty()) {
			
			Map<String, Livro> livrosPorAutor = new HashMap<>();
			
			for(Map.Entry<String, Livro> l : livraria.entrySet()) {
				if(l.getValue().getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.put(l.getKey(), l.getValue());
				} 
			}			
			return livrosPorAutor;
			
		} else {
			throw new RuntimeException("Ainda não há livros na livraria!");
		}
	}
	
	public Map.Entry<String, Livro> obterLivroMaisCaro() {
		if(!livraria.isEmpty()) {
			
			Map.Entry<String, Livro> livroMaisCaro = null;
			double maiorPreco = Double.MIN_VALUE;
			
			for(Map.Entry<String, Livro> l : livraria.entrySet()) {
				if(l.getValue().getPreco() > maiorPreco) {
					livroMaisCaro = l;
					maiorPreco = l.getValue().getPreco();
				}
			}			
			return livroMaisCaro;
			
		} else {
			throw new RuntimeException("Ainda não há livros na livraria!");
		}
	}
	
	public Map.Entry<String, Livro> obterLivroMaisBarato() {
		if(!livraria.isEmpty()) {
			
			Map.Entry<String, Livro> livroMaisBarato = null;
			double menorPreco = Double.MAX_VALUE;
			
			for(Map.Entry<String, Livro> l : livraria.entrySet()) {
				if(l.getValue().getPreco() < menorPreco) {
					livroMaisBarato = l;
					menorPreco = l.getValue().getPreco();
				}
			}			
			return livroMaisBarato;
			
		} else {
			throw new RuntimeException("Ainda não há livros na livraria!");
		}
	}
}

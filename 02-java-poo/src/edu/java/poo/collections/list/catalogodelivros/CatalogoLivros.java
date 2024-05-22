package edu.java.poo.collections.list.catalogodelivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	List<Livro> meuCatalogo;
	
	public CatalogoLivros() {
		this.meuCatalogo = new ArrayList<>();
	}
	
	public void adicionarLivro(String nome, String titulo, int anoPublicacao) {
		meuCatalogo.add(new Livro(nome, titulo, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		
		if(!meuCatalogo.isEmpty()) {
			for(Livro l : meuCatalogo) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		
		if(!meuCatalogo.isEmpty()) {
			for(Livro l : meuCatalogo) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(l);
				}
			}
		}
		
		return livrosPorIntervaloAnos;		
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		
		if(!meuCatalogo.isEmpty()) {
			for(Livro l : meuCatalogo) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		
		return livroPorTitulo;	
	}
}

package edu.java.poo.collections.map.livrariaonline;

public class Livro {

	private String titulo;
	private String autor;
	private double preco;
	
	public Livro(String titulo, String autor, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "[" + titulo + ", " + autor + ", " + preco + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public double getPreco() {
		return preco;
	}	
}

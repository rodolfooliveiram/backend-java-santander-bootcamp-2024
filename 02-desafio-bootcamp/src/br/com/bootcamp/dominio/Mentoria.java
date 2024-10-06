package br.com.bootcamp.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate data;	
	
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentoria [titulo=" + this.getTitulo() + ", descricao=" + this.getDescricao() + ", data=" + data + "]";
	}

	
	
	
	
}

package edu.java.poo.collections.set.conjuntodeconvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	private Set<Convidado> listaConvidados;
	
	public ConjuntoConvidados() {
		this.listaConvidados = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		listaConvidados.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidado(int codigoConvite) {
		
		Convidado convidadoParaRemocao = null;
		
		if(!listaConvidados.isEmpty()) {
			for(Convidado c : listaConvidados) {
				if(c.getCodigoConvite() == codigoConvite) {
					convidadoParaRemocao = c;
				}
			} 
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
		
		listaConvidados.remove(convidadoParaRemocao);
	}
	
	public int contarConvidados() {
		return listaConvidados.size();
	}
	
	public void exibirConvidados() {
		if(!listaConvidados.isEmpty()) {
			System.out.println(listaConvidados);
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
}

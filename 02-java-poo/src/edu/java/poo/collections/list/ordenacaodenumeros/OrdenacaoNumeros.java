package edu.java.poo.collections.list.ordenacaodenumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

	List<Integer> listaNumeros;
	
	public OrdenacaoNumeros() {
		this.listaNumeros = new ArrayList<>();
	}
	
	public List<Integer> getListaNumeros() {
		return listaNumeros;
	}
	
	public void adicionarNumero(int numero) {
		listaNumeros.add(numero);
	}
	
	public List<Integer> ordenarAscendente() {
		
		if(!listaNumeros.isEmpty()) {
			List<Integer> listaAscendente = new ArrayList<>(listaNumeros);
			Collections.sort(listaAscendente);
			return listaAscendente;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public List<Integer> ordenarDescendente() {
		if(!listaNumeros.isEmpty()) {
			List<Integer> listaDescendente = new ArrayList<>(listaNumeros);
			listaDescendente.sort(Collections.reverseOrder());
			return listaDescendente;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
}

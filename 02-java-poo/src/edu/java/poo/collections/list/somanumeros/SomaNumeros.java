package edu.java.poo.collections.list.somanumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

	private List<Integer> listaNumeros;
	
	public SomaNumeros() {
		this.listaNumeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		listaNumeros.add(numero);
	}
	
	public int calcularSoma() {
		if(!listaNumeros.isEmpty()) {
			int soma = 0;
			for(Integer n : listaNumeros) {
				soma += n;
			}			
			return soma;
			
		} else {
			System.out.println("A lista está vazia!");
			return 0;
		}
	}
	
	public int encontrarMaiorNumero() {
		
		if(!listaNumeros.isEmpty()) {
			int maiorNumero = Integer.MIN_VALUE;			
			
			for(Integer n : listaNumeros) {
				if(n > maiorNumero) {
					maiorNumero = n;
				}
			}			
			return maiorNumero;
			
		} else {
			System.out.println("A lista está vazia!");
			return 0;
		}
		
	}
	
	public int encontrarMenorNumero() {
		
		if(!listaNumeros.isEmpty()) {
			int menorNumero = Integer.MAX_VALUE;			
			
			for(Integer n : listaNumeros) {
				if(n < menorNumero) {
					menorNumero = n;
				}
			}			
			return menorNumero;
			
		} else {
			System.out.println("A lista está vazia!");
			return 0;
		}
		
	}
	
	public List<Integer> exibirNumeros() {
		return this.listaNumeros;
	}

	public String toString() {
		return "SomaNumeros [listaNumeros=" + listaNumeros + "]";
	}
	
	
	
	
}

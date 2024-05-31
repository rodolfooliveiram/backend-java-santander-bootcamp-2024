package edu.java.poo.streamapi.desafio1;

import java.util.Arrays;
import java.util.List;

public class OrdenacaoCrescente {

	public static void main(String[] args) {
	
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		List<Integer> numerosOrdemCrescente = numeros.stream().sorted().toList();
		
		System.out.println("Números em ordem crescente: " + numerosOrdemCrescente);
	}
}

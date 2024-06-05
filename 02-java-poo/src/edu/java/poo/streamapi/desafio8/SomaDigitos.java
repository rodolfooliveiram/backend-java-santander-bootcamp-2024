package edu.java.poo.streamapi.desafio8;

import java.util.Arrays;
import java.util.List;

public class SomaDigitos {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		int soma  = numeros.stream().mapToInt(n -> {
			if(n.toString().length() == 1) {
				return n;
			} else {
				String[] digitos = new String[n.toString().length()];
				digitos = n.toString().split("");
				int somaDigitos = 0;
				for(String digito : digitos) {
					somaDigitos += Integer.parseInt(digito);
				}
				return somaDigitos;
			}
		}).sum();
		
		System.out.println("Soma dos dígitos de todos os números: " + soma);

	}

}

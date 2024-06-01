package edu.java.poo.streamapi.desafio7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class SegundoMaiorNumero {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		 int segundoMaiorNumero = numeros.stream()
				 .sorted(Comparator.reverseOrder())
				 .limit(2)
				 .min(Comparator.naturalOrder())
				 .orElseThrow(() -> new NoSuchElementException("Não foi possível calcular a média."));
		
		System.out.println("O segundo maior número da lista é: " + segundoMaiorNumero);
	}

}

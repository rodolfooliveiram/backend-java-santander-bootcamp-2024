package edu.java.poo.streamapi.desafio4;

import java.util.Arrays;
import java.util.List;

public class RemocaoNumerosImpares {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();
		
		System.out.println("Lista com número impares removidos: " + numerosPares);
	}
	
}

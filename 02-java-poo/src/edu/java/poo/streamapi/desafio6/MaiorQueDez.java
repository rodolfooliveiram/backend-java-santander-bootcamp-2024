package edu.java.poo.streamapi.desafio6;

import java.util.Arrays;
import java.util.List;

public class MaiorQueDez {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		boolean contemMaiorDez = numeros.stream().anyMatch(n -> n > 10);
		
		if(contemMaiorDez) {
			System.out.println("A lista contém pelo menos um número maior que 10.");
		} else {
			System.out.println("A lista não contém nenhum numero maior que 10.");
		}
	}
}

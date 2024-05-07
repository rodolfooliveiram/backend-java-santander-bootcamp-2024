package edu.java.desafios.simulacaobancaria;
import java.util.Scanner;

public class SimulacaoBancaria {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
		double saldo = 0;
		boolean emExcecucao = true;
		
		while (emExcecucao) {
		  
		  int opcao = scanner.nextInt();
		  switch(opcao) {
		    case 0: {
		      System.out.println("Programa encerrado.");
		      emExcecucao = false;
		      break;
		    }
		    case 1: {
		      double deposito = scanner.nextDouble();
		      saldo += deposito;
		      System.out.println("Saldo atual: " + saldo);
		      break;
		    }
		    case 2: {
		      double saque = scanner.nextDouble();
		      if(saque <= saldo) {
		        saldo -= saque;
		        System.out.println("Saldo atual: " + saldo);
		      } else {
		        System.out.println("Saldo insuficiente.");
		      }
		      break;
		    }
		    case 3: {
		      System.out.println("Saldo atual: " + saldo);
		      break;
		    }
		    default: {
		      System.out.println("Opção inválida. Tente novamente.");
		      break;
		    }
		  }
		}
	}
  }
}
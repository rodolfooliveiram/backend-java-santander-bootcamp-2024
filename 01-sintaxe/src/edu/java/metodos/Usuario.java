package edu.java.metodos;

public class Usuario {
	
	public static void main(String[] args) throws Exception {

		SmartTv smartTv = new SmartTv();
		
		smartTv.ligarTv();
		System.out.println(smartTv.ligada ? "TV ligada." : "TV desligada.");
		
		smartTv.selecionarCanal(11);
		System.out.println("Canal atual: " + smartTv.canal);
		
		smartTv.aumentarVolume();
		System.out.println("Volume atual: " + smartTv.volume);

	}

}

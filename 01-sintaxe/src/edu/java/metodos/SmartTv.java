package edu.java.metodos;

public class SmartTv {
	
	public boolean ligada = false;
	public int canal = 7;
	public int volume = 15;
	
	public void ligarTv() {
		ligada = true;
	}
	
	public void desligarTv() {
		ligada = false;
	}
	
	public void aumentarVolume() {
		volume++;
	}
	
	public void diminuirVolume() {
		volume--;
	}
	
	public void passarCanalSeguinte() {
		canal++;
	}
	
	public void voltarCanalAnterior() {
		canal--;
	}
	
	public int selecionarCanal(int canalSelecionado) {
		canal = canalSelecionado;
		return canal;
	}


}

package edu.java.metodos;

/**
 * <h1>SmartTV App</h1>
 * App que simula as funcionalidades básicas de uma SmartTV.
 * 
 * @author Rodolfo Oliveira
 * @version 1.0
 * @since 01/05/2024
 */

public class SmartTv {
	
	public boolean ligada;
	public int canal;
	public int volume;
	
	/**
	 * Método para ligar a TV.
	 */
	public void ligarTv() {
		ligada = true;
	}
	
	/**
	 * Método para desligar a TV.
	 */
	public void desligarTv() {
		ligada = false;
	}
	
	/**
	 * Método para aumentar o volume TV.
	 */
	public void aumentarVolume() {
		volume++;
	}
	
	/**
	 * Método para diminuir o volume TV.
	 */
	public void diminuirVolume() {
		volume--;
	}
	
	/**
	 * Método para passar para o canal seguinte ao canal atual.
	 */
	public void passarCanalSeguinte() {
		canal++;
	}
	
	/**
	 * Método para passar para o canal anterior ao canal atual.
	 */
	public void voltarCanalAnterior() {
		canal--;
	}
	
	/**
	 * Método para mudar o canal atual para um canal específico.
	 * @param canalSelecionado é número inteiro que indica o canal para o qual deseja mudar.
	 */
	public void selecionarCanal(int canalSelecionado) {
		canal = canalSelecionado;
	}


}

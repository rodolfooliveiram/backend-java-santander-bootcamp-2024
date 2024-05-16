package devices.smartphone;

import devices.internet.Navegador;
import devices.music.ReprodutorMusical;
import devices.phone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador {
	
	public void tocar() {
		System.out.println("Tocando música...");
	}
	
	public void pausar() {
		System.out.println("Pausando música...");
	}

	public void selecionarMusica() {
		System.out.println("Selecionando música...");
	}
	
	public void ligar() {
		System.out.println("Ligando...");
	}
	
	public void atender() {
		System.out.println("Atendendo chamada...");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");		
	}
	
	public void exibirPagina() {
		System.out.println("Acessando página...");
	}
	
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba...");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando página...");
	}
}

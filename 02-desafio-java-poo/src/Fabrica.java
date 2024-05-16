import devices.smartphone.Iphone;

public class Fabrica {
	public static void main(String[] args) {
		
		Iphone meuIphone = new Iphone();
		
		meuIphone.tocar();
		meuIphone.pausar();
		meuIphone.selecionarMusica();
		
		meuIphone.ligar();
		meuIphone.atender();
		meuIphone.iniciarCorreioVoz();
		
		meuIphone.exibirPagina();
		meuIphone.adicionarNovaAba();
		meuIphone.atualizarPagina();
	}
}

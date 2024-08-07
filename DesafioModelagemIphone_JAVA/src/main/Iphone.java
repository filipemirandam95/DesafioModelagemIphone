package main;

import java.util.Scanner;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void exibirPagina(String url) {
		System.out.println("A página " + url + " é exibida.");

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada com sucesso.");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada com sucesso.");

	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero + ".");

	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação.");

	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz.");

	}

	@Override
	public void tocar() {
		System.out.println("Tocando a música desejada.");

	}

	@Override
	public void pausar() {
		System.out.println("Música pausada.");

	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Música " + musica + " selecionada.");

	}

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a música desejada");
		String musica = scanner.next();
		iphone.tocar();
		iphone.pausar();
		System.out.println("Informe o número para a ligação");
		String numero = scanner.next();
		iphone.ligar(numero);
		iphone.atender();
		iphone.iniciarCorreioVoz();
		System.out.println("Informe a URL da página");
		String url = scanner.next();
		iphone.exibirPagina(url);
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();

	}
}

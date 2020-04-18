package br.com.marcosjr.cm;

import br.com.marcosjr.cm.modelo.Tabuleiro;
import br.com.marcosjr.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		//Inicializar o jogo em si
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro);
	}
}

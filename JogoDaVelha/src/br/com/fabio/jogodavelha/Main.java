package br.com.fabio.jogodavelha;

/**
 * Classe para lan�ar o jogo
 */
public class Main {

	/**
	 * M�todo main
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// Instancia o jogo e incia
		Jogo jogo = new Jogo();
		jogo.jogar();
	}
}

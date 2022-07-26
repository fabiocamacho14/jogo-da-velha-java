package br.com.fabio.jogodavelha;

/**
 * Exce��o que representa uma exce��o gen�rica do jogo da velha
 */
@SuppressWarnings("serial")
public class JogoDaVelhaException extends Exception {

	/**
	 * @see Exception#Exception(String)
	 */
	public JogoDaVelhaException(String message) {
		super(message);
	}
}

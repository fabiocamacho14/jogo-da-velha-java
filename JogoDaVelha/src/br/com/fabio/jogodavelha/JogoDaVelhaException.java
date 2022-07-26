package br.com.fabio.jogodavelha;

/**
 * Exceção que representa uma exceção genérica do jogo da velha
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

package br.com.fabio.jogodavelha.pontuacao;

import br.com.fabio.jogodavelha.JogoDaVelhaException;

/**
 * Exceção relacionada à problemas na pontuação
 */
@SuppressWarnings("serial")
public class PontuacaoException extends JogoDaVelhaException {

	/**
	 * @see JogoDaVelhaException#JogoDaVelhaException(String)
	 * @param message
	 */
	public PontuacaoException(String message) {
		super(message);
	}
}

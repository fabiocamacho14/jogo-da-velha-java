package br.com.fabio.jogodavelha.pontuacao;

import br.com.fabio.jogodavelha.JogoDaVelhaException;

/**
 * Exce��o relacionada � problemas na pontua��o
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

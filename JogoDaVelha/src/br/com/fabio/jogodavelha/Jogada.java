package br.com.fabio.jogodavelha;

/**
 * Representa uma jogada feita pelo jogador.
 */
public class Jogada {
	
	/**
	 * Posi��o i da matriz relacionada � jogada (linha)
	 */
	private int i;
	
	
	/**
	 * Posi��o j da matriz relacionada � jogada (coluna)
	 */
	private int j;
	
	/**
	 * Construtor.
	 * @param jogada Jogada realizada representada por uma string no formato 'i,j'
	 * @throws JogadaInvalidaException Lan�ada se a jogada foi inv�lida
	 */
	public Jogada(String jogada) throws JogadaInvalidaException {
		parseString(jogada);
	}
	
	/**
	 * Faz o parse da string da jogada.
	 * @param jogada Jogada em formato de string
	 * @throws JogadaInvalidaException Lan�ada se a jogada foi inv�lida
	 */
	private void parseString(String jogada) throws JogadaInvalidaException {
		try {
			// Separa em dois tokens onde o delimitador � a ','
			String[] tokens = jogada.split(",");
			
			// Armazena os tokens nos atributos
			this.i = Integer.parseInt(tokens[0].trim());
			this.j = Integer.parseInt(tokens[1].trim());
		} catch (Exception e) {
			throw new JogadaInvalidaException("A jogada � inv�lida");
		}
	}
	
	/**
	 * Getter do atributo I
	 * @return valor de I
	 */
	public int getI() {
		return i;
	}
	
	/**
	 * Getter do atributo J
	 * @return valor de J
	 */
	public int getJ() {
		return j;
	}
}

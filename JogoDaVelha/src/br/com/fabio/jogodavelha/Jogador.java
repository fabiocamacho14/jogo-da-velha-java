package br.com.fabio.jogodavelha;

import br.com.fabio.jogodavelha.io.Console;

/**
 * Classe que representa um jogador.
 */
public class Jogador {

	/**
	 * Nome do jogador.
	 */
	private String nome;
	/**
	 * Símbolo usado pelo jogador. Ex: 'X' ou 'O'
	 */
	private char simbolo;
	
	/**
	 * Construtor.
	 * @param nome Nome
	 * @param simbolo Símbolo
	 */
	public Jogador(String nome, char simbolo) {
		this.nome = nome;
		this.simbolo = simbolo;
	}
	
	/**
	 * Getter para o atributo nome.
	 * @return O nome do jogador
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Getter para o atributo símbolo.
	 * @return O símbolo do jogador
	 */
	public char getSimbolo() {
		return simbolo;
	}
	
	/**
	 * Lê a jogada do jogador do teclado. Deve ser feita no formato 'i,j'.
	 * @return Jogada realizada
	 * @throws JogadaInvalidaException Lançada se a jogada for inválida
	 */
	public Jogada obterJogada() throws JogadaInvalidaException {
		String str = Console.readString();
		return new Jogada(str);
	}
}

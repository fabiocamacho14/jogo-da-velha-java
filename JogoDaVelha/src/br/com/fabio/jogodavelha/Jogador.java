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
	 * S�mbolo usado pelo jogador. Ex: 'X' ou 'O'
	 */
	private char simbolo;
	
	/**
	 * Construtor.
	 * @param nome Nome
	 * @param simbolo S�mbolo
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
	 * Getter para o atributo s�mbolo.
	 * @return O s�mbolo do jogador
	 */
	public char getSimbolo() {
		return simbolo;
	}
	
	/**
	 * L� a jogada do jogador do teclado. Deve ser feita no formato 'i,j'.
	 * @return Jogada realizada
	 * @throws JogadaInvalidaException Lan�ada se a jogada for inv�lida
	 */
	public Jogada obterJogada() throws JogadaInvalidaException {
		String str = Console.readString();
		return new Jogada(str);
	}
}

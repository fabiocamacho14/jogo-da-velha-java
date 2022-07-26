package br.com.fabio.jogodavelha;

/**
 * Tabuleiro do jogo
 */
public class Tabuleiro {

	/**
	 * Matriz que representa o jogo
	 */
	private char[][] matriz;
	
	/**
	 * Construtor.
	 */
	public Tabuleiro() {
		// Cria a matriz 3x3
		matriz = new char[3][3];
		
		// Zera todos os elementos da matriz
		zerar();
	}
	
	/**
	 * Zera os elementos da matriz. Zerar significa colocar um espa�o em branco em cada posi��o
	 */
	public void zerar() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = ' ';
			}
		}
	}
	
	public void imprimir() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
				if (j < matriz[0].length - 1) {
					System.out.print(" | ");
				}
			}
			System.out.println();
			
			if (i < matriz.length - 1) {
				System.out.println("--------");
			}
		}
		System.out.println();
	}
	
	/**
	 * Realizar a jogada especificada pelo jogador.
	 * @param jogada Jogada feita
	 * @param simbolo Simbolo a ser inserido no tabuleiro
	 * @return true se uma sequ�ncia for encontrada ap�s a realiza��o da jogada, caso n�o, retorna false
	 * @throws JogadaInvalidaException
	 */
	public boolean efetuarJogada(Jogada jogada, char simbolo) throws JogadaInvalidaException {
		// Atribui a duas vari�veis do tipo int as jogadas realizadas
		int i = jogada.getI();
		int j = jogada.getJ();
		
		// Verifica se a jogada est� fora dos limites da matriz
		if (i < 0 || j < 0 || i >= matriz.length || j >= matriz[0].length) {
			throw new JogadaInvalidaException("A jogada � inv�lida");
		}
		
		// Verifica se a jogada j� n�o foi realizada
		if (matriz[i][j] != ' ') {
			throw new JogadaInvalidaException("Essa jogada j� foi realizada");
		}
		
		// Coloca o s�mbolo na posi��o especificada
		matriz[i][j] = simbolo;
		
		// Verifica se houve uma sequ�ncia
		return isSequenciaEncontrada();
	}
	
	/**
	 * Checa se uma sequ�ncia de tr�s s�mbolos foi encontrada.
	 * @return true se uma sequ�ncia foi encontrada; false se n�o foi encontrada
	 */
	private boolean isSequenciaEncontrada() {
		if(matriz[0][0] == matriz[0][1] && matriz[0][1] == matriz[0][2] && matriz[0][0] != ' ') {
			return true;
		}
		
		if(matriz[1][0] == matriz[1][1] && matriz[1][1] == matriz[1][2] && matriz[1][0] != ' ') {
			return true;
		}
		
		if(matriz[2][0] == matriz[2][1] && matriz[2][1] == matriz[2][2] && matriz[2][0] != ' ') {
			return true;
		}
		
		if(matriz[0][0] == matriz[1][0] && matriz[1][0] == matriz[2][0] && matriz[0][0] != ' ') {
			return true;
		}
		
		if(matriz[0][1] == matriz[1][1] && matriz[1][1] == matriz[2][1] && matriz[0][1] != ' ') {
			return true;
		}
	
		if(matriz[0][2] == matriz[1][2] && matriz[1][2] == matriz[2][2] && matriz[0][2] != ' ') {
			return true;
		}
		
		if(matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2] && matriz[0][0] != ' ') {
			return true;
		}
		
		if(matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0] && matriz[0][2] != ' ') {
			return true;
		}
	
		return false;
	}
	
	/**
	 * Verifica se ainda existem posi��es no tabuleiro onde ainda n�o houve jogada.
	 * @return true se o tabuleiro est� completo; false se est� incompleto
	 */
	public boolean isCompleto() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; i++) {
				if (matriz[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}
}

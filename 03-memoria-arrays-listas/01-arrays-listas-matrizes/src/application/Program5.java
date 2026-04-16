package application;

import java.util.Scanner; 

/**
 * Revisao rapida de memoria em matrizes: busca de elemento e vizinhos.
 */
public class Program5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		int m = sc.nextInt();
		int n = sc.nextInt();

		// 2. Criando a matriz na memória com o tamanho lido
		int[][] mat = new int[m][n];

		// 3. Preenchendo a matriz (Loops de leitura)
		for (int i = 0; i < m; i++) { // Percorre as linhas
			for (int j = 0; j < n; j++) { // Percorre as colunas de cada linha
				mat[i][j] = sc.nextInt(); // Lê o valor e guarda na posição [i][j]
			}
		}

		// 4. Lendo o número X que deve ser procurado
		int x = sc.nextInt();

		// 5. Percorrendo a matriz novamente para encontrar o X e seus vizinhos
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				
				// Se o valor na posição atual for igual ao X que procuramos
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");

					// VIZINHO DA ESQUERDA:
					// Só olha se a coluna 'j' for maior que 0 (não é a primeira coluna)
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}

					// VIZINHO DE CIMA:
					// Só olha se a linha 'i' for maior que 0 (não é a primeira linha)
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}

					// VIZINHO DA DIREITA:
					// Só olha se 'j' for menor que o índice da última coluna (n - 1)
					if (j < n - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}

					// VIZINHO DE BAIXO:
					// Só olha se 'i' for menor que o índice da última linha (m - 1)
					if (i < m - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}

		sc.close(); // Fecha o Scanner para liberar recursos
	}
}

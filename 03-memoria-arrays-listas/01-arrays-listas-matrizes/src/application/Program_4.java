package application;

import java.util.Scanner;

public class Program_4 {
    public static void main (String[]args) {
        
        Scanner sc = new Scanner(System.in);
        
        // n define o tamanho da matriz quadrada (ex: se n=3, será 3x3)
        int n = sc.nextInt();
        
        // Declaração da Matriz: o primeiro [] são as linhas, o segundo [] as colunas
        int[][] mat = new int[n][n];
        
        // Iteracao externa: percorre as linhas (i)
        for (int i = 0; i < mat.length; i++) {
            // Iteracao interna: percorre as colunas (j) de cada linha
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt(); // Lê o valor para a coordenada exata (linha i, coluna j)
            }
        }
        
        System.out.println("Main diagonal:");
        // Diagonal Principal: ocorre onde o índice da linha é IGUAL ao da coluna (0,0), (1,1)...
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
        
        int count = 0;
        // Percorrendo a matriz inteira novamente para contar negativos
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                // Se o valor na célula atual for menor que zero, incrementa o contador
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Negative numbers: " + count);
        
        sc.close();
    }
}
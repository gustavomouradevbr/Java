package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    	
        // vetores sem POO
        
        // Configura o ponto como separador decimal (Padrão US)
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // Le o tamanho do vetor definido pelo usuario
        int n = sc.nextInt();
        
        // Declaracao do vetor de primitivos:
        // Diferente de objetos, um vetor de double ja nasce preenchido com 0.0 em todas as posicoes.
        double[] vect = new double[n];
        
        // Iteracao de entrada de dados
        for (int i = 0; i < n; i++) {
            // Armazena o valor lido diretamente na posicao 'i' do vetor
            vect[i] = sc.nextDouble();
        }
        
        double sum = 0.0;
        // Iteracao de processamento (soma)
        for (int i = 0; i < n; i++) {
            // Acessa o valor bruto armazenado em cada índice
            sum += vect[i];
        }
        
        // Cálculo da média aritmética
        double avg = sum / n;
        
        // Exibe o resultado com duas casas decimais
        System.out.printf("Average Height %.2f%n ", avg);
        
        sc.close();
    }
}
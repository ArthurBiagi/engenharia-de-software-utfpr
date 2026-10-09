// Arthur Valsezia dos Santos Biagi RA: 2809320

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class MatrizInversa {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int linhas = 2;
        int colunas = 3;

        int[][] matriz = new int[linhas][colunas];

        try {
            System.out.println("Digite os valores para a matriz (" + linhas + "x" + colunas + "):");
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print("Posição [" + i + "][" + j + "]: ");
                    matriz[i][j] = Integer.parseInt(reader.readLine());
                }
            }

            System.out.println("\nValores na ordem inversa:");
            for (int i = linhas - 1; i >= 0; i--) {
                for (int j = colunas - 1; j >= 0; j--) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println(); 
            }

        } catch (IOException e) {
            System.out.println("Erro na leitura de entrada: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite apenas números inteiros válidos.");
        }
    }
}
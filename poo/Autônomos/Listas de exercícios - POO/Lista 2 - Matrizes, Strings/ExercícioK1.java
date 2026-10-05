// Arthur Valsezia dos Santos Biagi RA: 2809320

import java.util.Scanner;

class MatrizInversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis locais para definir o tamanho da matriz (linhas x colunas)
        int linhas = 2;
        int colunas = 3;

        // Cria a matriz bidimensional
        int[][] matriz = new int[linhas][colunas];

        // Entrada dos valores digitados pelo usuário
        System.out.println("Digite os valores para a matriz (" + linhas + "x" + colunas + "):");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Apresentação dos valores na ordem inversa da entrada
        System.out.println("\nValores na ordem inversa:");
        for (int i = linhas - 1; i >= 0; i--) {
            for (int j = colunas - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Quebra a linha ao finalizar cada linha da matriz
        }

        scanner.close();
    }
}
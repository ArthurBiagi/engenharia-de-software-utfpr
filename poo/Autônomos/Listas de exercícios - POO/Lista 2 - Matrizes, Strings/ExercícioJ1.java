// Arthur Valsezia dos Santos Biagi RA:  2809320

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class VetorInverso {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tam = 5;

        int[] numeros = new int[tam];

        try {
            System.out.println("Digite " + tam + " números inteiros:");
            for (int i = 0; i < tam; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = Integer.parseInt(reader.readLine());
            }

            System.out.println("\nValores na ordem inversa:");
            for (int i = tam - 1; i >= 0; i--) {
                System.out.print(numeros[i] + " ");
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("Erro na leitura da entrada: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro: É necessário digitar apenas números inteiros válidos.");
        }
    }
}
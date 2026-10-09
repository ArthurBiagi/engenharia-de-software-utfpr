//Arthur Valsezia dos Santos Biagi RA: 2809320

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class ExercicioStrings {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Digite uma frase: ");
            String frase = reader.readLine();

            System.out.print("Digite a letra a procurar: ");
            String entradaLetra = reader.readLine();
            char letra = entradaLetra.isEmpty() ? ' ' : entradaLetra.charAt(0);

            char letraMinuscula = Character.toLowerCase(letra);
            int contador = 0;
            String posicoes = "";

            for (int i = 0; i < frase.length(); i++) {
                if (Character.toLowerCase(frase.charAt(i)) == letraMinuscula) {
                    contador++;
                    posicoes += i + " "; // Acumula os índices no texto
                }
            }

            if (contador > 0) {
                System.out.println("\nA letra '" + letra + "' apareceu " + contador + " vez(es).");
                System.out.println("Posição/Posições na frase (índices): " + posicoes);
            } else {
                System.out.println("\nEsta letra não existe na frase.");
            }

        } catch (IOException e) {
            System.out.println("Erro na leitura de entrada: " + e.getMessage());
        }
    }
}
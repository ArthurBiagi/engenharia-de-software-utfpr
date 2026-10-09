// Arthur Valsezia dos Santos Biagi RA: 2809320

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CalculadoraMenu {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Entrada dos dois valores via console (lidos como String e convertidos para double)
            System.out.print("Digite o valor de 'a': ");
            double a = Double.parseDouble(reader.readLine());

            System.out.print("Digite o valor de 'b': ");
            double b = Double.parseDouble(reader.readLine());

            // Exibição do menu de opções
            System.out.println("\nMenu de Opções:");
            System.out.println("1 - Somar (a+b)");
            System.out.println("2 - multiplicar (a*b)");
            System.out.println("3 - subtrair (a-b)");
            System.out.println("5 - dividir (a/b)");
            System.out.print("Escolha uma opção: ");

            // Leitura da opção e conversão de tipo para inteiro
            int opcao = Integer.parseInt(reader.readLine());

            // Estrutura de seleção switch..case
            switch (opcao) {
                case 1:
                    System.out.println("A soma de a + b é: " + (a + b));
                    break;
                case 2:
                    System.out.println("A multiplicação de a * b é: " + (a * b));
                    break;
                case 3:
                    System.out.println("A subtração de a - b é: " + (a - b));
                    break;
                case 5:
                    if (b != 0) {
                        System.out.println("A divisão de a / b é: " + (a / b));
                    } else {
                        System.out.println("Erro: Não é possível dividir por zero.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } catch (IOException e) {
            System.out.println("Erro na leitura de entrada do console: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite apenas valores numéricos válidos.");
        }
    }
}

// Arthur Valsezia dos Santos Biagi RA: 2809320

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CalculadoraMenu {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Digite o valor de 'a': ");
            double a = Double.parseDouble(reader.readLine());

            System.out.print("Digite o valor de 'b': ");
            double b = Double.parseDouble(reader.readLine());

            System.out.println("\nMenu de Opções:");
            System.out.println("1 - Soma (a+b)");
            System.out.println("2 - multiplicação (a*b)");
            System.out.println("3 - subtração (a-b)");
            System.out.println("5 - divisão (a/b)");
            System.out.print("Escolha uma opção: ");


            int opcao = Integer.parseInt(reader.readLine());

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
                        System.out.println("Erro: Impossível dividir por zero.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } catch (IOException e) {
            System.out.println("Erro na leitura de entrada do console: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite apenas números válidos.");
        }
    }
}

// Arthur Valsezia dos Santos Biagi RA: 2809320

import java.util.Scanner;

class CalculadoraMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos dois valores via consola (lidos como String e convertidos para double)
        System.out.print("Digite o valor de 'a': ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite o valor de 'b': ");
        double b = Double.parseDouble(scanner.nextLine());

        // Exibição do menu de opções
        System.out.println("\nMenu de Opções:");
        System.out.println("1 - Somar (a+b)");
        System.out.println("2 - multiplicar (a*b)");
        System.out.println("3 - subtrair (a-b)");
        System.out.println("5 - dividir (a/b)");
        System.out.print("Escolha uma opção: ");

        // Leitura da opção e conversão de tipo para inteiro
        int opcao = Integer.parseInt(scanner.nextLine());

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

        scanner.close();
    }
}

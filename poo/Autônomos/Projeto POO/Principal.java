import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ControleLoja controle = new ControleLoja();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("=== SISTEMA DE GESTÃO - LOJA DE DEPARTAMENTOS ===");
            System.out.println("1 - Cadastrar/Atualizar Dados da Loja");
            System.out.println("2 - Cadastrar Novo Departamento");
            System.out.println("3 - Exibir Relatório Geral");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        controle.cadastrarDadosLoja();
                        break;
                    case 2:
                        controle.cadastrarDepartamento();
                        break;
                    case 3:
                        controle.exibirRelatorios();
                        break;
                    case 4:
                        System.out.println("Saindo do sistema... Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.\n");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("[ERRO]: Por favor, digite apenas números para selecionar a opção do menu.\n");
            }

        } while (opcao != 4);

        scanner.close();
    }
}

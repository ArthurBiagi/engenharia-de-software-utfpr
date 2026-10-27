// Autor: Arthur Valsezia dos Santos Biagi - RA: 2809320

public class Principal {

    public static void main(String[] args) {
        ControleLoja controle = new ControleLoja();
        Leitura leitura = new Leitura();

        controle.cadastrarDadosLoja();

        int opcao = 0;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Cadastrar Departamento");
            System.out.println("2 - Exibir Relatorios");
            System.out.println("3 - Sair");

            try {
                opcao = Integer.parseInt(leitura.entDados("Escolha uma opcao: "));

                switch (opcao) {
                    case 1:
                        controle.cadastrarDepartamento();
                        break;
                    case 2:
                        controle.exibirRelatorios();
                        break;
                    case 3:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opcao invalida!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite apenas numeros inteiros para as opcoes do menu!");
            }
        } while (opcao != 3);
    }
}
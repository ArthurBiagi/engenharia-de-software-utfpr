// Autor: Arthur Valsezia dos Santos Biagi - RA: 2809320

public class ControleLoja {
    private Loja loja;
    private Leitura leitura;

    //Sobrecarga
    public ControleLoja() {
        this.loja = new Loja();
        this.leitura = new Leitura();
    }

    public void cadastrarDadosLoja() {
        System.out.println("\n=== CADASTRO DA LOJA ===");
        loja.setNome(leitura.entDados("Nome da Loja: "));
        loja.setCnpj(leitura.entDados("CNPJ: "));

        System.out.println("\n--- Endereco ---");
        loja.getEndereco().setRua(leitura.entDados("Rua: ")); //Reflexividade
        loja.getEndereco().setNumero(Integer.parseInt(leitura.entDados("Numero: "))); //Reflexividade
        loja.getEndereco().setBairro(leitura.entDados("Bairro: ")); //Reflexividade
        loja.getEndereco().setCidade(leitura.entDados("Cidade: ")); //Reflexividade

        System.out.println("\n--- Contato ---");
        loja.getContato().setEmail(leitura.entDados("E-mail: ")); //Reflexividade
        loja.getContato().setTelefone(leitura.entDados("Telefone: ")); //Reflexividade
    }

    public void cadastrarDepartamento() {
        System.out.println("\n=== CADASTRAR DEPARTAMENTO ===");
        System.out.println("1 - Secao de Esportes");
        System.out.println("2 - Secao de Artigos de Casa");
        System.out.println("3 - Secao de Eletronicos");

        try {
            int opcao = Integer.parseInt(leitura.entDados("Escolha a secao: "));

            if (loja.getQuantidadeDepartamentos() >= 10) {
                throw new CapacidadeExcedidaException("Capacidade maxima de departamentos atingida (limite: 10)!");
            }

            int id = Integer.parseInt(leitura.entDados("ID do Departamento: "));
            if (id <= 0) {
                throw new ValorInvalidoException("O ID do departamento deve ser um numero maior que zero!");
            }

            String nome = leitura.entDados("Nome do Departamento: ");

            switch (opcao) {
                case 1:
                    int qtdBolas = Integer.parseInt(leitura.entDados("Quantidade de Bolas: "));
                    String categoria = leitura.entDados("Categoria Modalidade: ");
                    SecaoEsportes esportes = new SecaoEsportes(id, nome, qtdBolas, categoria);
                    loja.adicionarDepartamento(esportes);
                    System.out.println("Secao de Esportes cadastrada com sucesso!");
                    break;

                case 2:
                    boolean garantia = Boolean.parseBoolean(leitura.entDados("Possui Garantia Estendida? (true/false): "));
                    String material = leitura.entDados("Tipo de Material: ");
                    SecaoArtigosCasa casa = new SecaoArtigosCasa(id, nome, garantia, material);
                    loja.adicionarDepartamento(casa);
                    System.out.println("Secao de Artigos de Casa cadastrada com sucesso!");
                    break;

                case 3:
                    int voltagem = Integer.parseInt(leitura.entDados("Voltagem (110/220): "));
                    int mesesGarantia = Integer.parseInt(leitura.entDados("Meses de Garantia: "));
                    SecaoEletronicos eletronicos = new SecaoEletronicos(id, nome, voltagem, mesesGarantia);
                    loja.adicionarDepartamento(eletronicos);
                    System.out.println("Secao de Eletronicos cadastrada com sucesso!");
                    break;

                default:
                    System.out.println("Opcao de secao invalida!");
            }

        } catch (ValorInvalidoException e) {
            System.out.println("Erro de Valor: " + e.getMessage());
        } catch (CapacidadeExcedidaException e) {
            System.out.println("Erro de Capacidade: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro de Formato: Digite um numero valido!");
        }
    }

    public void exibirRelatorios() {
        System.out.println("\n==================================");
        System.out.println("LOJA: " + loja.getNome() + " | CNPJ: " + loja.getCnpj());
        System.out.println("ENDERECO: " + loja.getEndereco().getRua() + ", " + loja.getEndereco().getNumero() + " - " + loja.getEndereco().getBairro() + " (" + loja.getEndereco().getCidade() + ")"); //Reflexividade
        System.out.println("CONTATO: " + loja.getContato().getEmail() + " | TEL: " + loja.getContato().getTelefone()); //Reflexividade
        System.out.println("==================================");

        loja.listarDepartamentos();
    }
}
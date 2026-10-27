//Arthur Valsezia dos Santos Biagi RA: 2809320
import java.util.Scanner;

public class ControleLoja {
    private Loja loja;
    private Scanner scanner;

    public ControleLoja() {
        this.loja = new Loja();
        this.loja.setEndereco(new Endereco());
        this.loja.setContato(new Contato());
        this.scanner = new Scanner(System.in);
    }

    public void cadastrarDadosLoja() {
        try {
            System.out.println("--- CADASTRO DA LOJA ---");
            System.out.print("Nome da Loja: ");
            loja.setNome(scanner.nextLine());

            System.out.print("CNPJ: ");
            loja.setCnpj(scanner.nextLine());

            System.out.print("Rua: ");
            loja.getEndereco().setRua(scanner.nextLine()); //Reflexividade

            System.out.print("Número: ");
            int num = Integer.parseInt(scanner.nextLine());
            if (num <= 0) {
                throw new ValorInvalidoException("O número do endereço deve ser maior que zero!");
            }
            loja.getEndereco().setNumero(num); //Reflexividade

            System.out.print("Bairro: ");
            loja.getEndereco().setBairro(scanner.nextLine()); //Reflexividade

            System.out.print("Cidade: ");
            loja.getEndereco().setCidade(scanner.nextLine()); //Reflexividade

            System.out.print("E-mail de Contato: ");
            loja.getContato().setEmail(scanner.nextLine()); //Reflexividade

            System.out.print("Telefone de Contato: ");
            loja.getContato().setTelefone(scanner.nextLine()); //Reflexividade

            System.out.println("-> Dados da loja cadastrados com sucesso!\n");

        } catch (ValorInvalidoException e) {
            System.out.println("[ERRO DE VALIDAÇÃO]: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("[ERRO DE FORMATO]: Digite apenas números inteiros para o número do endereço.");
        }
    }

    public void cadastrarDepartamento() {
        try {
            System.out.println("--- CADASTRO DE DEPARTAMENTO ---");
            System.out.println("1 - Seção de Esportes");
            System.out.println("2 - Seção de Artigos para Casa");
            System.out.println("3 - Seção de Eletrônicos");
            System.out.print("Escolha o tipo de departamento: ");
            int tipo = Integer.parseInt(scanner.nextLine());

            if (tipo < 1 || tipo > 3) {
                throw new ValorInvalidoException("Opção de departamento inválida!");
            }

            System.out.print("ID do Departamento: ");
            int id = Integer.parseInt(scanner.nextLine());
            if (id <= 0) {
                throw new ValorInvalidoException("O ID do departamento deve ser maior que zero!");
            }

            System.out.print("Nome do Departamento: ");
            String nome = scanner.nextLine();

            switch (tipo) {
                case 1:
                    SecaoEsportes esportes = new SecaoEsportes();
                    esportes.setId(id);
                    esportes.setNome(nome);

                    System.out.print("Quantidade de Bolas em Estoque: ");
                    int bolas = Integer.parseInt(scanner.nextLine());
                    if (bolas < 0) {
                        throw new ValorInvalidoException("A quantidade de bolas não pode ser negativa!");
                    }
                    esportes.setQuantidadeBolas(bolas);

                    System.out.print("Categoria/Modalidade: ");
                    esportes.setCategoriaModalidade(scanner.nextLine());

                    loja.adicionarDepartamento(esportes);
                    break;

                case 2:
                    SecaoArtigosCasa casa = new SecaoArtigosCasa();
                    casa.setId(id);
                    casa.setNome(nome);

                    System.out.print("Tipo de Material (ex: Plástico, Inox, Madeira): ");
                    casa.setTipoMaterial(scanner.nextLine());

                    System.out.print("Possui Garantia Estendida? (S/N): ");
                    String resp = scanner.nextLine();
                    casa.setPossuiGarantiaEstendida(resp.equalsIgnoreCase("S"));

                    loja.adicionarDepartamento(casa);
                    break;

                case 3:
                    SecaoEletronicos eletronicos = new SecaoEletronicos();
                    eletronicos.setId(id);
                    eletronicos.setNome(nome);

                    System.out.print("Voltagem (110 / 220): ");
                    int voltagem = Integer.parseInt(scanner.nextLine());
                    eletronicos.setVoltagem(voltagem);

                    System.out.print("Meses de Garantia: ");
                    int garantia = Integer.parseInt(scanner.nextLine());
                    if (garantia < 0) {
                        throw new ValorInvalidoException("A garantia não pode ser negativa!");
                    }
                    eletronicos.setMesesGarantia(garantia);

                    loja.adicionarDepartamento(eletronicos);
                    break;
            }

            System.out.println("-> Departamento cadastrado com sucesso!\n");

        } catch (ValorInvalidoException e) {
            System.out.println("[ERRO DE VALIDAÇÃO]: " + e.getMessage());
        } catch (CapacidadeExcedidaException e) {
            System.out.println("[ERRO DE CAPACIDADE]: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("[ERRO DE FORMATO]: Valor numérico digitado é inválido.");
        }
    }

    public void exibirRelatorios() {
        System.out.println("\n========== RELATÓRIO DA LOJA DE DEPARTAMENTOS ==========");
        System.out.println("Loja: " + loja.getNome() + " | CNPJ: " + loja.getCnpj());
        
        System.out.println("Endereço: " + loja.getEndereco().getRua() + ", " + 
                           loja.getEndereco().getNumero() + " - " + 
                           loja.getEndereco().getBairro() + " (" + 
                           loja.getEndereco().getCidade() + ")"); //Reflexividade
                           
        System.out.println("Contato: " + loja.getContato().getEmail() + " | Tel: " + 
                           loja.getContato().getTelefone()); //Reflexividade
        System.out.println("-------------------------------------------------------");

        if (loja.getQuantidadeDepartamentos() == 0) {
            System.out.println("Nenhum departamento cadastrado até o momento.");
        } else {
            for (int i = 0; i < loja.getQuantidadeDepartamentos(); i++) {
                Departamento dep = loja.getDepartamentos()[i];
                if (dep instanceof Relatorio) {
                    Relatorio rel = (Relatorio) dep;
                    System.out.println(rel.gerarRelatorio());
                }
            }
        }
        System.out.println("=======================================================\n");
    }
}

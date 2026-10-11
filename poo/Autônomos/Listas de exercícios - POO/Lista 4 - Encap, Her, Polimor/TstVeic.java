// Arthur Valsezia dos Santos Biagi RA: 2809320

public class TstVeic {

    public static void main(String[] args) {
        Leitura leitura = new Leitura();

        Passeio[] passeioVet = new Passeio[5];
        Carga[] cargaVet = new Carga[5];

        int qtdPasseio = 0;
        int qtdCarga = 0;

        int opcao = -1;

        while (opcao != 5) {
            System.out.println("\n==========================================");
            System.out.println("     Sistema de Gestão de Veículos");
            System.out.println("==========================================");
            System.out.println("1. Cadastrar Veículo de Passeio");
            System.out.println("2. Cadastrar Veículo de Carga");
            System.out.println("3. Imprimir Todos os Veículos de Passeio");
            System.out.println("4. Imprimir Todos os Veículos de Carga");
            System.out.println("5. Sair do Sistema");
            System.out.println("==========================================");

            String entradaOpcao = leitura.entDados("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(entradaOpcao);
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            System.out.println();

            switch (opcao) {
                case 1:
                    if (qtdPasseio < passeioVet.length) {
                        System.out.println("--- Cadastrando Veículo de Passeio ---");

                        Passeio p = new Passeio();

                        p.setPlaca(leitura.entDados("Informe a Placa: "));
                        p.setMarca(leitura.entDados("Informe a Marca: "));
                        p.setModelo(leitura.entDados("Informe o Modelo: "));
                        p.setCor(leitura.entDados("Informe a Cor: "));
                        p.setQtdRodas(Integer.parseInt(leitura.entDados("Informe a Qtd. de Rodas: ")));
                        p.setVelocMax(Integer.parseInt(leitura.entDados("Informe a Velocidade Máxima (Km/h): ")));
                        p.setDataCadastro(leitura.entDados("Informe a Data de Cadastro: "));
                        p.setQtdePassageiro(Integer.parseInt(leitura.entDados("Informe a Qtd. de Passageiros: ")));

                        p.getMotor().setQtdPistoes(Integer.parseInt(leitura.entDados("Informe a Qtd. de Pistões do Motor: ")));
                        p.getMotor().setPotencia(Integer.parseInt(leitura.entDados("Informe a Potência do Motor: ")));

                        passeioVet[qtdPasseio] = p;
                        qtdPasseio++;
                        System.out.println("\nVeículo de Passeio cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de cadastro de veículos de Passeio atingido!");
                    }
                    break;

                case 2:
                    if (qtdCarga < cargaVet.length) {
                        System.out.println("--- Cadastrando Veículo de Carga ---");
 
                        Carga c = new Carga();

                        c.setPlaca(leitura.entDados("Informe a Placa: "));
                        c.setMarca(leitura.entDados("Informe a Marca: "));
                        c.setModelo(leitura.entDados("Informe o Modelo: "));
                        c.setCor(leitura.entDados("Informe a Cor: "));
                        c.setQtdRodas(Integer.parseInt(leitura.entDados("Informe a Qtd. de Rodas: ")));
                        c.setVelocMax(Integer.parseInt(leitura.entDados("Informe a Velocidade Máxima (Km/h): ")));
                        c.setDataCadastro(leitura.entDados("Informe a Data de Cadastro: "));
                        c.setTara(Integer.parseInt(leitura.entDados("Informe a Tara: ")));
                        c.setCargaMax(Integer.parseInt(leitura.entDados("Informe a Carga Máxima: ")));

                        c.getMotor().setQtdPistoes(Integer.parseInt(leitura.entDados("Informe a Qtd. de Pistões do Motor: ")));
                        c.getMotor().setPotencia(Integer.parseInt(leitura.entDados("Informe a Potência do Motor: ")));

                        cargaVet[qtdCarga] = c;
                        qtdCarga++;
                        System.out.println("\nVeículo de Carga cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de cadastro de veículos de Carga atingido!");
                    }
                    break;

                case 3:
                    System.out.println("=== RELATÓRIO DE VEÍCULOS DE PASSEIO ===");
                    if (qtdPasseio == 0) {
                        System.out.println("Nenhum veículo de Passeio cadastrado.");
                    } else {
                        for (int i = 0; i < qtdPasseio; i++) {
                            Passeio p = passeioVet[i];
                            System.out.println("\n[ Veículo de Passeio #" + (i + 1) + " ]");
                            System.out.println("Placa: " + p.getPlaca());
                            System.out.println("Marca: " + p.getMarca());
                            System.out.println("Modelo: " + p.getModelo());
                            System.out.println("Cor: " + p.getCor());
                            System.out.println("Qtd. Rodas: " + p.getQtdRodas());
                            System.out.println("Velocidade Máxima Armazenada: " + p.getVelocMax() + " Km/h");
                            System.out.println("Velocidade Calculada (M/h): " + p.calcVel() + " M/h");
                            System.out.println("Data de Cadastro: " + p.getDataCadastro());
                            System.out.println("Qtd. Passageiros: " + p.getQtdePassageiro());
                            System.out.println("Motor - Qtd. Pistões: " + p.getMotor().getQtdPistoes());
                            System.out.println("Motor - Potência: " + p.getMotor().getPotencia());
                            System.out.println("Resultado da Interface Calc (Qtd. Letras): " + p.calcular());
                        }
                    }
                    break;

                case 4:
                    System.out.println("=== RELATÓRIO DE VEÍCULOS DE CARGA ===");
                    if (qtdCarga == 0) {
                        System.out.println("Nenhum veículo de Carga cadastrado.");
                    } else {
                        for (int i = 0; i < qtdCarga; i++) {
                            Carga c = cargaVet[i];
                            System.out.println("\n[ Veículo de Carga #" + (i + 1) + " ]");
                            System.out.println("Placa: " + c.getPlaca());
                            System.out.println("Marca: " + c.getMarca());
                            System.out.println("Modelo: " + c.getModelo());
                            System.out.println("Cor: " + c.getCor());
                            System.out.println("Qtd. Rodas: " + c.getQtdRodas());
                            System.out.println("Velocidade Máxima Armazenada: " + c.getVelocMax() + " Km/h");
                            System.out.println("Velocidade Calculada (Cm/h): " + c.calcVel() + " Cm/h");
                            System.out.println("Data de Cadastro: " + c.getDataCadastro());
                            System.out.println("Tara: " + c.getTara());
                            System.out.println("Carga Máxima: " + c.getCargaMax());
                            System.out.println("Motor - Qtd. Pistões: " + c.getMotor().getQtdPistoes());
                            System.out.println("Motor - Potência: " + c.getMotor().getPotencia());
                            System.out.println("Resultado da Interface Calc (Soma Numéricos): " + c.calcular());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha um número de 1 a 5.");
                    break;
            }
        }
    }
}
//Arthur Valsezia dos Santos Biagi
//RA: 2809320

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

// ==========================================
// DEFINIÇÃO DAS ESTRUTURAS
// ==========================================

typedef struct {
    int dia;
    int mes;
    int ano;
} Data;

typedef struct {
    int codigoProprietario;
    char nome[100];
    char cpf[20];
} Proprietario;

typedef struct {
    char placa[15];
    char modelo[50];
    int ano;
} Veiculo;

typedef struct {
    int codigoProprietario;
    char placa[15];
} Proprietario_Veiculo;

typedef struct {
    Data dataInicio;
    Data dataFim;
    float quilometragemInicial;
    float quilometragemFinal;
    char veiculoUtilizado[15];
    int motorista; 
} Viagem;

// ==========================================
// FUNÇÕES DE VALIDAÇÃO E AUXILIARES
// ==========================================

bool ehBissexto(int ano) {
    return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
}

// Função para validar data
bool validarData(const Data *d) {
    if (d->ano < 0 || d->mes < 1 || d->mes > 12) return false;
    
    int diasNoMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    if (ehBissexto(d->ano)) {
        *(diasNoMes + 2) = 29;
    }
    
    if (d->dia < 1 || d->dia > *(diasNoMes + d->mes)) return false;
    return true;
}

// Função para comparar duas datas (Retorna true se fim >= inicio)
bool compararDatas(const Data *dInicio, const Data *dFim) {
    if (dFim->ano > dInicio->ano) return true;
    if (dFim->ano < dInicio->ano) return false;
    
    if (dFim->mes > dInicio->mes) return true;
    if (dFim->mes < dInicio->mes) return false;
    
    return dFim->dia >= dInicio->dia;
}

// Função para validar quilometragem
bool validarQuilometragem(float inicial, float final) {
    return final > inicial;
}

// Auxiliares de busca usando aritmética de ponteiros
bool existeProprietario(Proprietario *p, int qtd, int codigo) {
    for (int i = 0; i < qtd; i++) {
        if ((p + i)->codigoProprietario == codigo) return true;
    }
    return false;
}

bool existeVeiculo(Veiculo *v, int qtd, const char *placa) {
    for (int i = 0; i < qtd; i++) {
        if (strcmp((v + i)->placa, placa) == 0) return true;
    }
    return false;
}

int contarDonosDoVeiculo(Proprietario_Veiculo *pv, int qtdAtual, const char *placa) {
    int contagem = 0;
    for (int i = 0; i < qtdAtual; i++) {
        if (strcmp((pv + i)->placa, placa) == 0) {
            contagem++;
        }
    }
    return contagem;
}

void limparBuffer() {
    int c;
    while ((c = getchar()) != '\n' && c != EOF);
}

void removerNovaLinha(char *str) {
    str[strcspn(str, "\n")] = '\0';
}

// ==========================================
// FUNÇÕES DE CADASTRO
// ==========================================

void cadastrarVeiculos(Veiculo *v, int qtd) {
    for (int i = 0; i < qtd; i++) {
        printf("\n--- Cadastro do Veiculo %d de %d ---\n", i + 1, qtd);
        printf("Placa: ");
        fgets((v + i)->placa, sizeof((v + i)->placa), stdin);
        removerNovaLinha((v + i)->placa);
        
        printf("Modelo: ");
        fgets((v + i)->modelo, sizeof((v + i)->modelo), stdin);
        removerNovaLinha((v + i)->modelo);
        
        printf("Ano: ");
        scanf("%d", &((v + i)->ano));
        limparBuffer();
    }
}

void cadastrarProprietarios(Proprietario *p, int qtd) {
    for (int i = 0; i < qtd; i++) {
        printf("\n--- Cadastro do Proprietario %d de %d ---\n", i + 1, qtd);
        printf("Codigo unico: ");
        scanf("%d", &((p + i)->codigoProprietario));
        limparBuffer();
        
        printf("Nome: ");
        fgets((p + i)->nome, sizeof((p + i)->nome), stdin);
        removerNovaLinha((p + i)->nome);
        
        printf("CPF: ");
        fgets((p + i)->cpf, sizeof((p + i)->cpf), stdin);
        removerNovaLinha((p + i)->cpf);
    }
}

void cadastrarProprietarioVeiculo(Proprietario_Veiculo *pv, int qtdPV, Proprietario *p, int qtdP, Veiculo *v, int qtdV) {
    for (int i = 0; i < qtdPV; i++) {
        printf("\n--- Vinculo Proprietario x Veiculo %d de %d ---\n", i + 1, qtdPV);
        
        int cod;
        while (1) {
            printf("Codigo do Proprietario: ");
            scanf("%d", &cod);
            limparBuffer();
            if (existeProprietario(p, qtdP, cod)) {
                (pv + i)->codigoProprietario = cod;
                break;
            }
            printf("Erro: Proprietario nao cadastrado!\n");
        }
        
        while (1) {
            char placa[15];
            printf("Placa do Veiculo: ");
            fgets(placa, sizeof(placa), stdin);
            removerNovaLinha(placa);
            
            if (!existeVeiculo(v, qtdV, placa)) {
                printf("Erro: Veiculo nao cadastrado!\n");
                continue;
            }
            // Regra 2: Maximo 2 proprietarios por veiculo
            if (contarDonosDoVeiculo(pv, i, placa) >= 2) {
                printf("Erro: Este veiculo ja atingiu o limite maximo de 2 proprietarios!\n");
                continue;
            }
            
            strcpy((pv + i)->placa, placa);
            break;
        }
    }
}

void cadastrarViagens(Viagem *vi, int qtdVi, Veiculo *v, int qtdV, Proprietario *p, int qtdP) {
    for (int i = 0; i < qtdVi; i++) {
        printf("\n--- Cadastro da Viagem %d de %d ---\n", i + 1, qtdVi);
        
        // Validação do Veículo da Viagem
        while (1) {
            printf("Placa do Veiculo: ");
            fgets((vi + i)->veiculoUtilizado, sizeof((vi + i)->veiculoUtilizado), stdin);
            removerNovaLinha((vi + i)->veiculoUtilizado);
            if (existeVeiculo(v, qtdV, (vi + i)->veiculoUtilizado)) break;
            printf("Erro: Veiculo nao cadastrado!\n");
        }

        // Validação do Motorista
        while (1) {
            printf("Codigo do Motorista: ");
            scanf("%d", &((vi + i)->motorista));
            limparBuffer();
            if (existeProprietario(p, qtdP, (vi + i)->motorista)) break;
            printf("Erro: Motorista nao cadastrado!\n");
        }

        // Validação das Datas
        while (1) {
            printf("Data de Inicio (DD MM AAAA): ");
            scanf("%d %d %d", &((vi + i)->dataInicio.dia), &((vi + i)->dataInicio.mes), &((vi + i)->dataInicio.ano));
            limparBuffer();
            if (validarData(&((vi + i)->dataInicio))) break;
            printf("Erro: Data invalida!\n");
        }

        while (1) {
            printf("Data de Fim (DD MM AAAA): ");
            scanf("%d %d %d", &((vi + i)->dataFim.dia), &((vi + i)->dataFim.mes), &((vi + i)->dataFim.ano));
            limparBuffer();
            if (!validarData(&((vi + i)->dataFim))) {
                printf("Erro: Data invalida!\n");
                continue;
            }
            if (compararDatas(&((vi + i)->dataInicio), &((vi + i)->dataFim))) break;
            printf("Erro: Data final deve ser maior ou igual a data inicial!\n");
        }

        // Validação das Quilometragens
        while (1) {
            printf("Quilometragem Inicial: ");
            scanf("%f", &((vi + i)->quilometragemInicial));
            printf("Quilometragem Final: ");
            scanf("%f", &((vi + i)->quilometragemFinal));
            limparBuffer();
            if (validarQuilometragem((vi + i)->quilometragemInicial, (vi + i)->quilometragemFinal)) break;
            printf("Erro: Quilometragem final deve ser maior que a inicial!\n");
        }
    }
}

// ==========================================
// FUNÇÕES DE EXIBIÇÃO
// ==========================================

void exibirProprietariosComVeiculos(Proprietario *p, int qtdP, Proprietario_Veiculo *pv, int qtdPV) {
    printf("\n==================================================\n");
    printf("LISTA DE PROPRIETARIOS E SEUS VEICULOS:\n");
    printf("==================================================\n");
    for (int i = 0; i < qtdP; i++) {
        printf("Proprietario: %s (Cod: %d) | CPF: %s\n", (p + i)->nome, (p + i)->codigoProprietario, (p + i)->cpf);
        printf("  Veiculos vinculados: ");
        int possuiVeiculo = 0;
        for (int j = 0; j < qtdPV; j++) {
            if ((pv + j)->codigoProprietario == (p + i)->codigoProprietario) {
                printf("[%s] ", (pv + j)->placa);
                possuiVeiculo = 1;
            }
        }
        if (!possuiVeiculo) printf("Nenhum");
        printf("\n--------------------------------------------------\n");
    }
}

void exibirVeiculosComProprietarios(Veiculo *v, int qtdV, Proprietario_Veiculo *pv, int qtdPV, Proprietario *p, int qtdP) {
    printf("\n==================================================\n");
    printf("LISTA DE VEICULOS E SEUS PROPRIETARIOS:\n");
    printf("==================================================\n");
    for (int i = 0; i < qtdV; i++) {
        printf("Veiculo: %s | Modelo: %s | Ano: %d\n", (v + i)->placa, (v + i)->modelo, (v + i)->ano);
        printf("  Dono(s): ");
        int possuiDono = 0;
        for (int j = 0; j < qtdPV; j++) {
            if (strcmp((pv + j)->placa, (v + i)->placa) == 0) {
                for (int k = 0; k < qtdP; k++) {
                    if ((p + k)->codigoProprietario == (pv + j)->codigoProprietario) {
                        printf("%s (Cod: %d)   ", (p + k)->nome, (p + k)->codigoProprietario);
                        possuiDono = 1;
                        break;
                    }
                }
            }
        }
        if (!possuiDono) printf("Nenhum cadastrado");
        printf("\n--------------------------------------------------\n");
    }
}

void exibirViagens(Viagem *vi, int qtdVi) {
    printf("\n==================================================\n");
    printf("LISTA DE VIAGENS:\n");
    printf("==================================================\n");
    for (int i = 0; i < qtdVi; i++) {
        printf("Viagem %d:\n", i + 1);
        printf("  Veiculo (Placa): %s\n", (vi + i)->veiculoUtilizado);
        printf("  Codigo do Motorista: %d\n", (vi + i)->motorista);
        printf("  Periodo: %02d/%02d/%04d ate %02d/%02d/%04d\n", 
               (vi + i)->dataInicio.dia, (vi + i)->dataInicio.mes, (vi + i)->dataInicio.ano,
               (vi + i)->dataFim.dia, (vi + i)->dataFim.mes, (vi + i)->dataFim.ano);
        printf("  KM Inicial: %.2f | KM Final: %.2f (Total: %.2f KM)\n", 
               (vi + i)->quilometragemInicial, (vi + i)->quilometragemFinal, 
               (vi + i)->quilometragemFinal - (vi + i)->quilometragemInicial);
        printf("--------------------------------------------------\n");
    }
}

// ==========================================
// FUNÇÃO PRINCIPAL (FLUXO DO PROGRAMA)
// ==========================================

int main() {
    int qtdProprietarios = 0, qtdVeiculos = 0, qtdRelacoes = 0, qtdViagens = 0;

    // 1. Ler quantidades
    printf("Digite a quantidade de Veiculos a cadastrar: ");
    scanf("%d", &qtdVeiculos);
    printf("Digite a quantidade de Proprietarios a cadastrar: ");
    scanf("%d", &qtdProprietarios);
    printf("Digite a quantidade de vinculos (Proprietario x Veiculo): ");
    scanf("%d", &qtdRelacoes);
    printf("Digite a quantidade de Viagens a cadastrar: ");
    scanf("%d", &qtdViagens);
    limparBuffer();

    // 2. Alocar dinamicamente os vetores usando calloc
    Veiculo *vetorVeiculos = (Veiculo *) calloc(qtdVeiculos, sizeof(Veiculo));
    Proprietario *vetorProprietarios = (Proprietario *) calloc(qtdProprietarios, sizeof(Proprietario));
    Proprietario_Veiculo *vetorRelacoes = (Proprietario_Veiculo *) calloc(qtdRelacoes, sizeof(Proprietario_Veiculo));
    Viagem *vetorViagens = (Viagem *) calloc(qtdViagens, sizeof(Viagem));

    if (!vetorVeiculos || !vetorProprietarios || !vetorRelacoes || !vetorViagens) {
        printf("Erro crítico de alocação de memória!\n");
        return 1;
    }

    // 3. Preencher dados com as respectivas validações em ordem de dependência
    cadastrarVeiculos(vetorVeiculos, qtdVeiculos);
    cadastrarProprietarios(vetorProprietarios, qtdProprietarios);
    cadastrarProprietarioVeiculo(vetorRelacoes, qtdRelacoes, vetorProprietarios, qtdProprietarios, vetorVeiculos, qtdVeiculos);
    cadastrarViagens(vetorViagens, qtdViagens, vetorVeiculos, qtdVeiculos, vetorProprietarios, qtdProprietarios);

    // 4. Exibir todos os dados cadastrados
    exibirProprietariosComVeiculos(vetorProprietarios, qtdProprietarios, vetorRelacoes, qtdRelacoes);
    exibirVeiculosComProprietarios(vetorVeiculos, qtdVeiculos, vetorRelacoes, qtdRelacoes, vetorProprietarios, qtdProprietarios);
    exibirViagens(vetorViagens, qtdViagens);

    // 5. Liberar toda a memória alocada
    free(vetorVeiculos);
    free(vetorProprietarios);
    free(vetorRelacoes);
    free(vetorViagens);

    printf("\nMemoria liberada com sucesso. Programa finalizado.\n");
    return 0;
}
/*
 * Nome completo: Arthur Valsezia dos Santos Biagi
 * RA: 2809320
 * Enunciado da questão:
 * Escreva um programa em Linguagem C que:
 * a) Aloque dinamicamente um vetor de inteiros com dimensão 10;
 * b) Obtenha uma sequência indefinida de números inteiros maiores do que zero (0) e:
 * i. Cada número digitado deve ser armazenado no vetor criado no item a);
 * ii. Se o usuário digitar mais de 10 números, o programa deve realocar espaço de 
 * memória para o vetor, suficiente para armazenar mais 10 números inteiros, e assim 
 * sucessivamente até que a sequência de números seja finalizada;
 * iii. Esta sequência é finalizada quando o usuário digitar 0 (zero) (o valor 0 não deve ser armazenado);
 * c) No final, todos os dados digitados e armazenados no vetor deverão ser mostrados na tela;
 * d) Utilize funções para:
 * i. Alocar o vetor
 * ii. Realocar o vetor
 * iii. Mostrar o conteúdo do vetor
 */

#include <stdio.h>
#include <stdlib.h>

#define SALTO 10

int* criar_espaco(int n) {
    int *p = (int *) malloc(n * sizeof(int));
    if (p == NULL) exit(1);
    return p;
}

int* expandir_vetor(int *ptr, int n_nova) {
    int *p = (int *) realloc(ptr, n_nova * sizeof(int));
    if (p == NULL) exit(1);
    return p;
}

void exibir_dados(int *p, int limite) {
    int k;
    printf("\n--- Valores Digitados ---\n");
    for (k = 0; k < limite; k++) {
        printf("[%d]: %d\n", k + 1, *(p + k));
    }
}

int main() {
    int cap_max = SALTO;
    int preenchidos = 0;
    int entrada;
    int *dados = criar_espaco(cap_max);

    do {
        printf("Informe um numero (>0 ou 0 para sair): ");
        scanf("%d", &entrada);

        if (entrada > 0) {
            if (preenchidos == cap_max) {
                cap_max += SALTO;
                dados = expandir_vetor(dados, cap_max);
            }
            dados[preenchidos] = entrada;
            preenchidos++;
        }
    } while (entrada != 0);

    exibir_dados(dados, preenchidos);
    free(dados);
    
    return 0;
}
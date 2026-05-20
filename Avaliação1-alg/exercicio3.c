/*
 * Nome completo: Arthur Valsezia dos Santos Biagi
 * RA: 2809320
 * Enunciado da questão:
 * Escreva um programa completo em C que:
 * -> Crie e inicialize um vetor de números inteiros e liste seus valores na tela;
 * -> Leia do teclado um número inteiro;
 * -> Chame a função implementada na primeira questão (Maiores) para obter a relação de 
 * números maiores do que o valor lido do teclado;
 * -> Liste na tela todo o conteúdo da relação obtida pela função chamada (Maiores) ou 
 * uma mensagem de erro, se for o caso.
 */

#include <stdio.h>
#include <stdlib.h>

int *Maiores(int *vet, int n, int x, int *qtd);

int main() {
    int v_base[] = {7, 35, 10, 18};
    int tam_base = sizeof(v_base) / sizeof(v_base[0]);
    int corte, total;
    int i;

    printf("vetor original = {");
    for (i = 0; i < tam_base; i++) {
        printf("%d%s", v_base[i], (i < tam_base - 1) ? ", " : "");
    }
    printf("}\n");

    printf("Digite o valor limite: ");
    scanf("%d", &corte);

    int *v_final = Maiores(v_base, tam_base, corte, &total);

    if (v_final != NULL) {
        printf("valores maiores do que %d = {", corte);
        for (i = 0; i < total; i++) {
            printf("%d%s", v_final[i], (i < total - 1) ? ", " : "");
        }
        printf("}\n");
        free(v_final);
    } else {
        printf("nenhum valor maior do que %d encontrado no vetor\n", corte);
    }

    return 0;
}

int *Maiores(int *vet, int n, int x, int *qtd) {
    int i, c = 0, j = 0;
    for (i = 0; i < n; i++) if (vet[i] > x) c++;
    *qtd = c;
    if (c == 0) return NULL;
    int *r = (int *) malloc(c * sizeof(int));
    for (i = 0; i < n; i++) if (vet[i] > x) r[j++] = vet[i];
    return r;
}
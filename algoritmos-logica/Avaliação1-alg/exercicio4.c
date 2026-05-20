/*
 * Nome completo: Arthur Valsezia dos Santos Biagi
 * RA: 2809320
 * Enunciado da questão:
 * Escreva um programa programa que calcule a soma de duas matrizes MxN de números do tipo float.
 * O programa deve:
 * a) alocar dinamicamente as matrizes necessárias para a realização da soma, a partir dos 
 * valores de linha e coluna fornecidos pelo usuário
 * b) preencher randomicamente as duas matrizes que serão somadas
 * c) realizar a soma das duas matrizes, armazenando o valor em uma terceira matriz
 * d) mostrar todas as matrizes na tela ao final do programa
 * Você deve:
 * a) Se certificar de que: os valores de linha e coluna fornecidos pelo usuário possuem a 
 * mesma ordem, caso contrário a soma não poderá ser realizada
 */

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

float** aloc_mat(int l, int c) {
    float **temp = (float **) malloc(l * sizeof(float *));
    for (int i = 0; i < l; i++) {
        temp[i] = (float *) malloc(c * sizeof(float));
    }
    return temp;
}

void desalocar(float **m, int l) {
    for (int i = 0; i < l; i++) free(m[i]);
    free(m);
}

int main() {
    int linA, colA, linB, colB, i, j;
    srand((unsigned)time(NULL));

    printf("Dimensoes da Matriz A [L C]: ");
    scanf("%d %d", &linA, &colA);
    printf("Dimensoes da Matriz B [L C]: ");
    scanf("%d %d", &linB, &colB);

    if (linA == linB && colA == colB) {
        float **mA = aloc_mat(linA, colA);
        float **mB = aloc_mat(linB, colB);
        float **mRes = aloc_mat(linA, colA);

        for (i = 0; i < linA; i++) {
            for (j = 0; j < colA; j++) {
                mA[i][j] = (float)(rand() % 50) + 0.5f;
                mB[i][j] = (float)(rand() % 50) + 1.2f;
                mRes[i][j] = mA[i][j] + mB[i][j];
            }
        }

        printf("\n--- Matriz A ---");
        for(i = 0; i < linA; i++) {
            printf("\n");
            for(j = 0; j < colA; j++) printf("%.1f ", mA[i][j]);
        }

        printf("\n\n--- Matriz B ---");
        for(i = 0; i < linB; i++) {
            printf("\n");
            for(j = 0; j < colB; j++) printf("%.1f ", mB[i][j]);
        }

        printf("\n\n--- Soma Resultante ---");
        for(i = 0; i < linA; i++) {
            printf("\n");
            for(j = 0; j < colA; j++) printf("%.1f ", mRes[i][j]);
        }
        printf("\n");

        desalocar(mA, linA);
        desalocar(mB, linB);
        desalocar(mRes, linA);

    } else {
        printf("\n[AVISO]: Matrizes de ordens distintas. Soma inviavel.\n");
    }

    return 0;
}
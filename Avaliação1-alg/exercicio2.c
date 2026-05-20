/*
 * Nome completo: Arthur Valsezia dos Santos Biagi
 * RA: 2809320
 * Enunciado da questão:
 * Implemente, na linguagem de programação C, uma função que tenha o seguinte protótipo:
 * int *Maiores (int *vet, int n, int x, int *qtd);
 * Essa função recebe os seguintes parâmetros:
 * -> vet: um vetor de números inteiros
 * -> n: a quantidade de elementos do vetor vet
 * -> x: um número inteiro
 * Essa função deve:
 * -> Verificar a quantidade de elementos do vetor que sejam maiores do que x
 * -> Caso a quantidade seja maior do que 0 (zero), alocar dinamicamente uma área do exato 
 * tamanho necessário para armazenar os valores esta quantidade de valores
 * -> Copiar os elementos do vetor que sejam maiores do que x para o vetor alocado dinamicamente
 * Essa função retorna:
 * -> o ponteiro para a área alocada dinamicamente, preenchida com os números maiores do que x, 
 * ou NULL, caso essa relação de números não tenha sido criada
 * Há também:
 * -> a quantidade de números carregados na área alocada dinamicamente, através do ponteiro qtd.
 */

#include <stdio.h>
#include <stdlib.h>

int *Maiores(int *vet, int n, int x, int *qtd) {
    int i, encontrados = 0;
    int *p_resultado = NULL;

    for (i = 0; i < n; i++) {
        if (vet[i] > x) encontrados++;
    }

    *qtd = encontrados;

    if (encontrados > 0) {
        p_resultado = (int *) malloc(encontrados * sizeof(int));
        
        if (p_resultado != NULL) {
            int indice = 0;
            for (i = 0; i < n; i++) {
                if (vet[i] > x) {
                    p_resultado[indice++] = vet[i];
                }
            }
        }
    }

    return p_resultado;
}
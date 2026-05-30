# 📝 Avaliação 2 - Algoritmos II (UTFPR)

Código desenvolvido para a segunda avaliação prática da disciplina, focado em gerenciamento avançado de memória, aritmética estrita de ponteiros e estruturas de dados interconectadas na linguagem C.

## 📋 Resumo das Implementações

* **Gerenciamento de Memória:** Alocação dinâmica em tempo de execução utilizando `calloc` e liberação limpa com `free` para os vetores de Proprietários, Veículos, Vínculos e Viagens, operando totalmente sem variáveis globais.
* **Aritmética de Ponteiros Estrita:** Manipulação e navegação de todos os vetores feitas exclusivamente através de deslocamento de memória (`*(v + i)`) e acesso a membros via operador `->`, eliminando completamente o uso de colchetes `[]`.
* **Regras de Negócio e Vínculos (N:M):** Modelagem de relacionamento lógico entre as estruturas utilizando uma tabela de junção (`Proprietario_Veiculo`), aplicando a restrição de limite máximo de até 2 proprietários por veículo.
* **Motor de Validação Cronológica e Métrica:** Implementação de funções específicas para consistência de dados, englobando validação de hodômetro (KM final > inicial) e checagem quaternária de datas (incluindo cálculo automatizado de anos bissextos).

## 🛠️ Tecnologias

* Linguagem C
* Alocação Dinâmica (`calloc`, `free`)
* Aritmética de Ponteiros Estrita
* Estruturas Aninhadas (`structs`)
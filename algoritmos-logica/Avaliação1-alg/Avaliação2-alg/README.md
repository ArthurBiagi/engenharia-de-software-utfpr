# Fleet & Trip Manager 🚗💨

Um sistema em **C** para gerenciamento de frotas, proprietários e viagens, projetado especificamente para demonstrar domínio em conceitos avançados de baixo nível, gerenciamento de memória e arquitetura de software sem abstrações de alto nível.

---

## 🎯 Mecanismos contidos no projeto

* **Aritmética de Ponteiros Estrita:** Manipulação de vetores feita exclusivamente via deslocamento de memória e ponteiros (`*(p + i)` e `->`). Zero uso de colchetes `[]` em loops.
* **Gerenciamento Dinâmico de Memória:** Alocação manual na *Heap* utilizando `calloc` (garantindo inicialização limpa) e liberação rigorosa com `free` para evitar *memory leaks*.
* **Encapsulamento e Clean Code:** Sem variáveis globais. Toda a comunicação entre o fluxo principal e as funções ocorre por passagem de ponteiros e referências.
* **Lógica Relacional Nativa:** Implementação manual de relacionamento N:M (Muitos para Muitos) através de uma tabela de junção struct (`Proprietario_Veiculo`).

---

## 🛡️ Motor de Validação e Regras de Negócio

O sistema valida a consistência de cada entrada de dados em tempo real:
* **Validação Quaternária de Datas:** Algoritmo integrado que calcula anos bissextos e impede dias inválidos por mês (ex: recusa 31 de abril) e bloqueia datas finais retroativas.
* **Consistência Relacional:** Impede o cadastro de viagens com motoristas ou veículos inexistentes.
* **Restrição de Cardinalidade:** Limita estritamente o número de proprietários por veículo a **no máximo 2**.
* **Integridade do Hodômetro:** Bloqueia viagens onde a quilometragem final seja menor ou igual à inicial.

---

## 🧬 Estrutura do Projeto

O sistema organiza os dados através de 5 structs integradas:
* `Data` (Auxiliar cronológica)
* `Proprietario` (Dados cadastrais)
* `Veiculo` (Dados da frota)
* `Proprietario_Veiculo` (Tabela de vínculo N:M)
* `Viagem` (Entidade que consome as demais)

---

## 🚀 Como Compilar e Executar

```bash
# 1. Clone o repositório
git clone [https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git](https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git)

# 2. Compile o código
gcc main.c -o fleet_manager

# 3. Execute
./fleet_manager
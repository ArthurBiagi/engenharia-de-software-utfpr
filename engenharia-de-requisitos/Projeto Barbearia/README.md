# 💈 Modelagem de Sistema: Gestão de Barbearia

Este diretório contém os artefatos de Engenharia de Requisitos, Modelagem UML e Planejamento Analítico desenvolvidos para mapear o fluxo operacional e administrativo de uma Barbearia.

## 🎯 Objetivo do Projeto

Traduzir regras de negócio do mundo real (como agendamentos, controle de comissões, vendas e reposição de estoque) em especificações de arquitetura de software e escopo de gerenciamento, garantindo a consistência lógica do sistema.

## 🗺️ Escopo e Arquitetura do Sistema (UML)

O sistema foi projetado sob perspectivas essenciais para garantir uma cobertura completa do negócio:

1. **Análise de Escopo (Diagrama de Casos de Uso):** Delimitação das fronteiras do sistema e níveis de acesso baseados nos atores principais (`Cliente`, `Funcionário`, `Gerente/Dono` e `Fornecedor`), cobrindo fluxos desde o agendamento básico até a gestão estratégica.
2. **Modelo de Domínio (Diagrama de Classes):** Estruturação das entidades lógicas do sistema, mapeando seus atributos essenciais, métodos de ação e o estabelecimento estrito de relacionamentos e multiplicidades.
3. **Dinâmica Comportamental (Diagramas de Sequência):** Detalhamento da troca de mensagens e da ordem cronológica de eventos para cada caso de uso crítico do estabelecimento.
4. **Gerenciamento de Escopo (EAP):** Estruturação Analítica do Projeto que organiza e decompõe hierarquicamente as entregas da engenharia e modelagem conceitual do software.

---

## 📁 Estrutura de Organização e Artefatos Disponíveis

O projeto encontra-se modularizado nos seguintes diretórios estruturais:

### 📁 1. Diagramas asta - Projeto Barbearia/
Diretório destinado à modelagem visual e arquivos nativos de software CASE:
* **`Diagrama de Classes - ProjetoBarb.png`**: Visão macro da modelagem estrutural do sistema e da árvore de componentes.
* **`EntityStore2.asta`**: Arquivo nativo da ferramenta *Astah UML*, englobando todos os diagramas de classe, diagramas de caso de uso e as interações dinâmicas secundárias totalmente navegáveis.

### 📁 2. Documentação - Projeto Barbearia/
Diretório focado no embasamento textual, regras de negócio e mapeamento formal do projeto:
* **`PDF do Escopo do Projeto`**: Documento detalhado especificando o problema de negócio, objetivos, detalhamento dos 5 módulos funcionais do sistema, os requisitos não-funcionais e limites do projeto.
* **`PDF do EAP em formato textual`**: Decomposição analítica em níveis e tópicos explicativos de cada fase, subfase e pacotes de entrega que compõem o escopo do projeto de software.

### 📁 3. EAP - projeto Barbearia/
Diretório exclusivo para a visualização macro do escopo do projeto:
* **`Print do EAP (Mapa Mental / Organograma Hierárquico)`**: Diagrama visual no formato de árvore que ilustra a ramificação das entregas do projeto em blocos interligados (Requisitos, Arquitetura Estática e Arquitetura Dinâmica), seguindo estritamente as diretrizes de gerenciamento de projetos.

---

💡 *Nota: Projeto acadêmico desenvolvido sob as diretrizes de Engenharia de Software da UTFPR - Campus Cornélio Procópio.*
# Projeto Calculadora — FinançApp
Este projeto foi desenvolvido como atividade acadêmica para praticar a criação de uma calculadora em Java. Durante o desenvolvimento, os assuntos trabalhados foram operações matemáticas, testes unitários, tratamento de erros, refatoração, documentação e versionamento do projeto e qualidade de projeto.

# 1. Identificação do Projeto

Projeto: Projeto Calculadora
Contexto: FinançApp
Aluno: Rafael Reis Táparo
RA: 250891
Curso:  Análise e Desenvolvimento de Sistemas
Disciplina:  UX/UI e Testes de Software
Professor: Daniel Ohata
Semestre: 2026.2

# 2. Visão Geral

O projeto Calculadora foi desenvolvido em Java com o objetivo de realizar operações matemáticas básicas, para que possa ser utilizado na startup fictícia FinançApp, assim sendo usado futuramente em tarefas do tipo controle financeiro.

O projeto também tem como finalidade demonstrar boas práticas de programação, incluindo refatoração de código, métodos puros, documentação com JavaDoc e aplicação de testes unitários.

# 3. Problema

O código inicial da calculadora apresentava alguns problemas relacionados à organização e à qualidade do código, dificultando sua leitura, manutenção e realização de testes.
Entre os principais pontos identificados estavam a necessidade de melhorar a estrutura dos métodos.

Por isso, foi realizada uma refatoração com o objetivo de tornar o código mais organizado, legível, seguro e fácil de testar.

# 4. Objetivo

# 4.1 Objetivo Geral
O objetivo do projeto é desenvolver uma calculadora em Java que realize operações matemáticas básicas, aplicando boas práticas de programação.

# 4.2 Objetivos Técnicos

**•** Aplicar técnicas de refatoração para melhorar a organização do código.

**•** Desenvolver métodos puros, evitando efeitos colaterais.

**•** Implementar tratamento de erros e entradas inválidas.

**•** Utilizar JavaDoc para documentar o código.

**•** Criar e executar testes unitários para verificar o funcionamento das operações.

**•** Utilizar Git para controlar as versões do projeto.

**•** Utilizar o GitHub para armazenamento e organização dos arquivos.

**•** Organizar o código para facilitar sua manutenção e compreensão.

# 5. Escopo Funcional

| **ID** | **Funcionalidade** | **Descrição** | **Status** |
|:---:|---|---|:---:|
| RF01 | Soma | Soma dois números inteiros | ✅ |
| RF02 | Subtração | Subtrai dois números inteiros | ✅ |
| RF03 | Multiplicação | Multiplica dois números inteiros | ✅ |
| RF04 | Divisão | Divide dois números inteiros | ✅ |
| RF05 | Validação de divisão | Impede divisão por zero | ✅ |
| RF06 | Operação inválida | Trata operadores não suportados | ✅ |

# 6. Requisitos Não Funcionais

| **ID** | **Requisito** | **Descrição** | **Status** |
|:---:|---|---|:---:|
| RNF01 | Legibilidade | Código organizado e fácil de compreender | ✅ |
| RNF02 | Manutenibilidade | Facilitar futuras alterações no código | ✅ |
| RNF03 | Confiabilidade | Garantir resultados corretos nas operações | ✅ |
| RNF04 | Tratamento de erros | Evitar falhas em operações inválidas | ✅ |
| RNF05 | Testabilidade | Permitir a realização de testes unitários | ✅ |
| RNF06 | Documentação | Utilizar JavaDoc para documentar os métodos | ✅ |

# 7. Tecnologias Utilizadas

| **Tecnologia** | **Descrição** |
|---|---|
| Eclipse IDE (4.35.0) | Ambiente de desenvolvimento utilizado para programar e executar o projeto Java. |
| Java | Linguagem utilizada para desenvolver a calculadora. |
| Git | Ferramenta utilizada para controlar as versões do projeto. |
| GitHub | Plataforma utilizada para armazenar o repositório remoto. |
| JavaDoc | Ferramenta utilizada para documentar o código. |
| JUnit 5 | Framework utilizado para realizar testes unitários. |
| Markdown | Linguagem utilizada para estruturar o README.md. |

# 8. Estrutura do Projeto

projeto_calculadora/
│
├── src/
│   └── calculadora/
│       ├── Calculadora.java
│       └── TesteCalculadora.java
│
├── docs/
│   └── index.html
│
├── images/
│   ├── testes/
│   ├── javadoc/
│   └── refatoracao/
│
└── README.md

# 9. Operações Implementadas

# Soma
Realiza a adição de dois números inteiros.

2 + 3 = 5

# Subtração
Calcula a diferença entre dois números inteiros.

10 - 4 = 6

# Multiplicação
Multiplica dois números inteiros.

3 * 5 = 15

# Divisão
Realiza a divisão entre dois números inteiros, desde que o divisor seja diferente de zero.

8 / 2 = 4

A calculadora possui tratamento para operações inválidas. Quando ocorre uma tentativa de divisão por zero ou a utilização de um operador não reconhecido, o sistema apresenta uma exceção correspondente, sendo elas: Uma tentativa de divisão por zero que gera uma "ArithmeticException", enquanto um operador não suportado gera uma "IllegalArgumentException".

# 10. Testes Unitários

Os testes foram desenvolvidos com JUnit 5 para verificar se as operações apresentam os resultados esperados.

Foram considerados os seguintes casos:

Soma;
Subtração;
Multiplicação;
Divisão;
Divisão por zero;
Operação inválida.

# 11. Conclusão

O desenvolvimento do projeto Calculadora permitiu aplicar conhecimentos de programação Java e boas práticas de desenvolvimento de software.

Durante o projeto, foram realizadas melhorias no código por meio da refatoração, utilização de métodos puros, tratamento de exceções, documentação com JavaDoc e testes unitários.

Também foi possível praticar o uso do Git e GitHub para controlar versões e organizar o desenvolvimento do projeto.

Com isso, o resultado foi um código mais organizado, legível e fácil de manter, além de proporcionar maior compreensão sobre a importância da qualidade e dos testes no desenvolvimento de software.

# 5. Autor

Nome: Rafael Reis Táparo
RA: 250891
Curso de Análise e Desenvolvimento de Sistemas
Centro Universitário Facens

# Exercícios Didáticos

Este repositório reúne pequenos exercícios em Java desenvolvidos para praticar entrada de dados, estruturas condicionais, cálculos simples e uso de `switch`.

## Tecnologias

- Java
- Git e GitHub
- Lógica de programação

## Estrutura

```text
Projects/
  AnalyseC/        Exercícios de crédito, salário e classificação de produto
  MediaV/          Exercícios de média de notas
  SystemOp/        Menus de operações matemáticas
  ValidationAge/   Classificação por idade
  CarCust.java     Cálculo do custo final de um carro
  MaiorValue.java  Identificação do maior valor informado
  MenorValue.java  Identificação do menor valor informado
```

## Projetos incluídos

| Arquivo | Descrição |
| --- | --- |
| `Projects/CarCust.java` | Calcula o custo final de um carro com percentuais de distribuidor e imposto. |
| `Projects/MaiorValue.java` | Lê três valores e informa qual é o maior. |
| `Projects/MenorValue.java` | Lê dois valores e informa qual é o menor. |
| `Projects/AnalyseC/AnalyseCredit.java` | Analisa aprovação de empréstimo com base na renda familiar por pessoa. |
| `Projects/AnalyseC/ClassProduto.java` | Calcula aumento de preço e classifica o produto pelo novo valor. |
| `Projects/AnalyseC/NewPagament.java` | Aplica aumento salarial para salários abaixo de um limite. |
| `Projects/AnalyseC/PagamentCredit.java` | Calcula crédito conforme saldo médio. |
| `Projects/AnalyseC/PagamentCredit2.java` | Calcula reajuste salarial por faixa. |
| `Projects/AnalyseC/PagamentCredit3.java` | Calcula gratificação, imposto e salário final. |
| `Projects/MediaV/MediaTwo.java` | Calcula média de duas notas e informa a situação do aluno. |
| `Projects/MediaV/MediaFour.java` | Calcula média de quatro notas e informa aprovação. |
| `Projects/SystemOp/SystemOperations.java` | Menu com média, diferença, produto e divisão. |
| `Projects/SystemOp/SystemOperationTwo.java` | Menu com média, diferença e produto. |
| `Projects/ValidationAge/ValidationAge.java` | Classifica uma idade usando `if/else`. |
| `Projects/ValidationAge/ValidationAge2.java` | Classifica uma idade usando operador ternário. |

## Como executar

Tenha o JDK instalado e execute os comandos na raiz do repositório.

Compile todos os exercícios:

```bash
javac -encoding UTF-8 -d out Projects/*.java Projects/AnalyseC/*.java Projects/MediaV/*.java Projects/SystemOp/*.java Projects/ValidationAge/*.java
```

Execute um arquivo sem pacote:

```bash
java -cp out CarCust
```

Execute um arquivo que está dentro de uma pasta/pacote:

```bash
java -cp out AnalyseC.AnalyseCredit
java -cp out MediaV.MediaTwo
java -cp out SystemOp.SystemOperations
java -cp out ValidationAge.ValidationAge
```

## O que foi praticado

- Entrada de dados com `Scanner`
- Estruturas condicionais com `if`, `else if` e `else`
- Operações matemáticas simples
- Organização de arquivos por tema
- Criação e publicação de repositórios com Git e GitHub

## Observações

- Os arquivos estão separados por tema sempre que havia uma pasta própria.
- A pasta `out/` contém arquivos compilados e não precisa ser versionada.
- Os exercícios usam `Scanner`, então a maioria dos programas pede valores pelo terminal.

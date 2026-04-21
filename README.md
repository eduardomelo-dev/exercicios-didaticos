# Projetos Java - Exercicios de Logica

Este repositorio reune pequenos exercicios em Java desenvolvidos para praticar entrada de dados, estruturas condicionais, calculos simples e uso de `switch`.

## Estrutura

```text
Projects/
  AnalyseC/        Exercicios de credito, salario e classificacao de produto
  MediaV/          Exercicios de media de notas
  SystemOp/        Menus de operacoes matematicas
  ValidationAge/   Classificacao por idade
  CarCust.java     Calculo do custo final de um carro
  MaiorValue.java  Identificacao do maior valor informado
  MenorValue.java  Identificacao do menor valor informado
```

## Projetos incluidos

| Arquivo | Descricao |
| --- | --- |
| `Projects/CarCust.java` | Calcula o custo final de um carro com percentuais de distribuidor e imposto. |
| `Projects/MaiorValue.java` | Lê tres valores e informa qual e o maior. |
| `Projects/MenorValue.java` | Lê dois valores e informa qual e o menor. |
| `Projects/AnalyseC/AnalyseCredit.java` | Analisa aprovacao de emprestimo com base na renda familiar por pessoa. |
| `Projects/AnalyseC/ClassProduto.java` | Calcula aumento de preco e classifica o produto pelo novo valor. |
| `Projects/AnalyseC/NewPagament.java` | Aplica aumento salarial para salarios abaixo de um limite. |
| `Projects/AnalyseC/PagamentCredit.java` | Calcula credito conforme saldo medio. |
| `Projects/AnalyseC/PagamentCredit2.java` | Calcula reajuste salarial por faixa. |
| `Projects/AnalyseC/PagamentCredit3.java` | Calcula gratificacao, imposto e salario final. |
| `Projects/MediaV/MediaTwo.java` | Calcula media de duas notas e informa a situacao do aluno. |
| `Projects/MediaV/MediaFour.java` | Calcula media de quatro notas e informa aprovacao. |
| `Projects/SystemOp/SystemOperations.java` | Menu com media, diferenca, produto e divisao. |
| `Projects/SystemOp/SystemOperationTwo.java` | Menu com media, diferenca e produto. |
| `Projects/ValidationAge/ValidationAge.java` | Classifica uma idade usando `if/else`. |
| `Projects/ValidationAge/ValidationAge2.java` | Classifica uma idade usando operador ternario. |

## Como executar

Tenha o JDK instalado e execute os comandos na raiz do repositorio.

Compile todos os exercicios:

```bash
javac -encoding UTF-8 -d out Projects/*.java Projects/AnalyseC/*.java Projects/MediaV/*.java Projects/SystemOp/*.java Projects/ValidationAge/*.java
```

Execute um arquivo sem pacote:

```bash
java -cp out CarCust
```

Execute um arquivo que esta dentro de uma pasta/pacote:

```bash
java -cp out AnalyseC.AnalyseCredit
java -cp out MediaV.MediaTwo
java -cp out SystemOp.SystemOperations
java -cp out ValidationAge.ValidationAge
```

## Observacoes

- Os arquivos estao separados por tema sempre que havia uma pasta propria.
- A pasta `out/` contem arquivos compilados e nao precisa ser versionada.
- Os exercicios usam `Scanner`, entao a maioria dos programas pede valores pelo terminal.

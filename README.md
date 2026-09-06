# Calculadora de Hipoteca

Calculadora de hipoteca desenvolvida em Java para determinar o valor da prestação mensal de um financiamento a partir do valor do empréstimo, taxa de juros anual e período de pagamento.

## Funcionalidades

* Cálculo da prestação mensal
* Conversão da taxa de juros anual para mensal
* Conversão do período em anos para meses
* Validação dos valores informados
* Formatação do resultado como moeda

## Requisitos

* Java 8 ou superior

## Como executar

Clone o repositório e acesse o diretório do projeto.

Compile a aplicação:

```bash
javac CalculadoraHipoteca.java
```

Execute:

```bash
java CalculadoraHipoteca
```

## Exemplo

```text
Capital: 300000
Taxa de juros anual: 10
Período (Anos): 20

Prestação mensal: R$ 2.895,98
```

## Cálculo

A prestação mensal é calculada utilizando a fórmula:

```text
M = C × [i(1 + i)ⁿ] / [(1 + i)ⁿ - 1]
```

Onde:

* `M` representa a prestação mensal
* `C` representa o capital financiado
* `i` representa a taxa de juros mensal
* `n` representa o número total de parcelas

## Estrutura

```text
src/
└── main/
    └── java/
        └── phillipe/
            └── CalculadoraHipoteca.java
```

## Tecnologias

* Java
* Java Math API
* Java Scanner
* Java NumberFormat

## Autor

Phillipe

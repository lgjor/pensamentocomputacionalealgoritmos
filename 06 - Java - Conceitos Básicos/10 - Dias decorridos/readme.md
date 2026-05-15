# Dias decorridos

`Adaptado de K. N. King: C Programming: A Modern Approach, 2nd Edition.`

Elabore um programa que LÊ DO TECLADO uma data no formato dd/mm/aaaa e ESCREVE NA TELA quantos dias decorreram desde o início do ano até a data informada (inclusive). 

Por exemplo, até o dia 2 de fevereiro, decorreram 33 dias; até o dia 31 de dezembro, decorreram 365 ou 366 dias, dependendo se o ano é bissexto.

O programa deve REPORTAR UM ERRO caso a data seja inválida.

Para tanto, IMPLEMENTE OS SEGUINTES MÉTODOS:

## boolean ehBissexto(int ano):

Retorna verdadeiro se o ano é bissexto, ou falso, caso contrário.

Obs: um ano é bissexto se for múltiplo de 4, exceto se for múltiplo de 100, a menos que seja múltiplo 400.

## int numDias(int mes, int ano):

Retorna o número de dias do mês no ano correspondente.

## boolean ehDataValida(int dia, int mes, int ano):

Retorna verdadeiro se a data é válida, ou falso, caso contrário.

## int diasDecorridos(int dia, int mes, int ano):

Retorna o número de dias decorridos desde o início do ano até a data informada (inclusive).

## Restrições:

- Apenas o método main() deve interagir com o usuário (ou seja, ler e escrever na tela).
- Não utilize comandos de repetição ( for, while, etc.), pois ainda não foram abordados.

## Exemplo de execução:

```
Entre com a data (dd/mm/aaaa): 13/09/2023
Dias decorridos: 256
```
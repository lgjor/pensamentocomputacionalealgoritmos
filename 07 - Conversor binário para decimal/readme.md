# Conversor de binário para decimal

Números inteiros podem ser representados utilizando diferentes bases. 

Por exemplo, o número dezenove (representado como 19, em base decimal) pode ser representado em base binária como 10011:

$$19 = 16 + 2 + 1 = \mathbf{1} \times 2^4 + \mathbf{0} \times 2^3 + \mathbf{0} \times 2^2 + \mathbf{1} \times 2^1 + \mathbf{1} \times 2^0.$$

Elabore um pseudocódigo para um algoritmo que LÊ cinco inteiros (cada um sendo 0 ou 1) que compõem os bits da representação binária de um número e ESCREVE esse número em decimal. 

Assuma que os bits são informados do mais significativo para o menos significativo.

Apresente duas soluções:

- (a) A primeira deve utilizar seis variáveis (uma para cada bit lido e outra para o resultado final em decimal).
- (b) A segunda deve utilizar apenas duas variáveis (uma para acumular o valor do número em decimal e outra para receber cada bit lido).

Para cada caso, execute um teste de mesa com a entrada 1 0 0 1 1; a saída deve ser 19.

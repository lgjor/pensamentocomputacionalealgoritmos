# Exercício em sala: Voto no Brasil

De acordo com o Art. 14, § 1º, da Constituição Federal de 1988:

“O alistamento eleitoral e o voto são: I – obrigatórios para os maiores de dezoito anos; II – facultativos para: a) os analfabetos; b) os maiores de setenta anos; c) os maiores de dezesseis e menores de dezoito anos.”

a. Escreva uma expressão lógica para a variável booleana obrig que, dada a variável inteira idade (representando a idade de um brasileiro) e a variável booleana analf (representando se ele é analfabeto ou não), assume o valor T, se o voto do brasileiro é obrigatório, ou F, caso contrário.

b. Repita o item anterior, mas agora para a variável booleana facul, que assume o valor T, se o voto do brasileiro é facultativo, ou F, caso contrário.
Obs.: Atente para o fato de que obrigatoriedade e facultatividade são mutuamente excludentes (ou seja, se uma é verdadeira, a outra é falsa); no entanto, isso não impede que ambas sejam falsas.

c. Considere agora a variável booleana $inapto \leftarrow idade < 16$, que indica se um brasileiro é inapto para votar. Como a variável facul poderia ser reescrita em termos das variáveis obrig e inapto?

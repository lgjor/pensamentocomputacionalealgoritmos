# Exercício em sala: Ano bissexto

Um ano é bissexto se for divisível por 4. Mas essa regra tem uma exceção: os anos divisíveis por 100, apesar de serem divisíveis por 4, não são bissextos. Porém, há uma exceção à exceção: os anos divisíveis por 400, apesar de serem divisíveis por 100, são sim bissextos. Por exemplo:

- 1983 não é bissexto, pois não é divisível por 4.
- 1992 é bissexto, pois é divisível por 4 (e não se aplica a exceção).
- 1900 não é bissexto, pois, apesar de ser divisível por 4, também é divisível por 100 (e se aplica a exceção).
- 2000 é bissexto, pois, apesar de ser divisível por 100, também é divisível por 400.

Elabore uma expressão lógica que, dada uma variável inteira ano, assume o valor T, se o ano for bissexto, ou F, caso contrário. Dica: Lembre-se que $a$ é divisível por $b$ se e somente se o resto da divisão de $a$ por $b$ é igual a zero.

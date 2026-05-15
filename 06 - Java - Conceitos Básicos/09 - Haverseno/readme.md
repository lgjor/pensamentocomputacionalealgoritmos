# Haverseno

Elabore um programa que LÊ DO TECLADO as coordenadas geográficas (lat, lon) em graus de dois pontos na superfície da Terra e escreve na tela a distância entre eles em quilômetros, dada por: 

$$d = 2r \arcsin \left( \sqrt{\operatorname{hav}(\phi_2 - \phi_1) + \cos(\phi_1) \cos(\phi_2) \operatorname{hav}(\lambda_2 - \lambda_1)} \right)$$

em que:

- $d$: Distância entre os dois pontos.
- $r$: Raio da esfera (ex: raio médio da Terra $\approx 6371$ km).
- $\phi_1, \phi_2$: Latitude dos pontos 1 e 2 (em radianos).
- $\lambda_1, \lambda_2$: Longitude dos pontos 1 e 2 (em radianos).
- $\operatorname{hav}(\theta)$: Função Haverseno, definida como $\sin^2(\frac{\theta}{2})$.
- arcsin é a função arco seno — use o método Math.asin;

Para tanto, IMPLEMENTE OS SEGUINTES MÉTODOS:

- double hav(double theta):
  - Calcula o valor do haverseno de um ângulo em radianos.

- double distanciaNaTerra(double lat1, double lon1, double lat2, double lon2):
  - Calcula a distância entre dois pontos na superfície da Terra, em km, dadas as suas coordenadas em graus.

## Restrições:

- Apenas o método `main()` deve interagir com o usuário (ou seja, ler e escrever na tela).

## Dica:

Utilize o método `Math.toRadians` para converter de graus para radianos.

## Exemplo

```
Entre com lat lon do ponto 1: 38 77
Entre com lat lon do ponto 2: 40 74
Distância entre os pontos: 341.52 km
```
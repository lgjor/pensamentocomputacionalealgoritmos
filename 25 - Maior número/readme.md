# Exercício em sala: Maior número

(a) Elabore um pseudocódigo para um algoritmo que ´LÊ´ um inteiro positivo n ≥ 1, seguido de n números reais (assuma todos positivos) e ´ESCREVE´ o maior número lido. Utilize o comando Enquanto. Em seguida, efetue um teste de mesa com a entrada ´5 7.1 2.5 3.4 8.2 1.9´; a saída deve ser ´8.2´.

(b) Suponha agora que não será informado o número de valores a serem lidos: no lugar, a leitura dos números é encerrada quando o usuário entrar com 0 (zero) ou qualquer número negativo. Utilize o comando

Faça/enquanto. Em seguida, efetue um teste de mesa com a entrada ´7.1 2.5 3.4 8.2 1.9 0´; a saída deve ser 8.2.

## Fluxograma A

[Fluxograma A no fluxolab]([https://fluxolab.app/?lzs=NoIhBplA7CAYC6kQFsCGBLA9gJ3k0HAUzQBt8Dg5wBmcAFgDZqAmasZAIywBcesUIBAQCM4AKwNm4EfXYAdEAEloAM1woiAAgCuKLRmg8iGHFi0AHLAGcMPDADcsiiKG58BQgiwZTWbcBBYLl5+QWFIOgB2P3AWAA52aAA+OFcQdzCIEBwMAHMACx4vSHpfJmp6AJySchCPcIJJSQraaRBFFXUcTS1FcC1oAcVBgC-NM2stYkxrF3qsiOBGcBXWxMD0bBwAXjSFzyWYmNb6DZqyZK3cdMzPQNzC4qX41djxOU3MXB2ZurdQocCABON6tZhJHbQAC0IlugMakBE1BO0kY5xS+wBDWyjyKJWAIjELWkUXa1zwB0RhJ8r3Wnw4wGElDEyLi3hk1BoBDoIh8LB5MmJTU5DAI1DZjAIKzZIgIZTZUQIMSJ4HiypkPmBBFebO1kFBssQSIlYnooglPiJolZluZQA](https://fluxolab.app/?lzs=NoIhBplA7CAYC6kQFsCGBLA9gJ3k0HAUzQBt8Dg5wBmcAFgDZqAmasZAIywBcesUIBAQCM4AKwNm4EfXYAdEAEloAM1woiAAgCuKLRmg8iGHFi0AHLAGcMPDADcsiiKG58BQgiwZTWbcBBYLl5+QWFIOgB2P3AWAA52aAAeAF44VxB3MIgQHAwAcwALHi9Iel8manoAvJJyEI9wgklJKtppEEUVdRxNLUVwLWghxWGAL80zay1iTGsXRpyI4EZwNfbEwPRsHHTM7M8VmJj2+i26sgA+HdwD0M9A-OLSlfj12PE5bcxcVLmGm4Hs1IABOD7tZhJVLQAC0InuTTKwBE1FO0kYF2gVwyS0eeUKJWRIjEbWkUU6tzweJBKJ87023w4wGElDEqLi3hk1BoBDoIh8LD5MlJLW5DAI1A5jAIaw5IgIFQ5UQIMRJ4HiqpkPlBBHeHN1YPFqNEUrE9FN2pFonZUqFwiAA)

## Pseudocódigo A

```
Variáveis
    n, maior, real: número
    
Início
    maior = 0
    Faça
        Escreva "Informe um inteiro positivo"
        Leia n
    enquanto n<0

    Escreva "Informe ", n, " números reais"

    Faça
        Leia real
        
        Se real>maior
            maior=real
        FimSe
        n=n-1
    enquanto n>0

    Escreva maior        

Fim
```

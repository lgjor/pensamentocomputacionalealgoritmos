import java.util.Scanner;

public class Logistica {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre coma região (S/SE/CO, peso (kg) e prazo (1/3/7): ");
        String regiao = scanner.next();
        double peso = scanner.nextDouble();
        int prazo = scanner.nextInt();

        scanner.close();

        System.out.printf("Valor total: R$%.2f\n",calculaFrete(regiao, peso, prazo));
        
    }

    static double obtemPrecoBase(String regiao){
        double precoBase = switch (regiao) {
            case "S"  -> 60.0;
            case "SE" -> 50.0;
            case "CO" -> 80.0;
            default -> throw new RuntimeException("Região Inválida");
        };
        return precoBase;
    }

    static double calculaAdicional(double peso){
        if (peso<=0.5){
            return 0;
        } else if (peso <=2){
            return 15.0;
        } else if (peso<=10){
            return 25.0;
        }
        double pesoAdicional = (10 - peso) * 1000;
        return 50+(0.01*(pesoAdicional));
    }

    static double aplicaPrazo(double fretePadrao, int tipoPrazoEntrega){
        // Retorna o valor do frete já considerando o prazo de entrega
        double precoComPrazo = switch (tipoPrazoEntrega){
            case 1 -> fretePadrao*2;
            case 3 -> fretePadrao;
            case 7 -> fretePadrao-(fretePadrao*15/100);
            default -> throw new RuntimeException("Prazo inválido");
        };
        return precoComPrazo;
    }

    static double calculaFrete(String regiao, double peso, int tipoPrazoEntrega){
        double valorFinalFrete = 0;
        
        // Obtém o preço base
        double precoBase = obtemPrecoBase(regiao);
        valorFinalFrete+=precoBase;

        // Calcula o adicional
        double adicional = calculaAdicional(peso);
        
        valorFinalFrete+=adicional;

        // Adiciona o valor de prazo
        double valorFreteComPrazo = aplicaPrazo(valorFinalFrete, tipoPrazoEntrega);
        valorFinalFrete= valorFreteComPrazo;
        
        // Retorna o valor final com o frete calculado
        return valorFinalFrete;
    }
}

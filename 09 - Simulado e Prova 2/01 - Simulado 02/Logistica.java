import java.util.Scanner;

public class Logistica {
    public static void main(String[] args){

        final int PBSUL = 60;
        final int PBSUDESTE = 50;
        final int PBCOESTE = 80;
        
        System.out.print("Entre com a região (S/E/O):, peso (g) e prazo (1/3/7): ");
        Scanner scanner = new Scanner(System.in);

        String regiao = scanner.next();
        int peso = scanner.nextInt();
        int prazo = scanner.nextInt();
        
        scanner.close();

        double valorFrete = 0;

        // Calcula o adicional por região
        switch (regiao) {
            case "S" -> valorFrete+=PBSUL;
            case "E" -> valorFrete+=PBSUDESTE;
            case "O" -> valorFrete+=PBCOESTE;
            default -> throw new RuntimeException("Região inválida");
        }

        // Calcula adicional do peso
        if (peso > 10000 ) {
            valorFrete+=50+(0.01*(peso-10000));
        } else if (peso>2000){
            valorFrete+=25;
        } else if (peso>500){
            valorFrete+=15;
        }
        
        // Calcula adicional do frete
        
        switch (prazo) {
            case 1 -> valorFrete*=2;
            case 7 -> valorFrete-=(valorFrete*15/100);
            case 3 -> {}
            default -> throw new RuntimeException("Prazo inválido");
        }

        System.out.printf("Remuneração: R$ %.2f\n", valorFrete);

    }
}

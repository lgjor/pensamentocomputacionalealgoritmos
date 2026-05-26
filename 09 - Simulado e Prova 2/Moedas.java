import java.util.Scanner;
public class Moedas{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com a quantidade de centavos: ");
        int centavos = scanner.nextInt();
        scanner.close();

        int m50 = centavos/50;
        centavos = centavos%50;
        int m25 = centavos/25;
        centavos = centavos%25;
        int m10 = centavos/10;
        centavos = centavos%10;
        int m5 = centavos/5;
        centavos = centavos%5;

        System.out.println("Moedas de 50 centavos: "+m50);
        System.out.println("Moedas de 25 centavos: "+m25);
        System.out.println("Moedas de 10 centavos: "+m10);
        System.out.println("Moedas de 5 centavos: "+m5);
        System.out.println("Moedas de 1 centavo: "+centavos);
        
    }
}
import java.util.Scanner;

public class ConversorTempo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a quantidade em segundos: ");
        int entrada = scanner.nextInt();
        scanner.close();

        int horas = entrada / 3600;
        int resto = entrada % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;
        
        if (horas > 0){
            System.out.print(horas);
            if (horas==1){
                System.out.print(" hora");
            } else {
                System.out.print(" horas");
            }
        }

        if (minutos > 0){
            if (horas>0){
                System.out.print(", ");
            }
            System.out.print(minutos);
            if (minutos==1){
                System.out.print(" minuto");
            } else {
                System.out.print(" minutos");
            }
        }

        if (segundos > 0){
            if (horas>0 || minutos>0){
                System.out.print(", ");
            }
            System.out.print(segundos);
            if (segundos==1){
                System.out.print(" segundo");
            } else {
                System.out.print(" segundos");
            }
        }
        
        System.out.println();
    }
}
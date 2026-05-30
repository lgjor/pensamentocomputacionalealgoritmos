import java.util.Scanner;

public class MediaTruncada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com cinco números: ");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();
        double n5 = scanner.nextDouble();

        scanner.close();
        
        double mediaTruncada = obtemMediaTruncada(n1, n2, n3, n4, n5);

        System.out.printf("Média truncada: %.1f\n", mediaTruncada);

    }

    static double minimo(double n1, double n2, double n3, double n4, double n5){
        double minimo = n1;
        if (n2<minimo){
            minimo=n2;
        } 
        if (n3<minimo){
            minimo=n3;
        }
        if (n4<minimo){
            minimo=n4;
        }
        if (n5<minimo){
            minimo=n5;
        }
        return minimo;
    }

    static double maximo(double n1, double n2, double n3, double n4, double n5){
        double maximo = n1;
        if (n2>maximo){
            maximo=n2;
        } 
        if (n3>maximo){
            maximo=n3;
        }
        if (n4>maximo){
            maximo=n4;
        }
        if (n5>maximo){
            maximo=n5;
        }
        return maximo;
    }

    static double obtemMediaTruncada(double n1, double n2, double n3, double n4, double n5){
        double somaTruncada = n1+n2+n3+n4+n5 - maximo(n1, n2, n3, n4, n5) - minimo(n1, n2, n3, n4, n5);
        double mediaTruncada = somaTruncada / 3;
        return mediaTruncada;
    }
}

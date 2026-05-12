import java.util.Scanner;

public class Haverseno {

    static double hav(double theta) {
        double haverseno = Math.pow(Math.sin(theta / 2), 2);
        return haverseno;
    }

    static double distanciaNaTerra(double lat1, double lon1, double lat2, double lon2) {
        final double R = 6371;
        // Converte para radianos
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        double distancia = 2 * R
                * Math.asin( Math.sqrt( hav(lat2 - lat1) + Math.cos(lat1) * Math.cos(lat2) * hav(lon2 - lon1) ) );
        return distancia;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com lat lon do ponto 1: ");
        double lat1 = scanner.nextDouble();
        double lon1 = scanner.nextDouble();

        System.out.print("Entre com lat lon do ponto 2: ");
        double lat2 = scanner.nextDouble();
        double lon2 = scanner.nextDouble();

        double distancia = distanciaNaTerra(lat1, lat2, lon1, lon2);

        System.out.printf("%.2f\n",distancia);

        scanner.close();

    }

}

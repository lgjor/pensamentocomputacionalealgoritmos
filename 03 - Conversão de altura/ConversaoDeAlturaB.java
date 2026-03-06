import java.util.Scanner;

public class ConversaoDeAlturaB {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe a altura em metros: ");
            double alturaEmMetros = scanner.nextDouble();

            double pes = Math.floor(alturaEmMetros*3.28084);
            double sobraEmPes = (alturaEmMetros*3.28084) - pes;
            double polegadas = Math.round(sobraEmPes *12);

            System.out.printf("Altura pés e polegadas: %.2f %.2f%n" , pes, polegadas);
            scanner.close();
        }
    }
}

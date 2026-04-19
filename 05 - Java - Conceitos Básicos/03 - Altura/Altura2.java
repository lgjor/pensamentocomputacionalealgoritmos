import java.util.Scanner;

public class Altura2 {

    public static void main(String args[]){

        double alturaEmMetros, alturaEmCM, alturaEmPolegadas;

        int alturaEmPes;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a altura em metros: ");

        // Lê a altura em metros
        alturaEmMetros = scanner.nextDouble();

        // Converte a altura em Centímetros
        alturaEmCM = alturaEmMetros*100;

        // Calcula a altura em Polegadas
        alturaEmPolegadas = alturaEmCM/2.54;

        // Calcula quantos pés existem na altura em polegadas pegando a parte inteira da divisão por 12
        alturaEmPes = (int)(alturaEmPolegadas / 12);

        // Atualiza a altura em Polegadas para ter apenas o resto da altura em pés
        alturaEmPolegadas = Math.round(alturaEmPolegadas - alturaEmPes*12);

        //Imprime o resultado
        System.out.println(alturaEmPes + " " + (int)(alturaEmPolegadas));

        // Fecha o leitor/scanner
        scanner.close();

    }
}

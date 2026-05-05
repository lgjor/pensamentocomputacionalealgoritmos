import java.util.Scanner;

public class Date {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com a data: ");
        String entrada = scanner.next();

        String [] diaMesAno = entrada.split("/");

        int dia = Integer.parseInt(diaMesAno[0]);
        int mes = Integer.parseInt(diaMesAno[1]);
        int ano = Integer.parseInt(diaMesAno[2]);

        String saida = "";

        switch (mes) {
            case 1 -> saida+="January";
            case 2 -> saida+="February";
            case 3 -> saida+="March";
            case 4 -> saida+="April";
            case 5 -> saida+="May";
            case 6 -> saida+="June";
            case 7 -> saida+="July";
            case 8 -> saida+="August";
            case 9 -> saida+="September";
            case 10 -> saida+="October";
            case 11 -> saida+="November";
            case 12 -> saida+="December";            
        };

        switch (dia) {
            case 01, 21, 31 -> saida+=" "+dia+"st,";
            case 02, 22 -> saida+=" "+dia+"nd,";
            case 03, 23 -> saida+=" "+dia+"rd,";
            default -> saida+=" "+dia+"th,";
        }

        saida+=" "+ano;

        System.out.println(saida);
        scanner.close();
    }
    
}

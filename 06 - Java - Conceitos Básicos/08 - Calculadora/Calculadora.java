import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a expressão: ");
        String entrada = scanner.nextLine();
        System.out.println("Entrada = "+entrada);
        String [] n1OperadorN2 = entrada.split(" ");

        double n1 = Double.parseDouble(n1OperadorN2[0]);
        String operador = n1OperadorN2[1].toString();
        double n2 = Double.parseDouble(n1OperadorN2[2]);

        // teste entrada
        // System.out.println(n1 +" "+ operador +" "+ n2);

        String resultado = switch(operador) {
            case "*" -> (n1*n2).toString;
            case "/" -> //todo;
            case "+" -> //todo
            case "-" -> //todo
        }


        
    }
}

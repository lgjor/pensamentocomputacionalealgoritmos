import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a expressão: ");
        String entrada = scanner.nextLine();
        scanner.close();
        System.out.println("Entrada = "+entrada);
        String [] n1OperadorN2 = entrada.split(" ");

        double n1 = Double.parseDouble(n1OperadorN2[0]);
        String operador = n1OperadorN2[1].toString();
        double n2 = Double.parseDouble(n1OperadorN2[2]);

        if (operador.equals("/") && n2 == 0) {
            throw new RuntimeException("Erro: Divisão por zero");
        }
        // O switch expression exige um caso 'default' ou cobrir todas as possibilidades
        double resultado = switch (operador) {
            case "*" -> n1 * n2;
            case "/" -> n1 / n2;
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            default  -> throw new RuntimeException("Erro: Operador inválido!");
        };

        System.out.println("Resultado: "+resultado);

    }
}

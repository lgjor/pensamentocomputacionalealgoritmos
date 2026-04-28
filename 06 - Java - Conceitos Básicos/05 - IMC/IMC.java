import java.util.Scanner;
public class IMC {
    public static void main(String args[]){

        double peso, altura, imc;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o peso (kg): ");
        peso = scanner.nextDouble();
        System.out.println("Entre com a altura (m): ");
        altura = scanner.nextDouble();
        imc = peso / (altura * altura);
        System.out.printf("IMC: %.2f kg/m2\n", imc);
        System.out.print("Classificação: ");
        if(imc < 18.5){
            System.out.print("Abaixo do peso");
        } else if(imc < 24.9){
            System.out.println("Peso normal");
        } else if(imc < 29){
            System.out.println("Sobrepeso");
        } else if (imc < 34.9) {
            System.out.println("Obesidade");
        } else if (imc < 39.9) {
            System.out.println("Obesidade grave");
        }
        scanner.close();
    }    
}

import java.util.Scanner;
public class vendedor {
    public static void main(String args[]){
        final double SALARIOFIXO = 2000;
        final double META = 10000;
        final double BONUSMAXIMO = 500;

        double valorVenda;
        int avaliacaoDesempenho;
        double remuneracaoFinal;
        double comissao;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o valor total de vendas (R$): ");
        valorVenda = scanner.nextDouble();

        System.out.print("Entre com a avaliação de desempenho: ");
        avaliacaoDesempenho = scanner.nextInt();

        double bonus = 0;

        if ( valorVenda>=META ){
            comissao = 0.07*valorVenda;
        }
        else {
            comissao = 0.05*valorVenda;
        }

        if (avaliacaoDesempenho>=8){
            bonus = BONUSMAXIMO;
        }

        // CÁLCULO DA REMUNERAÇÃO FINAL
        remuneracaoFinal = SALARIOFIXO + comissao + bonus;

        System.out.printf("Remuneração: R$ %.2f\n", remuneracaoFinal);

        scanner.close();
      }    
}

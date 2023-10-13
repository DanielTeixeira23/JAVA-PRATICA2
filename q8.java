import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {

       Scanner leitor = new Scanner(System.in);
       System.out.print("Informe o valor da diária normal: ");
       double diaria = leitor.nextDouble(); 

       double diaria_promocional = diaria * 0.78;
       double valor_medio_da_diaria_sem_promocacao = (diaria * 0.40) * 30;
       double valor_medio_da_ocupacao_com_promocacao = (diaria_promocional * 0.70) * 30; 

       double lucro_ou_prejuizo = valor_medio_da_ocupacao_com_promocacao - valor_medio_da_diaria_sem_promocacao;


       System.out.printf("Valor da diária no período da promoção: R$ %.2f\n" , diaria_promocional);
       System.out.printf("Valor médio arrecadado sem a promoção, durante um mês: R$ %.2f\n" , valor_medio_da_diaria_sem_promocacao);
       System.out.printf("Valor médio arrecadado com a promoção, durante um mês: R$ %.2f\n" , valor_medio_da_ocupacao_com_promocacao);
       System.out.printf("Lucro ou prejuízo mensal com a promoção: R$ %.2f", lucro_ou_prejuizo);
    
       leitor.close();
    }
}
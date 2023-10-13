import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        double cotacao_dolar, valor_dolar, valor_real;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe a cotação do dólar: ");
        cotacao_dolar = leitor.nextDouble();

        System.out.print("Informe um valor em dólares: ");
        valor_dolar = leitor.nextDouble();

        valor_real = cotacao_dolar * valor_dolar;

        System.out.print("Valor em Real: " + valor_real);
        
        leitor.close();
    }   
}
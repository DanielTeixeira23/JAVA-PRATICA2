import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe um valor inteiro de três dígitos: ");
        int numero = leitor.nextInt();

        if (numero >= 100 && numero <= 999) {
            int primeiro_digito = numero / 100;
            int segundo_digito = (numero % 100) / 10;
            int terceiro_digito = numero % 10;

            int numeroInvertido = (terceiro_digito * 100) + (segundo_digito * 10) + primeiro_digito;

            System.out.println("O valor original é: " + numero);
            System.out.println("O valor invertido é: " + numeroInvertido);
        } else {
            System.out.println("O número digitado tem que conter 3 dígitos. Tente novamente.");
        }
        leitor.close();
    }
}
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o valor do saque (valor inteiro): ");
        int numero = leitor.nextInt();


        System.out.println("O valor do saque pode ser expresso em:");
        if (numero >= 100){
            int notasde100 = numero/100;
            numero %= 100;
            System.out.println(notasde100 + " notas de 100");
        }

        if (numero >= 50) {
            int notasde50 = numero/50;
            numero %= 50;
            System.out.println(notasde50 + " notas de 50");
        }

        if (numero >= 10) {
            int notasde10 = numero/10;
            numero %= 10;
            System.out.println(notasde10 + " notas de 10");
        }

        if (numero >= 5) {
            int notasde5 = numero/5;
            numero %= 5;
            System.out.println(notasde5 + " notas de 5");
        }

        if (numero >= 1) {
            int notasde1 = numero/1;
            numero %= 1;
            System.out.println(notasde1 + " notas de 1");
        }

        leitor.close();
    }
}
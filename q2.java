import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        double temperatura_celsius;

        Scanner leitor = new Scanner(System.in);
        System.out.printf("Informe a temperatura em Celsius: ");
        temperatura_celsius = leitor.nextDouble();

        double F = (9 * temperatura_celsius + 160) / 5;

        System.out.print("Temperatura em Fahrenheit: " + F);

        leitor.close();
    }
}
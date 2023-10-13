import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int num;
        System.out.print("Digite um valor entre 0 e 9: ");
        num = leitor.nextInt();

        for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d\n", num, i, num * i);
        }

        leitor.close();
    }
}
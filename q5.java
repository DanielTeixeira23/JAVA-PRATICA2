import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        int idade_ano, idade_mes, idade_dias, idade_ano_em_dias, idade_meses_em_dias;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe sua idade em anos: ");
        idade_ano = leitor.nextInt();

        System.out.print("Informe sua idade em meses: ");
        idade_mes = leitor.nextInt();

        System.out.print("Informe sua idade em dias: ");
        idade_dias = leitor.nextInt();

        idade_ano_em_dias = idade_ano * 365;
        idade_meses_em_dias = idade_mes * 30;

        int idade_total = idade_ano_em_dias + idade_meses_em_dias + idade_dias;
        System.out.println("Anos: " + idade_ano);
        System.out.println("Meses: " + idade_mes);
        System.out.println("Dias: " + idade_dias);
        System.out.println("Idade expressa em dias: " + idade_total);

        leitor.close();
    }
}
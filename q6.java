import java.util.Scanner;

public class q6 {
    public static void main(String[] args){

        int segundos;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe a duração do evento em segundos: ");
        segundos = leitor.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int seg = segundos % 60;

        System.out.printf("%02d:%02d:%02d", horas, minutos, seg);
  
        leitor.close();
    }    
}

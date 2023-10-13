import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        double tempo, velocidade_media;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o tempo gasto na viagem: ");
        tempo = leitor.nextDouble();

        System.out.print("Informe a velocidade média: ");
        velocidade_media = leitor.nextDouble();

        double distancia = tempo * velocidade_media;
        double litros_usados = distancia / 12;
        System.out.println();
        
        System.out.println("Velocidade média: " + velocidade_media);
        System.out.println("Tempo gasto: " + tempo);
        System.out.println("Distância percorrida: " + distancia);
        System.out.printf("Quantidade de litros utilizado na viagem: %.2f" , litros_usados);

        leitor.close();
    }
}
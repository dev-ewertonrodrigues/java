import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de casos de teste: ");
        int cases = sc.nextInt();

        for(int i = 0; i < cases; i++ ){

            System.out.println("Digite a nota nº1: ");
            double nota1 = sc.nextDouble();
            System.out.println("Digite a nota nº2: ");
            double nota2 = sc.nextDouble();
            System.out.println("Digite a nota nº3: ");
            double nota3 = sc.nextDouble();

            double pesoNota1 = 2.0;
            double pesoNota2 = 3.0;
            double pesoNota3 = 5.0;

            double mediaPonderada = ((pesoNota1 * nota1) + (pesoNota2 * nota2) + (pesoNota3*nota3)) / (pesoNota1 + pesoNota2 + pesoNota3);

            System.out.printf("A média ponderada é: %.1f",  mediaPonderada);
        }



    }
}

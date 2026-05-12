import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite a 1ª nota entre 0 e 10: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a 2ª nota entre 0 e 10: ");
        double nota2 = scanner.nextDouble();

        double peso1 = 3.5;
        double peso2 = 7.5;
        double mediaPonderada = ((nota1 * peso1) + (nota2 * peso2)) / (peso1 + peso2);

        System.out.println(" 1ª nota digitada: " + nota1);
        System.out.println(" 2ª nota digitada " + nota2);
        System.out.println("A média Ponderada é = " + mediaPonderada);

    }
}


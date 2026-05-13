import java.util.Scanner;

public class numeroNegativoOuNão {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite um número inteiro positivo ou negativo: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println(" O número " + number + " é NEGATIVO");
        } else {
            System.out.println(" O número " + number + " é POSITIVO");
        }
    }
}

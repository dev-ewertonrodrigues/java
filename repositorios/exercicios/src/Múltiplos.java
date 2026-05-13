import java.util.Scanner;

public class Múltiplos {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o 1º número inteiro: ");
        int number1 = scanner.nextInt();
        System.out.println("Digite o 2º numero inteiro: ");
        int number2 = scanner.nextInt();

        if (number2 % number1 == 0 || (number1 % number2 == 0)) {
            System.out.println("Os número " + number1 + " e " + number2 + " São Múltiplos.");
        } else {
            System.out.println("Os número " + number1 + " e " + number2 + " Não são Múltiplos.");
        }
    }
}

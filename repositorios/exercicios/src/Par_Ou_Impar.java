import java.util.Scanner;

public class Par_Ou_Impar {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite um número inteiro para verificar se ele é PAR ou ÍMPAR: ");
        int evenOrOdd = scanner.nextInt();

        if (evenOrOdd % 2 == 0) {
            System.out.println(" O número " + evenOrOdd + " é PAR.");
        } else {
            System.out.println(" O número " + evenOrOdd + " é Ímpar.");
        }
    }
}

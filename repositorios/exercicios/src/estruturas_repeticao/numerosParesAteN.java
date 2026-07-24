package estruturas_repeticao;

import java.util.Scanner;

public class numerosParesAteN {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int number = scanner.nextInt();
        System.out.println("Os pares até " + number + " são: ");

        for (int i = 0; i < number; i += 2) {
            System.out.printf("%d ", i);
        }
    }
}

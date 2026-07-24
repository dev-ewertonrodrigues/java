package estruturas_repeticao;

import java.util.Scanner;

public class mediaAritimetica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero real ou Inteiro: "); // corresponde a quantidade de números digitados.
        int number = scanner.nextInt();

        double number2; // variável para receber os números digitados
        double soma = 0; // variável para o looping de acréscimo
        double media; // variável para calcular a média final

        for (int i = 1; i <= number; i++) {
            System.out.println("Digite o " + i + "º real: ");
            number2 = scanner.nextDouble();
            soma += number2;

        }
        media = soma / number;

        System.out.printf("A média Aritimética é: " + media);
    }
}

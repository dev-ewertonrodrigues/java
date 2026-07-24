// Receba um número N, em seguida, N números inteiros.
// Calcule e mostre a Soma desses N números inteiros.

package estruturas_repeticao;

import java.util.Scanner;

public class somaNumerosInteiros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro N: ");
        int number = scanner.nextInt();
        int soma = 0;
        for (int i = 1; i <= number; i++) {
            soma += i;
        }
        System.out.println("Soma: " + soma);

    }
}

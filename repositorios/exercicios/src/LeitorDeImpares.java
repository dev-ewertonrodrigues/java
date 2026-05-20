//  Leia um valor inteiro X (1 <= X <= 1000).
//  Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

import java.util.Scanner;

public class LeitorDeImpares {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o número inteiro entre 1 e 1000: ");
        int x = scanner.nextInt();

        for (int i = 0; i <=x; i++ ) {
            if(i % 2 !=0) {
                System.out.printf("%d ", i);

            }
        }


    }
}

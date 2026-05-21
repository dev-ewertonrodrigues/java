//      Ler um valor N.
//      Calcular e escrever seu respectivo fatorial.
//      Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//      Lembrando que, por definição, fatorial de 0 é 1.

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long fatorial = 1;

        System.out.println("Digite um valor N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
             fatorial *= i; // fatorial irá receber o valor de i acumulado * i até chegar ao N digitado
        }
        System.out.println("O fatorial de " + n + " é = " + fatorial);
    }
}

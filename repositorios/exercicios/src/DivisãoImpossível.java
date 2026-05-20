//      Fazer um programa para ler um número N.
//      Depois leia N pares de números e mostre a divisão do primeiro pelo
//      segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

import java.util.Locale;
import java.util.Scanner;

public class DivisãoImpossível {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de N vezes do looping: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Digite o 1º número: ");
            double num1 = sc.nextDouble();
            System.out.println("Digite o 2º número: ");
            double num2= sc.nextDouble();

            double division = num1 / num2;

            if (num2  == 0) {
                System.out.println("Divisão Impossível");
            } else {
                System.out.println("O resultado da divisão é: " + division);
            }
        }
    }
}

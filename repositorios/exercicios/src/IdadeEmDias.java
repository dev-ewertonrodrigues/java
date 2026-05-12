//         Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias.
//         Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias.
//         Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.
//         Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite a idade da pessoa: ");
        int number = scanner.nextInt();

        int age = number;

        int years = age / 365;
        int months = (age % 365) / 30;
        int days = (age % 365) % 30;

        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " dia(s)");
    }
}

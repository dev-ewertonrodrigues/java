//        Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.
//        A seguir, mostre o número e o salário do funcionário
//
//        Entrada:
//        O arquivo de entrada contém 2 números inteiros e 1 número real, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.
//
//        Saída:
//        Imprima o número e o salário do funcionário, conforme exemplo fornecido (em inglês mesmo), com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.

import java.util.Scanner;

public class Salário {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Por favor, insira o número de cadastro do funcionário: ");
        int numberEmployee = scanner.nextInt();
        System.out.println("Por favor, insira o número de horas trabalhadas: ");
        int workedTime = scanner.nextInt();
        System.out.println("Por favor insira o valor recebido por hora trabalhada: ");
        double valorWorkedHours = scanner.nextDouble();

        double salary = workedTime * valorWorkedHours;

        System.out.println("O funcionário número " + numberEmployee + " recebeu U$" + salary + " dólares de salário este mês!");
    }
}

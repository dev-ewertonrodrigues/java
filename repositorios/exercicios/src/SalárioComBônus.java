//  Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
//  Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês
//
//      Entrada:
//      O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores reais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.
//
//      Saída:
//      Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.

import java.util.Scanner;

public class SalárioComBônus {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String employeeName = scanner.nextLine();
        System.out.println("Digite o valor do salário fixo do funcionário: ");
        double salary = scanner.nextDouble();
        System.out.println("Digite o total de vendas do funcionário este mês: ");
        double sales = scanner.nextDouble();

        double commission = sales * 0.15;
        double totalSalary = salary + commission;

        System.out.println("Nome do Funcionário(a): " + employeeName);
        System.out.println("Salário Fixo: R$" + salary + " reais");
        System.out.println("Total de vendas do mês: R$" + sales + " reais");
        System.out.println("Comissão este mês sobre vendas: R$" + commission + " reais");
        System.out.println("O funcionário " + employeeName + " recebeu R$" + totalSalary + " reais de salário este mês");



    }
}

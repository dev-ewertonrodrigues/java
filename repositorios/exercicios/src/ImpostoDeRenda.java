//Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//        mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

// Renda: 0.00 a 2000.0 ISENTO
// Renda: 2000.01 até 3000.00 8%
// Renda: 3000.01 até 4500.00 18%
// Renda: acima de 4500.00 28%

//  Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
//  salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
//  de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
//  duas casas decimais.

import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Informe o salário do contribuinte: ");
        double salary = scanner.nextDouble();

        if (salary >= 0.00 && salary <= 2000.0) {
            System.out.println("ISENTO");
        } else if (salary >=2000.01 && salary <= 3000.00) {
            double taxation8 = (salary - 2000.0) * ( 8 / 100.0 );
            System.out.printf(" O valor pago de impostos será: R$ %.2f%n ", taxation8);
        } else if (salary >= 3000.01 && salary <= 4500.00) {
            double taxation8 = 1000 * (8 / 100.0);
            double taxation18 = ((salary - 3000.00) * ( 18 / 100.0)) + taxation8;
            System.out.printf(" O valor pago de impostos será: R$ %.2f%n ", taxation18);
        } else if (salary >= 4500.01) {
            double taxation8 = 1000 * (8 / 100.0);
            double taxation18 = 1500 * (18 / 100.0);
            double taxation28 = ((salary - 4500.00) * (28 / 100.0)) + taxation8 + taxation18;
            System.out.printf(" O valor pago de impostos será: R$%.2f%n ", taxation28);
        }
    }
}

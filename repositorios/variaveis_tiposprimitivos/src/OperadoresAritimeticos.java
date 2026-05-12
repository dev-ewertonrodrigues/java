import java.util.Scanner;

public class OperadoresAritimeticos {

    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o 1º número em R$");
        double number1 = scanner.nextDouble();
        System.out.println("1º número: " + number1);

        System.out.println("Digite o 2º número em R$");
        double number2 = scanner.nextDouble();
        System.out.println("2º número: " + number2);

        System.out.println("Digite o valor do desconto em % ");
        double descont = scanner.nextDouble();

        System.out.println("O total de desconto ganho é de: " + descont + "%");

        double totalDescont = (descont / 100) * (number1 + number2);
        System.out.println("O valor do desconto aplicado é: R$" + totalDescont);

        double valorTotal = (number1 + number2) - totalDescont;

        System.out.println("O valor total a ser pago com desconto é: R$" + valorTotal);


    }
}

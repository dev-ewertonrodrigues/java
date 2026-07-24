import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º número: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Digite o 2º número: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Digite o 3º número: ");
        double thirdNumber = scanner.nextDouble();

        System.out.println("1º número: " + firstNumber);
        System.out.println("2º número: " + secondNumber);
        System.out.println("3º número: " + thirdNumber);

        double biggerNumber = firstNumber;
        if (secondNumber > biggerNumber) biggerNumber =  secondNumber;
        if (thirdNumber > biggerNumber) biggerNumber =  thirdNumber;


        System.out.println("O Maior entre os 3 números é: " + biggerNumber);
    }
}

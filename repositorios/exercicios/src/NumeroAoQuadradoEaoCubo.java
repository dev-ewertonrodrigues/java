import java.util.Scanner;

public class NumeroAoQuadradoEaoCubo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero N(Tem que ser positivo): ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int number1 = i;
            int number2 = i * i;
            int number3 = i * i * i;

            System.out.printf("%d %d %d%n", number1, number2, number3);
        }
    }
}

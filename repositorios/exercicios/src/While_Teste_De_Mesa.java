import java.util.Scanner;

public class While_Teste_De_Mesa {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o valor INTEIRO de X: ");
        int numberX = scanner.nextInt();
        System.out.println("Digite o valor INTEIRO de Y: ");
        int numberY = scanner.nextInt();

        while (numberX < 5) {
            numberY = numberY + 2;
            numberX = numberX + 1;
            System.out.println(numberX + " = X e Y = " + numberY);
        }
    }
}

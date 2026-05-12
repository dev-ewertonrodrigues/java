import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o número no qual deseja parar o looping: ");
        int number = scanner.nextInt();

//        while (number<20) {
//            System.out.println("Contador: " + number);
//            number++; //number = number +1
//        }

        for (int i = 1; i <= number; i++) {
            System.out.println("Contador do for: " + i);
        }
    }

}

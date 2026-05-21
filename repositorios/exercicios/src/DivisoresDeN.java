import java.util.Scanner;

public class DivisoresDeN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        int n = sc.nextInt();
        System.out.println("Os Divisores de " + n + " são: ");

        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.printf("%s ", i);
            }
        }
    }
}

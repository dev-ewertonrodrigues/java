import java.util.Scanner;

public class ExpressoesComparativas {

    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o valor numérico inteiro do Açucar: ");
        int acucar = scanner.nextInt();
        System.out.println("Valor do Açucar: " + acucar);

        System.out.println("Digite o valor numérico inteiro do Arroz");
        int arroz = scanner.nextInt();
        System.out.println("Valor do Arroz: ");

        System.out.println("Os valores são iguais? " + (acucar==arroz));
        System.out.println("Os valores são diferentes? " + (acucar!=arroz));
        System.out.println("O valor do Açucar é maior que do Arroz? " + (acucar>arroz));
        System.out.println("O valor do Açucar é menor que do Arroz? " + (acucar<arroz));
        System.out.println("O valor do Açucar é menor ou igual ao do Arroz? " + (acucar<=arroz));
        System.out.println("O valor do Açucar é maior ou igual ao do Arroz? " + (acucar>=arroz));
    }
}

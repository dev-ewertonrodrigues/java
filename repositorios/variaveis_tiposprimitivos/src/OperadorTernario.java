import java.util.Scanner;

// if = ?
//else = :

public class OperadorTernario {

    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        String mensagem = (idade >= 18) ? "Você é maior de idade" : "Você é menor de idade ";
        System.out.println(mensagem);
    }
}

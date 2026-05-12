public class Scanner {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Olá, digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Nome: " + nome);

        System.out.println("Digite a sua idade " + nome);
        int idade = scanner.nextInt();
        System.out.println(nome + " a sua idade é: " + idade + " anos");
    }
}

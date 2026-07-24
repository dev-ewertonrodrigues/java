import java.util.Scanner;

public class calculoIMC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String name = scanner.nextLine();
        System.out.println("Informe seu peso(em kg): ");
        double weight = scanner.nextDouble();
        System.out.println("Informe sua altura: ");
        double height = scanner.nextDouble();

        double imc = weight / (height * height);

        System.out.println("Aluno: "  + name);
        System.out.println("Seu IMC é = " + imc);

        if (imc <= 18.5) {
            System.out.println("Você está abaixo do peso");
        } else if (imc > 18.5 && imc <= 24.9 ) {
            System.out.println("Você está dentro da margem normal de peso");
        } else if (imc > 24.9 && imc <= 29.9 ) {
            System.out.println("Risco: Você está em sobrepeso");
        } else if (imc > 29.9 && imc <= 34.9 ) {
            System.out.println("Risco Aumentado: Você está no 1° grau de obesidade");
        } else if (imc > 34.9 && imc <= 39.9 ) {
            System.out.println("Procure um médico: Você está em Obesidade Grave");
        }

        scanner.close();
    }
}

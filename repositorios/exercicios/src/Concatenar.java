import java.util.Locale;
import java.util.Scanner;

public class Concatenar {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);


//        String nome = "Maria";
//        int idade = 35;
//        double salario = 3580.6956;
//
//        System.out.printf("%s tem %d anos e ganha R$%.2f reias mensais%n", nome, idade, salario);

        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf(" Products:%n %s, wich price is $%.2f%n %s, wich price is $%.2f%n", product1, price1, product2, price2);
        System.out.printf("%n Record: %d years old, code %d and gender: %s %n", age, code, gender);
        System.out.printf("%n Meause with eight decimal places: %.8f%n Rouded (three decimal places): %.3f%n ", measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}

import java.util.Scanner;

public class If_Else {

    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

//        System.out.println("Digite a sua idade: ");
//        int idade = scanner.nextInt();
//
//        if(idade >= 18) {
//            System.out.println("Você é maior de idade");
//        }
//        else {
//            System.out.println("Você é menor de idade");
//        }

      boolean temDinheiro = true;
      boolean temCartao = false;

      if(temDinheiro && temCartao) {
          System.out.println("Pede um ifood e Zé Delivery");
      }

      else if (temDinheiro || temCartao) {
          System.out.println("Pede um ifood");
      }

      else {
          System.out.println("To pobre, não vai rolar nada");
      }
    }
}

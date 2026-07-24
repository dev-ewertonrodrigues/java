import java.util.Scanner;

public class operadorTernario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean temDinheiro = false;
        boolean naoTemDinheiro = true;

        //Tipo variável = (condicao) ?(if) valorSeVerdadeiro :(else) valorSeFalso;
        String mensagem = (temDinheiro) ? "Pede um ifood" : "Como o que tem em casa";

        System.out.println(mensagem);


    }
}

// && : E (AND)
// || : Ou (OR)
// ! : Negação (NOT)

public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        System.out.println("X e Y são verdadeiros? " + (x && y));
        System.out.println("X ou Y são verdadeiros? " + (x || y));
        System.out.println("A negação de X é verdadeiro? " + (!x));
        System.out.println("A negação de Y é verdadeiro? " + (!y));

    }
}

public class PlantaCasa {

    // Atributos
    int metragem;
    int numeroQuartos;
    int numeroBanheiros;
    String cor;
    String material;

    // construir, pintar são métodos por exemplo.

    public void construir(){
        System.out.println("A casa foi construída com as seguintes características: ");
        System.out.println("Metragem: " + metragem);
        System.out.println("Numero Quartos: " + numeroQuartos);
        System.out.println("Numero Banheiros: " + numeroBanheiros);
        System.out.println("Material: " + material);
    }
    // Se usa void quando não se tem um tipo de retorno específico.
    public void pintar(){
        System.out.println("A casa foi pintada de: " + cor);
    }

    public void mudarCorParede(String novaCorParede){
        cor = novaCorParede;
        pintar();
    }

    // Tipo de retorno (int) por exemplo + utilizar return;
    public int somaMetragem(){
        return metragem * numeroBanheiros + numeroQuartos;
    }

    public void alterarCaracteristicas(int metros, int quartos, int banheiros, String Materiais){
        metragem = metros;
        numeroQuartos = quartos;
        numeroBanheiros = banheiros;
        material = Materiais;
        construir();
    }

    public static void main(String[] args) {

        // Criando o objetos de classe - casa / casaVizinho são objetos

        PlantaCasa casa = new PlantaCasa();

        // Inicializando os atributos (variáveis) (características) casa
        casa.numeroBanheiros = 3;
        casa.numeroQuartos = 4;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Branca";

        // chamada da função (metodo) da ordem;
        casa.construir();
        casa.pintar();
        casa.mudarCorParede("Verde");
        casa.alterarCaracteristicas(100, 5, 2, "Madeira");

        int resultado = casa.somaMetragem();
        System.out.println(resultado);

        PlantaCasa casaVizinho = new PlantaCasa();
        casaVizinho.metragem = 150;
        casaVizinho.numeroQuartos = 1;
        casaVizinho.numeroBanheiros = 5;
        casaVizinho.cor = "Vermelho";
        casaVizinho.material = "Ferro";

        casaVizinho.construir();
        casaVizinho.pintar();
    }

}

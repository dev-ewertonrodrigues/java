public class Casa {
    public static void main(String[] args) {

        // Criando o objeto

        PlantaCasa casa = new PlantaCasa();

        // Inicializando os atributos (variáveis) (características) casa
        casa.numeroBanheiros = 3;
        casa.numeroQuartos = 4;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Branca";

        // chamada d da função (metodo) da ordem;
        casa.construir();
        casa.pintar();
    }
}

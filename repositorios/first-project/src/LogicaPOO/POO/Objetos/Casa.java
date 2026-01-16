package LogicaPOO.POO.Objetos;

public class Casa {
    public static void main(String[] args) {
//  Criando o objeto casa (***INSTANCIAR***):
        PlantaCasa casa = new PlantaCasa();

//  Inicializando os atributos (variáveis) (adjetivos) (características) do objeto {casa};
        casa.qtddBanheiros = 3;
        casa.qtddQuartos = 5;
        casa.metragem = 120;
        casa.material = "Isopor";
        casa.cor = "Preto";
        casa.dono = "Renato";
        casa.valor = 500.000;

//  Acionando/Chamando (métodos), (funções), (ordem) VOID;
        System.out.println("Informações da casa: ");
        casa.informacoes();
        System.out.println(" ");
        casa.construir();
        System.out.println(" ");
        casa.pintar();

//  Acionando/Chamando (métodos), (funções), (ordem) RETORNO;
        int resultado = casa.somarMetragem();
        System.out.println("A metragem é de: " + resultado);

        casa.mudarCorParede("Branco");
        casa.mudarMaterial("Madeira");
        casa.alterarCaracteriticas(100, 2, 2, "Tijolos");


    PlantaCasa casaVizinho = new PlantaCasa();
    casaVizinho.metragem = 100;
    casaVizinho.material = "Alvenaria";
    casaVizinho.qtddBanheiros = 1;
    casaVizinho.qtddQuartos = 2;
    casaVizinho.cor = "Cinza";

    casaVizinho.construir();
    casaVizinho.pintar();
     };
};
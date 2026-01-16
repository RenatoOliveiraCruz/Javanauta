package LogicaPOO.POO.Objetos;

public class PlantaCasa {
    // Criando variáveis/atributos
    public String dono;
    public String cor;
    public String material;
    public int qtddQuartos;
    public int qtddBanheiros;
    public double valor;
    public int metragem;

    public void informacoes() {
        System.out.println("Dono: " + dono);
        System.out.println("Valor: R$" + valor + "00,00");
    }

    //  Construindo a casa:
    public void construir() {
        System.out.println("A casa foi construída, e essas são as características: ");
        System.out.println("Metragem: " + metragem + "m²");
        System.out.println("Número de quartos " + qtddQuartos);
        System.out.println("Número de banheiros: " + qtddBanheiros);
        System.out.println("Material: " + material);
    };

    //  Pintando a casa:
    public void pintar() {System.out.println("A casa foi pintada de: " + cor);};

    //  Somando metragem:
    public int somarMetragem() {return metragem * qtddBanheiros * qtddQuartos;};

    //  Mudando cor da parede:
    public void mudarCorParede(String novaCor) {cor = novaCor; pintar();};

    // Mudando o material:
    public void mudarMaterial(String novoMaterial) {
        material = novoMaterial;
        System.out.println("O novo material agora é " + novoMaterial);
    };

    // Mudando características:
    public void alterarCaracteriticas(int metros, int quartos, int banheiros, String mat){
    metragem = metros;
    qtddQuartos = quartos;
    qtddBanheiros = banheiros;
    material = mat;

        System.out.println("O novo material agora é " + mat);
    }


};


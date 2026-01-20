package LogicaPOO.POO.Objetos;

public class PlantaCasa {
    public String dono;
    public String cor;
    public String material;
    public int qtddQuartos;
    public int qtddBanheiros;
    public double valor;
    public int metragem;

    public PlantaCasa() {
    }

    public void informacoes() {
        System.out.println("Dono: " + this.dono);
        System.out.println("Valor: R$" + this.valor + "00,00");
    }

    public void construir() {
        System.out.println("A casa foi construída, e essas são as características: ");
        System.out.println("Metragem: " + this.metragem + "m²");
        System.out.println("Número de quartos " + this.qtddQuartos);
        System.out.println("Número de banheiros: " + this.qtddBanheiros);
        System.out.println("Material: " + this.material);
    }

    public void pintar() {
        System.out.println("A casa foi pintada de: " + this.cor);
    }

    public int somarMetragem() {
        return this.metragem * this.qtddBanheiros * this.qtddQuartos;
    }

    public void mudarCorParede(String novaCor) {
        this.cor = novaCor;
        this.pintar();
    }

    public void mudarMaterial(String novoMaterial) {
        this.material = novoMaterial;
        System.out.println("O novo material agora é " + novoMaterial);
    }

    public void alterarCaracteriticas(int metros, int quartos, int banheiros, String mat) {
        this.metragem = metros;
        this.qtddQuartos = quartos;
        this.qtddBanheiros = banheiros;
        this.material = mat;
        System.out.println("O novo material agora é " + mat);
    }
}

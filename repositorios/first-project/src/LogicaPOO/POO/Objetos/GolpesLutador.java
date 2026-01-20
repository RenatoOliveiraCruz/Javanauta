package LogicaPOO.POO.Objetos;

public class GolpesLutador {
    public GolpesLutador() {
    }

    public static void main(String[] args) {
        Lutador golpes = new Lutador();
        golpes.jab = "Jab";
        golpes.direto = "Direto";
        golpes.cruzado = "Cruzado";
        golpes.upper = "Upper";
        golpes.penduloE = "Pendula a esquerda";
        golpes.penduloD = "Pendula a direita";
        golpes.chuteBE = "Leg-kick com a esquerda";
        golpes.chuteBD = "Leg-kick com a direita";
        golpes.chuteAE = "High-kick com a esquerda";
        golpes.chuteAD = "High-kick com a direita";
        golpes.cotovelada = "Cotovelada";
        golpes.joelhada = "Joelhada";
        golpes.clinch = "segura pelo pescoço";
        golpes.combinacaoSimples();
        golpes.combinacaoBoxeBasica();
        golpes.combinacaoMuayThauMediana();
    }
}
package LogicaPOO.POO.Atleta;

public class AtletaIdoso extends Atleta {
    boolean experiente;

    public AtletaIdoso(String etnia, String modalidade, double altura, double peso, boolean experiente) {
        super(etnia, modalidade, altura, peso);
        this.experiente = experiente;
    }

    public void experienciaContavel() {
        if (this.experiente) {
            System.out.printf("Atleta idoso experiente! Muitos títulos conquistados ao longo da carreira.");
        } else {
            System.out.printf("Atleta idoso porém inexperiente... Precisa de mais prática e dedicação.");
        }
    }
}

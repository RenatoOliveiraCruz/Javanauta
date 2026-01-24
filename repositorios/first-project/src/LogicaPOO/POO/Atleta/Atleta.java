package LogicaPOO.POO.Atleta;

public class Atleta {
    String etnia;
    String modalidade;
    double altura;
    double peso;

    public Atleta(String etnia, String modalidade, double altura, double peso) {
        this.etnia = etnia;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public void correr() {
        System.out.printf("Correndo eficientemente\n");
    }

    public void pula() {
        System.out.printf("Pulando alto");
    }
}
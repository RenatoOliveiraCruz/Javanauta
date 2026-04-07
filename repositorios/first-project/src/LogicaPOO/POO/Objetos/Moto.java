package LogicaPOO.POO.Objetos;

public class Moto {
    // Encapsulamento
    private String modelo;
    private String cor;
    private boolean abs;
    private int cilindradas;
    private int tanque;
    private int ano;
    private int velocidade;

    // Construtor
    public Moto(String modelo, String cor, int cilindradas, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.abs = abs;
        this.cilindradas = cilindradas;
        this.tanque = tanque;
        this.ano = ano;
        this.velocidade = 0;
    }

    //  Métodos (comportamentos)
    public void acelerar() {
        velocidade += 40;
        System.out.println(velocidade);
    }

    public void frear() {
        velocidade -= 10;
        if (velocidade < 0) velocidade = 0;
    }

    // Metodo de exibiçao
    public void exibirDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade);
    }

    // Gettes e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }
}
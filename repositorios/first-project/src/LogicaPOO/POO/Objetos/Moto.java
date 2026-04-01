package LogicaPOO.POO.Objetos;

public class Moto {
    public static void main(String[] args) {

    String modelo;
    String cor;
    boolean abs;
    int cilindradas;
    int tanque;
    int ano;
    int velocidade;

    void acelerar(){
        velocidade += 10;
    }

    Moto minhaMoto = new Moto();
    minhaMoto.modelo = "FZ25";
    minhaMoto.acelerar();
    }
}


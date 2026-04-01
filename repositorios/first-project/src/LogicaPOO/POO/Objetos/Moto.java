package LogicaPOO.POO.Objetos;

public class Moto {
    String modelo;
    String cor;
    boolean abs;
    int cilindradas;
    int tanque;
    int ano;
    int velocidade;

    public static void main(String[] args) {

    Moto minhaMoto = new Moto();
    minhaMoto.modelo = "FZ25";
    minhaMoto.acelerar();
    }

    public void acelerar(){
        velocidade += 40;
        System.out.println(velocidade);
    }
}


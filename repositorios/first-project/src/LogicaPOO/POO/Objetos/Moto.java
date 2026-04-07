package LogicaPOO.POO.Objetos;

public class Moto {
    String modelo;
    String cor;
    boolean abs;
    int cilindradas;
    int tanque;
    int ano;
    int velocidade;

    public void acelerar(){
        velocidade += 40;
        System.out.println(velocidade);
    }

    public static void main(String[] args) {

    Moto minhaMoto = new Moto();
    minhaMoto.modelo = "FZ25";
    minhaMoto.acelerar();
    minhaMoto.cor = "Azul";
    minhaMoto.tanque = 14;
    minhaMoto.abs = true;
    minhaMoto.ano = 2025;
    minhaMoto.cilindradas = 250;
    minhaMoto.mostrarCilindradas();
    }

    public void mostrarCilindradas(){
        System.out.println(cilindradas);
    }
}
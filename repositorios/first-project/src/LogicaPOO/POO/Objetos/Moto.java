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
    minhaMoto.getCilindradas();
    }

    public void getCilindradas(){
        if (cilindradas >= 250){
            System.out.println("Boa de pista com: "+cilindradas +" cilindradas.");
        } else {
            System.out.println("Fraca por possuir "+cilindradas +" cilindradas.");
        }
    }
}
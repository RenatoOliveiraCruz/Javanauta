package LogicaPOO.POO.Objetos;

public class Carro {
    public String modelo;
    public String placa;
    public int qntdPortas;

    public Carro() {
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void parar() {
        System.out.println("Parando...");
    }
}
package LogicaPOO.Exercicios.POO.EX01_Heranca;

public class Main {
    public static void main(String[] args) {

    Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);

        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);
    }
}
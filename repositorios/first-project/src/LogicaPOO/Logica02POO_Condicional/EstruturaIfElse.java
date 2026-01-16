package LogicaPOO.Logica02POO_Condicional;

public class EstruturaIfElse {
    public static void main(String[] args) {
        int age = 22;

        if (age >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
//-----------------------------------------------------------------------------------------------//
        boolean ps5 = true;
        boolean pc = true;

        if (pc && ps5) {
            System.out.println("Seu setup é foda!!!");
        } else if (pc || ps5) {
            System.out.println("Que maneiro ter uma plataforma pra jogar né?!");
        } else {
            System.out.println("Vish, que pena, você ta fora da jogatina");
        }
    }
}

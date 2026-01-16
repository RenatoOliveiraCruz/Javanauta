package LogicaPOO.Logica01POO_Sequencial;

public class Strings {
    public static void main(String[] args) {
        String name = "Renato";
        String secondName = "Julio";
        String welcome = "Welcome ";
        boolean verificacao = name.equals(secondName);

        System.out.println(welcome + name);
        System.out.println("Os nomes são iguais: " + verificacao);

    }
}

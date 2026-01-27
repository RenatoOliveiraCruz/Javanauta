package LogicaPOO.Logica02POO_Condicional;

import java.util.Scanner;

public class CategoriaBoxe {
    public CategoriaBoxe() {
    }

    public static void main(String[] args) {

        // Cria o objeto Scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o nome (String)
        System.out.println("Qual o nome do lutador?");
        String nome = scanner.nextLine();

        // Solicita e lê o peso (double)
        System.out.println("Qual o peso do lutador?");
        double peso = scanner.nextDouble();

        if (peso < 70) {
            System.out.printf("O lutador %s, entrará na categoria Peso Pena", nome);
        } else if (peso >= 70 && peso <= 85) {
            System.out.printf("O lutador %s, entrará na categoria Peso Médio", nome);
        } else {
            System.out.printf("O lutador %s, entrará na categoria Peso Pesado", nome);
        }

        // Concatena e formata
        System.out.printf("O lutador %s, entrará na categoria de %.2f kg%n", nome, peso);



    }
}
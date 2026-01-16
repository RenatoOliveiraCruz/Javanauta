package LogicaPOO.Logica03POO_Repetiticoes;

import java.util.Scanner;

public class ArraysEColecoes {
    public static void main(String[] args) {
        // Declaração de array:
        int[] numeros = {10,20,30,50,1};
        String[] frutas;

        // Inicialização de arrays:
        frutas = new String[]{"Maçã", "Morango", "Banana", "Uva"};

        double[] salarios = new double[5];
        salarios[3] = 500.00;
        salarios[1] = 200.50;
        salarios[0] = 150.00;
        salarios[2] = 600.50;
        salarios[4] = 109.00;

        // Iterando arrays com For:
        for (int posicao = 0; posicao < salarios.length; posicao++){
            System.out.println("Salário: " + salarios[posicao]);
        }

        // Iterando arrays com ForEach:
        for(double salario : salarios){
            System.out.println(salario);
        }

        // Atualizando array position:
        salarios[2] = 250.00;
        System.out.println(salarios[2]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o índice do salário");;
        int indice = scanner.nextInt();
        System.out.println("O salário do índice " + indice + " é: " + salarios);
    }
}

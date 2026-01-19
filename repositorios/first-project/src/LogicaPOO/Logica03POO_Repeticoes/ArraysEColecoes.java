package LogicaPOO.Logica03POO_Repeticoes;

import java.util.Scanner;

public class ArraysEColecoes {
    public ArraysEColecoes() {
    }

    public static void main(String[] args) {
        int[] var10000 = new int[]{10, 20, 30, 50, 1};
        String[] var11 = new String[]{"Maçã", "Morango", "Banana", "Uva"};
        double[] salarios = new double[]{150.0, 200.5, 600.5, 500.0, 109.0};

        for(int posicao = 0; posicao < salarios.length; ++posicao) {
            System.out.println("Salário: " + salarios[posicao]);
        }

        double[] var9 = salarios;
        int indice = salarios.length;

        for(int var6 = 0; var6 < indice; ++var6) {
            double salario = var9[var6];
            System.out.println(salario);
        }

        salarios[2] = 250.0;
        System.out.println(salarios[2]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o índice do salário");
        indice = scanner.nextInt();
        System.out.println("O salário do índice " + indice + " é: " + String.valueOf(salarios));
    }
}

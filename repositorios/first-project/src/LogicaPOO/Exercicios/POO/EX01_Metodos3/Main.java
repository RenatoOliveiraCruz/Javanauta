package LogicaPOO.Exercicios.POO.EX01_Metodos3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
      Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno: ");
        aluno.nome = scan.next();

        System.out.println("Entre com o nome do curso: ");
        aluno.curso = scan.next();

        System.out.println("Entre com a Matrícula: ");
        aluno.matricula = scan.next();

    }
}

package LogicaPOO.Exercicios.POO.EX01_Metodos3;

public class Aluno {
    String nome;
    String matricula;
    String curso;
    String[] disciplinas = new String[3];
    double[][] notasDisciplinas = new double[3][4]; // 3 para as Disciplinas e a média

    void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + curso);

        for (int i = 0; i < notasDisciplinas.length; i++){
            System.out.println("Notas da disciplina " + disciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++){
                System.out.println(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean verificarSituacao
    }

package LogicaPOO.Logica03POO_Repeticoes;

public class EstruturaFor {
    public EstruturaFor() {
    }

    public static void main(String[] args) {
        for(int cont = 0; cont < 5; ++cont) {
            System.out.println("Contador: " + cont);
        }

        double[] salarios = new double[]{150.0, 200.5, 600.5, 500.0, 109.0};

        for(int posicao = 0; posicao < salarios.length; ++posicao) {
            System.out.println("Salário: " + salarios[posicao]);
        }

        double[] var8 = salarios;
        int var3 = salarios.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            double salario = var8[var4];
            System.out.println(salario);
        }

    }
}
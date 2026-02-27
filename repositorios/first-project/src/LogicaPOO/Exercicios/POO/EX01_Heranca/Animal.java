package LogicaPOO.Exercicios.POO.EX01_Heranca;

public class Animal {
        private String nome;
        private int comprimento;
        private int patas;
        private String cor;
        private String ambiente;
        private double velocidade;

        public Animal() {
            this.patas = 4;
        }

        public String getNome() {
            return nome;
    }
         public void setNome(String nome) {
            this.nome = nome;
        }
}

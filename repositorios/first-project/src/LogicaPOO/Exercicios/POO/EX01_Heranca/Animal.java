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
        public int getComprimento() {
            return comprimento;
    }
        public void setComprimento(int comprimento) {
            this.comprimento = comprimento;
    }
        public int getPatas() {
            return patas;
    }
        public void setPatas(int patas) {
            this.patas = patas;
    }
        public String getCor(String cor) {
            return cor;
    }
        public void setCor(String cor) {
            this.cor = cor;
    }
        public String getAmbiente() {
            return ambiente;
    }
        public String setAmbiente() {
            return ambiente;
    }

}

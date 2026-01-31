package LogicaPOO.POO.Atleta;

public class Atleta {
    String etnia;
    String modalidade;
   private double altura;
    double peso;

    // Set => O Segurança
    public void setAltura(double novaAltura){
        if(novaAltura < 1.0 || novaAltura > 2.3){
            System.out.println("ERRO: Altura inválida para um atleta!");
        } else {
            this.altura = novaAltura;  // Só aceita se estiver nos parâmetros
            System.out.println("Altura atualizada com sucesso.");
        }
    }

    // Construtor (O manual de como montar o atleta)
    public Atleta(String etnia, String modalidade, double altura, double peso) {
        this.etnia = etnia;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
    }

    // Métodos (Ações)
    public void correr() {
        System.out.println("Correndo eficientemente\n");
    }

    public void pula() {
        System.out.println("Pulando alto");
    }


    // Get => O Informante
    public double getAltura(){
        return this.altura;
    }
}
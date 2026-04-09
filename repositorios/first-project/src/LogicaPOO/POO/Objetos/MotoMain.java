package LogicaPOO.POO.Objetos;

public class MotoMain {
    public static void main(String[] args) {

            Moto minhaMoto = new Moto();
            minhaMoto.modelo = "FZ25";
            minhaMoto.acelerar();
            minhaMoto.cor = "Azul";
            minhaMoto.tanque = 14;
            minhaMoto.abs = true;
            minhaMoto.ano = 2025;
            minhaMoto.cilindradas = 250;
            minhaMoto.getCilindradas();
        }

        public void getCilindradas(){
            int cilindradas;
            if (cilindradas >= 250){
                System.out.println("Boa de pista com: " + cilindradas +" cilindradas.");
            } else {
                System.out.println("Fraca por possuir " +  " cilindradas.");
            }
        }
    }
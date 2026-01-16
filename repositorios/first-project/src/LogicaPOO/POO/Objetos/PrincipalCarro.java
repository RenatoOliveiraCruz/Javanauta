package LogicaPOO.POO.Objetos;

public class PrincipalCarro {
    public static void main(String[] args) {

        Carro obj = new Carro();

        obj.modelo = "BMW X1";
        obj.placa = "SVQA64";
        obj.qntdPortas = 4;


        obj.acelerar();
        obj.parar();
        System.out.println(obj.modelo + "  -  " +  obj.placa + "  -  " + obj.qntdPortas);
    }
}

package LogicaPOO.POO.Atleta;

import java.util.Scanner;

public class AtletaIdoso extends Atleta {
    int idadeMinima = 60;


    public AtletaIdoso (String etnia, String modalidade, double altura, double peso, int idadeMinima){
        super(etnia, modalidade, altura, peso);
        this.idadeMinima = idadeMinima;
    }

    public void experiencia(){

    }
}

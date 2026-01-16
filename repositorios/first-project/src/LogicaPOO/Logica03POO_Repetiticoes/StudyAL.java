package LogicaPOO.Logica03POO_Repetiticoes;

import java.util.ArrayList;
import java.util.List;

public class StudyAL {
    public static void main(String[] args) {
        List<Integer> dado = new ArrayList<>();
        dado.add(1);
        dado.add(2);
        dado.add(3);
        dado.add(4);
        dado.add(5);
        dado.add(6);

        for(Integer face : dado){
            System.out.println("Face: " + face);
        }

        List<String> champs = new ArrayList<>();

    }
}
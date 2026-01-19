package LogicaPOO.Logica03POO_Repeticoes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyAL {
    public StudyAL() {
    }

    public static void main(String[] args) {
        List<Integer> dado = new ArrayList();
        dado.add(1);
        dado.add(2);
        dado.add(3);
        dado.add(4);
        dado.add(5);
        dado.add(6);
        Iterator var2 = dado.iterator();

        while(var2.hasNext()) {
            Integer face = (Integer)var2.next();
            System.out.println("Face: " + face);
        }

        new ArrayList();
    }
}


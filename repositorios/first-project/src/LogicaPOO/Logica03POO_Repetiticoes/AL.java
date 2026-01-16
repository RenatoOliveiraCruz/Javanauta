package LogicaPOO.Logica03POO_Repetiticoes;

import java.util.ArrayList;
import java.util.List;

public class AL {
    public static void main(String[] args) {
        List<Double> horas = new ArrayList<>();
        horas.add(4.2);
        horas.add(5.0);
        horas.add(6.40);
        horas.add(7.07);
        horas.add(9.5);
        horas.add(12.05);
        horas.add(13.10);
        horas.add(15.3);
        horas.add(17.05);
        horas.add(17.3);
        horas.add(19.30);
        horas.add(21.30);
//      ---------------------------------------------------------------------
        List<String> deveres = new ArrayList<>();
        deveres.add("Acordar, alongar e orar.");
        deveres.add("Estar na academia.");
        deveres.add("Tomar banho e café na academia.");
        deveres.add("Estudar e trabalhar.");
        deveres.add("Comer uma fruta.");
        deveres.add("Almoçar");
        deveres.add("Voltar estudar e trabalhar.");
        deveres.add("Comer uama fruta");
        deveres.add("Ir para casa");
        deveres.add("Cortar o cabelo");
        deveres.add("Culto de oração");
        deveres.add("Voltar pra casa ler, orar e dormir");

        for(int i = 0; i < horas.size(); i++){
            System.out.println("Às " + horas.get(i) + " - Compromisso: " + deveres.get(i));
        }

        System.out.println("Para esta quinta-feira você terá " + horas.size() + " compromissos.");

//    for(Double compromisso : horas)
//        System.out.println("Compromisso: " + compromisso);
//    };

    int qntddAgendamentos = 0;
    for(int agendamentos = 0; agendamentos < horas.toArray().length; agendamentos++){
         qntddAgendamentos = agendamentos;
         qntddAgendamentos++;
    };
        System.out.println("Você possui " + qntddAgendamentos + " agendamentos.");
    };
};

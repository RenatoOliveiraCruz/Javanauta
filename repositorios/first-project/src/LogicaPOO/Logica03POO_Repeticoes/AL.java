package LogicaPOO.Logica03POO_Repeticoes;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class AL {
    public AL() {
    }

    public static void main(String[] args) {
        List<Double> horas = new ArrayList();
        horas.add(4.2);
        horas.add(5.0);
        horas.add(6.4);
        horas.add(7.07);
        horas.add(9.5);
        horas.add(12.05);
        horas.add(13.1);
        horas.add(15.3);
        horas.add(17.05);
        horas.add(17.3);
        horas.add(19.3);
        horas.add(21.3);
        List<String> deveres = new ArrayList();
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

        int qntddAgendamentos;
        for(qntddAgendamentos = 0; qntddAgendamentos < horas.size(); ++qntddAgendamentos) {
            PrintStream var10000 = System.out;
            String var10001 = String.valueOf(horas.get(qntddAgendamentos));
            var10000.println("Às " + var10001 + " - Compromisso: " + (String)deveres.get(qntddAgendamentos));
        }

        System.out.println("Para esta quinta-feira você terá " + horas.size() + " compromissos.");
        qntddAgendamentos = 0;

        for(int agendamentos = 0; agendamentos < horas.toArray().length; ++agendamentos) {
            qntddAgendamentos = agendamentos;
            ++qntddAgendamentos;
        }

        System.out.println("Você possui " + qntddAgendamentos + " agendamentos.");
    }
}


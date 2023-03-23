package br.inatel.cdg.exercicioPratico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        List<Funcionario> funcionarioList = new ArrayList<>();
        Random random = new Random();
        Professor professor =new Professor("Fernando", random.nextDouble()*1000);
        Arquiteto arquiteto = new Arquiteto("Sebastiano", random.nextDouble()*1000);
        Engenheiro engenheiro = new Engenheiro("Chris", random.nextDouble()*1000);

        funcionarioList.add(professor);
        funcionarioList.add(engenheiro);
        funcionarioList.add(arquiteto);

        System.out.println("Antes de ordenar");
        for (Funcionario funcionario: funcionarioList) {
            funcionario.mostraInfo();
        }
        Collections.sort(funcionarioList);

        System.out.println("Após ordenar");
        for (Funcionario funcionario: funcionarioList) {
            funcionario.mostraInfo();
        }
    }
}

package br.inatel.cdg.arrayMatriz.arquivoTXT;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Arquivo arq = new Arquivo();
        ArrayList<Funcionario>funcs = arq.ler();

        for (Funcionario func: funcs) {
            System.out.println(func.nome);
            System.out.println(func.idade);
            System.out.println(func.cpf);
        }
    }
}

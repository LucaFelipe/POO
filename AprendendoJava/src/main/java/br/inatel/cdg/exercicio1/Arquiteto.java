package br.inatel.cdg.exercicio1;

import br.inatel.cdg.exercicio1.Funcionario;

public class Arquiteto extends Funcionario {

    public Arquiteto(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public  void mostraInfo(){
        System.out.println("Nome " + super.nome);
        System.out.println("Salario " + super.salario);
    }
    @Override
    public int compareTo(Funcionario f) {
        if(this.salario < f.salario){
            return -1;
        }
        if(this.salario > f.salario){
            return 1;
        }
        return 0;
    }
}

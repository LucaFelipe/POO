package br.inatel.cdg.exercicioPratico;

public abstract class Funcionario implements Comparable<Funcionario> {
    //Classe Mãe
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public  void mostraInfo(){
        System.out.println("Nome " + this.nome);
        System.out.println("Salario " + this.salario);
    }
    @Override
    public int compareTo(Funcionario f) {
        if(this.salario > f.salario){
            return -1;
        }
        if(this.salario < f.salario){
            return 1;
        }
        return 0;
    }

}

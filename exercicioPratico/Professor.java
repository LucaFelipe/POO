package br.inatel.cdg.exercicioPratico;

public class Professor extends Funcionario{

    public Professor(String nome, double salario){
        super(nome, salario);//reaproveito tudo da classe mae
    }

    //Reescrita do metodo
    @Override
    public void mostraInfo(){
        //reutilizando da classe mae, usa-se o super
        super.mostraInfo();
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


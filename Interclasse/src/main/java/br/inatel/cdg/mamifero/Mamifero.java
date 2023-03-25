package br.inatel.cdg.mamifero;

public abstract class Mamifero {
    protected String nome;
    protected double vida;

    public Mamifero(String nome, double vida){
        this.nome = nome;
        this.vida = vida;
    }
    public abstract void emitirSom();

    public void mostraInfo(){
        System.out.println("Nome do animal: " + this.nome);
        System.out.println("Sua vitalidade: " + this.vida + " ano(s)");
    }
}

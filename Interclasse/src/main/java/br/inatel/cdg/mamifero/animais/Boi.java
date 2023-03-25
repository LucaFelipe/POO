package br.inatel.cdg.mamifero.animais;

import br.inatel.cdg.mamifero.Mamifero;

public class Boi extends Mamifero {
    public Boi(String nome, double vida){
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println(super.nome + " está fazendo muuh!");
    }
    @Override
    public void mostraInfo(){
        System.out.println("Nome do animal: " + super.nome);
        System.out.println("Sua vitalidade: " + super.vida + " ano(s)");
    }
}

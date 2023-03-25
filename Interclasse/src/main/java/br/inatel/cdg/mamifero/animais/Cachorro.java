package br.inatel.cdg.mamifero.animais;

import br.inatel.cdg.mamifero.Mamifero;

public class Cachorro extends Mamifero{
    public Cachorro(String nome, double vida){
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println(super.nome + " está latindo");
    }
    @Override
    public void mostraInfo(){
        System.out.println("Nome do animal: " + this.nome);
        System.out.println("Sua vitalidade: " + this.vida + " ano(s)");
    }

}

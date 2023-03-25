package br.inatel.cdg.mamifero.animais;

import br.inatel.cdg.mamifero.Mamifero;

public class Lontra extends Mamifero implements Aquatico {

    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println(super.nome + " está emitindo som");
    }
    @Override
    public void mostraInfo(){
        System.out.println("Nome do animal: " + super.nome);
        System.out.println("Sua vitalidade: " + super.vida + " ano(s)");
    }
    @Override
    public void nadar(){
        System.out.println(super.nome + " está nadando");
    }
}

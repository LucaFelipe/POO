package br.inatel.cdg.mamifero;

import br.inatel.cdg.mamifero.animais.Boi;
import br.inatel.cdg.mamifero.animais.Cachorro;
import br.inatel.cdg.mamifero.animais.Lontra;

public class Main {
    public static void main(String[] args){
        Cachorro dog = new Cachorro("Bilu",2);
        dog.mostraInfo();
        dog.emitirSom();

        Boi boboi = new Boi("Ferdinando", 4);
        boboi.mostraInfo();
        boboi.emitirSom();

        Lontra lontra = new Lontra("Titi",1);
        lontra.mostraInfo();
        lontra.emitirSom();
        lontra.nadar();
    }
}

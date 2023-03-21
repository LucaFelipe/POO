package br.inatel.cdg.polimorfismo.brownie.brownieCafe;

import br.inatel.cdg.polimorfismo.brownie.principal.Brownie;

public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    @Override
    public void mostraInfo(){
        System.out.println(super.nome);
        System.out.println(super.preco);
        System.out.println(super.sabor);
    }

    public void addCafe(){
        System.out.println(super.nome);
    }
}

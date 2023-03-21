package br.inatel.cdg.polimorfismo.brownie.brownieNutella;

import br.inatel.cdg.polimorfismo.brownie.principal.Brownie;

public class BrownieNutella extends Brownie {

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }
    public void addNutella(){
        System.out.println("Adicionou nutella no " + super.nome);
    }

    @Override
    public void addCarrinhoCompra() {
        System.out.println(super.nome);
    }

    @Override
    public void calcularValorTotal() {
        
    }

    @Override
    public void mostraInfo(){
        System.out.println(super.nome);
        System.out.println(super.preco);
        System.out.println(super.sabor);
    }

}

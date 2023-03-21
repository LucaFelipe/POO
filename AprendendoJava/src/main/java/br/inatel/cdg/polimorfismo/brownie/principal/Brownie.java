package br.inatel.cdg.polimorfismo.brownie.principal;

import br.inatel.cdg.polimorfismo.brownie.brownieNutella.BrownieNutella;
import br.inatel.cdg.polimorfismo.brownie.comprador.Comprador;

public abstract class Brownie {
    protected String nome;
    protected String sabor;
    protected double preco;

    Comprador comprador;

    public  Brownie(String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoCompra(){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void calcularValorTotal(){
        this.preco += preco;
        System.out.println(this.nome);
        System.out.println(this.preco);
    }
    public void mostraInfo(){
        System.out.println(this.nome);
        System.out.println(this.sabor);
        System.out.println(this.preco);
    }
}

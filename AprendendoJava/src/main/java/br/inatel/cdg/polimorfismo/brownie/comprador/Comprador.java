package br.inatel.cdg.polimorfismo.brownie.comprador;

import br.inatel.cdg.polimorfismo.brownie.brownieCafe.BrownieCafe;
import br.inatel.cdg.polimorfismo.brownie.principal.Brownie;

public class Comprador {
    private String nome;
    private double saldo;

    public Comprador(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }
    public void efetuarCompra(Brownie brownie){
        brownie.addCarrinhoCompra();
        brownie.calcularValorTotal();

    }

}

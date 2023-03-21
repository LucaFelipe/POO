package br.inatel.cdg.polimorfismo.brownie.brownieDoceLeite;

import br.inatel.cdg.polimorfismo.brownie.principal.Brownie;
import br.inatel.cdg.polimorfismo.brownie.brownieNutella.BrownieNutella;

public class BrownieDoceLeite extends Brownie {
    public BrownieDoceLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }
    public void addDoceLeite(){
        System.out.println("Adicinou doce de leite no " + super.nome);
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

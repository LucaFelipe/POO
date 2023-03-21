package br.inatel.cdg.polimorfismo.brownie;

import br.inatel.cdg.polimorfismo.brownie.brownieCafe.BrownieCafe;
import br.inatel.cdg.polimorfismo.brownie.brownieDoceLeite.BrownieDoceLeite;
import br.inatel.cdg.polimorfismo.brownie.brownieNutella.BrownieNutella;
import br.inatel.cdg.polimorfismo.brownie.principal.Brownie;

public class Main {
    public static void main(String[] args) {
        Brownie bw = new BrownieNutella("juuj",2.0,"nutella");
        Brownie bw1 = new BrownieDoceLeite("soos",1.5,"doce de leite");
        Brownie bw2 = new BrownieCafe("O",1.75,"café");

    }
}

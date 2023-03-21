package br.inatel.cdg.spaceshooter;

import br.inatel.cdg.spaceshooter.inimigo.Asteroides;
import br.inatel.cdg.spaceshooter.jogador.Nave;

// import java.util.Scanner;

public class SpaceShooter {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        Asteroides ast1 = new Asteroides("ast1", "pequeno");
        Asteroides ast2 = new Asteroides("ast2", "grande");
        //Asteroides ast3 = new Asteroides(sc.nextLine(), sc.nextLine());

        Nave nave = new Nave("explosivo");
       // Nave nave2 = new Nave(sc.nextLine(), sc.nextDouble(), sc.nextLine());
        Nave nave3 = new Nave("grande");

        nave.atirar(ast1);
        // nave2.atirar(ast2);
        nave3.atirar(ast2);

    }
}
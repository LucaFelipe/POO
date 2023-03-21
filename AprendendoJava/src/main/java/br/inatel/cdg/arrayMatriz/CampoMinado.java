package br.inatel.cdg.arrayMatriz;

import java.util.Random;
import java.util.Scanner;

public class CampoMinado {
    public static void main(String[] args) {
        boolean[][] campoMinado = new boolean[2][2];
        int posXjogador;
        int posYjogador;
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        int posMinaX = rand.nextInt();
        int posMinaY = rand.nextInt();

        campoMinado[posMinaX][posMinaY] = true;

        for (int i = 0; i < campoMinado.length*2; i++) {
            posXjogador = entrada.nextInt();
            posYjogador = entrada.nextInt();

            if(campoMinado[posXjogador][posYjogador]){
                System.out.println("Boom!");
            }
            else{
                System.out.println("tranks");
            }
        }
    }
}

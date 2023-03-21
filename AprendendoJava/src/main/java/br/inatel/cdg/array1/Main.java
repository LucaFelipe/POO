package br.inatel.cdg.array1;

import br.inatel.cdg.array1.bandaMusica.Banda;
import br.inatel.cdg.array1.bandaMusica.Membro;
import br.inatel.cdg.array1.bandaMusica.Musica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banda banda = new Banda("Os coroínhas","rock");

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um numero para atender as opções entre 0 e 3");
        System.out.println("""
                1- Adicione o nome e a duração da música
                2- Adicione os membros da banda
                3- Mostra as informações da banda
                0- Finaliza o programa""");
        int op = sc.nextInt();

        while(op != 0) {
            if (op == 1) {
                sc.nextLine();
                System.out.println("Adicione o nome e a duração da música: ");
                Musica musica = new Musica(sc.nextLine(), sc.nextDouble());
                banda.addMusicaNova(musica);
                sc.nextLine();
            }
            if (op == 2) {
                sc.nextLine();
                System.out.println("Adicione os membros da banda: ");
                Membro membro = new Membro(sc.nextLine(), sc.nextLine());
                banda.addMembroNovo(membro);
            }
            if (op == 3) {
                banda.mostraInfo();
            }
            else{
                System.out.println("Entrada invalida");
            }
            op = sc.nextInt();
        }

    }
}

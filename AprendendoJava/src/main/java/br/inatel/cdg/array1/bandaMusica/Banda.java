package br.inatel.cdg.array1.bandaMusica;

public class Banda {

    private String nome;
    private String genero;
    private Empresario empresario;

    private Musica[] musicas;
    private Membro[] membros;

    public Banda(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
        musicas = new Musica[1000];
        membros = new Membro[10];
    }

    public void mostraInfo(){
        System.out.println("Nome da banda: " + nome);
        System.out.println("Genero da banda: " + genero);
        System.out.println("As músicas da banda: ");
        int i = 0;
        while (musicas[i] != null){
            System.out.println(musicas[i]);
            i++;
        }
        System.out.println();
        System.out.println("Os membros da banda: ");
        int j = 0;
        while (musicas[j] != null){
            System.out.println(musicas[j]);
            j++;
        }
        System.out.println("Empresario da banda: " + empresario);

    }
    public void addMusicaNova(Musica musica){
        int i = 0;
        while(musicas[i] == null) {
            if(musicas[i] != null){
                break;
            }
            musicas[i] = musica;
            i++;
        }
    }

    public void addMembroNovo(Membro membro){
        int i = 0;
        while(membros[i] == null) {
            if(membros[i] != null){
                break;
            }
            membros[i] = membro;
            i++;
        }
    }


}

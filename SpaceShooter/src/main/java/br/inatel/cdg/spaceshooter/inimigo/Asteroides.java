package br.inatel.cdg.spaceshooter.inimigo;

public class Asteroides {
    private final String nome;
    private final String tipoAsteroides;

    public Asteroides(String nome, String tipoAsteroides){
        this.nome = nome;
        this.tipoAsteroides = tipoAsteroides;
    }

    public String getTipoAsteroides() {
        return tipoAsteroides;
    }

    public void destruir(){
        System.out.println("Asteroide destruido " + this.nome + " destruido");
    }
}

package br.inatel.cdg.amoungus.astronauta.impostor;

import br.inatel.cdg.amoungus.astronauta.*;

public class Impostor extends Astronauta implements Missao, Executar, Sabotar {
    private int qtdMortes;
    public Impostor(String cor, String nome, Skin skin, String pet, int qtdMortes){
        super(cor, nome, skin, pet);
        this.qtdMortes = qtdMortes;
    }
    @Override
    public void mostraInfo(){
        super.mostraInfo();
    }
    @Override
    public void verCameras(){
        super.verCameras();
    }
    @Override
    public void reportar(){
        System.out.println(this.getNome() + " fez um self-report");
    }
    @Override
    public void reparar(){
        System.out.println(this.getNome() + " fingiu que fez um reparo");
    }
    @Override
    public void fazerMissao(){
        System.out.println(this.getNome() + " fez uma tarefa falsa ");
    }
    public void usarVentoinha(){
        System.out.println("O impostor se escondeu na ventilação");
    }
    public void trancarPorta(String local){
        System.out.println("O impostor trancou as portas do(a) " + local);
    }
    @Override
    public void sabotarLuz(){
        System.out.println("O impostor sabotou a luz");
    }
    @Override
    public void sabotarOxigenio(){
        System.out.println("O impostor sabotou o oxigenio");
    }
    @Override
    public void sabotarReator(){
        System.out.println("O impostor sabotou o reator");
    }
    @Override
    public void sabotarComunicacao(){
        System.out.println("O impostor sabotou a comunicação");
    }
    @Override
    public void executar(){
        System.out.println(this.getNome() + " matou um tripulante");
        System.out.println("O numero de mortos eh " + this.getQtdMortes());
    }
    public int getQtdMortes(){
        qtdMortes++;
        return qtdMortes;
    }
    public void setQtdMortes(int qtdMortes){
        this.qtdMortes = qtdMortes;
    }

    @Override
    public void Executar() {
        System.out.println(this.getNome() + " matou um tripulante");
        System.out.println("O numero de mortos eh " + this.getQtdMortes());
    }

    @Override
    public void Missao() {
        System.out.println(this.getNome() + " fez uma tarefa falsa ");
    }

}

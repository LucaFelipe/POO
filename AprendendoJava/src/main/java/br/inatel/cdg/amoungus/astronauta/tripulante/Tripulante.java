package br.inatel.cdg.amoungus.astronauta.tripulante;

import br.inatel.cdg.amoungus.astronauta.Astronauta;
import br.inatel.cdg.amoungus.astronauta.Missao;
import br.inatel.cdg.amoungus.astronauta.Skin;

public class Tripulante extends Astronauta implements Missao {
    private int qtdMissoes;
    public Tripulante(String cor, String nome, Skin skin, String pet, int qtdMissoes){
        super(cor, nome, skin, pet);
        this.qtdMissoes = qtdMissoes;
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
        System.out.println(this.getNome() + " reportou um corpo");
    }
    @Override
    public void reparar(){
        System.out.println(this.getNome() + " fez um reparo");
    }
    @Override
    public void fazerMissao(){
        System.out.println(this.getNome() + " fez uma missao");
        System.out.println("O numero de missoes que restam eh " + this.getQtdMissoes());
    }

    @Override
    public void sabotarLuz() {

    }

    @Override
    public void sabotarOxigenio() {

    }

    @Override
    public void sabotarReator() {

    }

    @Override
    public void sabotarComunicacao() {

    }

    @Override
    public void executar() {

    }

    public int getQtdMissoes(){
        qtdMissoes--;
        return qtdMissoes;
    }
    public void setQtdMissoes(int qtdMissoes){
        this.qtdMissoes = qtdMissoes;
    }

    @Override
    public void Missao() {

    }
}

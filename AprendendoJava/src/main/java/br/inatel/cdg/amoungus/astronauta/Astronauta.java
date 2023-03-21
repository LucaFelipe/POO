package br.inatel.cdg.amoungus.astronauta;

public abstract class Astronauta {
    public static int cont;
    private String cor;
    private String nome;
    //Agregação
    public Skin skin;
    //Composição
    public Pet pet;
    public Astronauta(String cor, String nome, Skin skin, String pet) {
        cont++;
        this.cor = cor;
        this.nome = nome;
        this.skin = skin;
        this.pet = new Pet();
        this.pet.setNome(pet);
    }
    public void mostraInfo(){
        System.out.println("A cor do astronauta eh " + this.getCor());
        System.out.println("O nome do astronauta eh " + this.getNome());
        System.out.println("A skin do astronauta eh " + this.skin.getTipo());
        if(this.pet.getNome()!=null){
            System.out.println("O pet do astronauta se chama " + this.pet.getNome());
        }
        else{
            System.out.println("O astronauta não possui pet");
        }
    }
    public void verCameras(){
        System.out.println(this.getNome() + " olhou as cameras");
    }
    public abstract void reportar();
    public abstract void reparar();
    public static int getCont(){
        return cont;
    }
    public static void setCont(int cont){
        Astronauta.cont = cont;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Skin getSkin(){
        return skin;
    }
    public void setSkin(Skin skin){
        this.skin = skin;
    }
    public Pet getPet(){
        return pet;
    }
    public void setPet(Pet pet){
        this.pet = pet;
    }

    public abstract void fazerMissao();

    public abstract void sabotarLuz();

    public abstract void sabotarOxigenio();

    public abstract void sabotarReator();

    public abstract void sabotarComunicacao();

    public abstract void executar();
}
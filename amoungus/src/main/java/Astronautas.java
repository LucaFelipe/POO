public abstract class Astronautas {

    public static int cont;
    private String cor;
    private String nome;
    Skin skin;
    Pet pet;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Astronautas(String nome, String cor, Skin skin, Pet pet){
        this.nome = nome;
        this.cor = cor;
        this.skin = skin;
        this.pet = pet;
    }

    public void mostrarInfo(){
        System.out.println("Nome do tripulante: " + this.nome);
        System.out.println("Cor do tripulante: " + this.cor);

        if(skin != null){
            System.out.println("Skin do tripulante: " + this.skin);
        }
        if(pet != null){
            System.out.println("Pet do tripulante: " + this.pet);
        }

    }

    public void verCamera(){
        System.out.println(this.nome + " olhos as cameras");
    }

    public abstract void reportar();

    public abstract void reparar();

}

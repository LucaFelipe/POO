public class Impostor extends Astronautas {
    private int qtdMortes;

    public Impostor(String nome, String cor, Skin skin, Pet pet) {
        super(nome, cor, skin, pet);
    }

    public void mostraInfo(){
        System.out.println("Nome do tripulante: " + this.getNome());
        System.out.println("Cor do tripulante: " + this.getCor());

        if(skin != null){
            System.out.println("Skin do tripulante: " + this.skin);
        }
        if(pet != null){
            System.out.println("Pet do tripulante: " + this.pet);
        }
        System.out.println("Quantidade de missões: " + this.qtdMortes);
    }
    public void usarVentoinha(){
        System.out.println(this.getNome() + "o impostor se escondeu na ventilação");
    }
    public void tracarPortas(String local){
        System.out.println(this.getNome() + "O impostor trancou as portas do(a) " + local);
    }

    @Override
    public void verCamera(){
        System.out.println(this.getNome() + " olhou a camera");
    }

    @Override
    public void reportar() {
        System.out.println(this.getNome() + " fez um self report");
    }

    @Override
    public void reparar() {
        System.out.println(this.getNome() + " fingiu reparo");
    }

}

public class Tripulantes extends Astronautas {

    private int qtdMissoes;

    public Tripulantes(String nome, String cor, Skin skin, Pet pet) {
        super(nome, cor, skin, pet);
        this.setNome(nome);
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
        System.out.println("Quantidade de missões: " + this.qtdMissoes);
    }

    @Override
    public void verCamera(){
        System.out.println(this.getNome() + " olhou a camera");
    }

    @Override
    public void reportar() {
        System.out.println(this.getNome() + " reportou um corpo");
    }

    @Override
    public void reparar() {
        System.out.println(this.getNome() + " fez um reparou");
    }
}

public class Nave {
    private String nome;
    public Personagem[] personagem;
    private boolean velocidadeLuz;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVelocidadeLuz() {
        return velocidadeLuz;
    }

    public void setVelocidadeLuz(boolean velocidadeLuz) {
        this.velocidadeLuz = velocidadeLuz;
    }

    public void mostraInfo(){
        System.out.println("Nome da nave " + this.nome );
        System.out.println("O piloto " + this.personagem);
        if(velocidadeLuz == true){
            System.out.println("Está viajando na velocidade da luz");
        }
        else{
            System.out.println("Velocidade da luz desligada");
        }
    }
}

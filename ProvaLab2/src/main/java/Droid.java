public class Droid extends Personagem {
    private boolean hostil;

    public Droid(String nome, int id, int poder, boolean hostil) {
        super(nome, id, poder);
        this.hostil = hostil;
    }

    public void hackearSistema(){
        System.out.println(this.getNome() + "está hackeando o sistema");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
    }

    @Override
    public void travarBatalha() {
        super.travarBatalha();
        if(hostil == false){
            System.out.println(this.getNome() + " travou uma batalha contra um sith");
           setPoder(+1);
        }
        else {
            System.out.println(this.getNome() + " travou uma batalha contra um jedi");
            setPoder(+1);
        }
    }
}

public class Sith extends Personagem implements Forca{
    private boolean darth;
    private Sabre sabre;

    public Sith(String nome, int id, int poder, boolean darth, Sabre sabre) {
        super(nome, id, poder);
        this.darth = darth;
        this.sabre = sabre;
    }

    public void corromperJedi(){
        if(darth == true && getPoder() >= 60){
            System.out.println(this.getNome() + " levou um jedi para o lado negro da força");
        }
        else{
            System.out.println(this.getNome() + " ainda não consegue corromper jedis");
        }

    }

    @Override
    public void usarForca() {
        System.out.println(this.getNome() + " usou o lado negro da força");
        this.setPoder(+1);
    }

    @Override
    public void trocarSabre() {
       Sabre sabre = new Sabre("vermelho");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
    }

    @Override
    public void travarBatalha() {
        super.travarBatalha();
        System.out.println(this.getNome() + " travou uma batalha contra um jedi");
        this.setPoder(+3);
    }
}

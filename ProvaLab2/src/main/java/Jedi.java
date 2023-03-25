public class Jedi extends Personagem implements Treinamento, Forca{
    private boolean mestre;
    private Sabre sabre;

    public Jedi(String nome, int id, int poder, boolean mestre, Sabre sabre) {
        super(nome, id, poder);
        this.mestre = mestre;
        this.sabre = sabre;
    }

    @Override
    public void treinarPadawan() {
        if(mestre == true || getPoder() > 70){
            System.out.println(this.getNome() + " treinou um Padawan");
        }
        else {
            System.out.println(this.getNome() + " ainda não consegue treinar padawans");
        }
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
    }

    @Override
    public void travarBatalha() {
        super.travarBatalha();
        System.out.println(this.getNome() + " travou uma batalha contra um sith");
        this.setPoder(+1);
    }

    @Override
    public void usarForca() {
        System.out.println(this.getNome() + " usou a força para o bem");
        this.setPoder(+5);
    }

    @Override
    public void trocarSabre() {
        Sabre sabre = new Sabre("azul");
    }
}

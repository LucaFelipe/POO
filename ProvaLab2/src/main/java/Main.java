import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Personagem[] personagem = new Personagem[1000];
        Random random = new Random();
        Nave nave = new Nave();
        nave.setNome("Millenion Falcon");
        nave.setVelocidadeLuz(true);


        Jedi jedi = new Jedi("Obiwan", random.nextInt(), 70, true, new Sabre("azul"));
        personagem[0] = jedi;
        Sith sith = new Sith("Anakin", random.nextInt(), 50,true, new Sabre("azul"));
        personagem[1] = sith;
        Droid droid = new Droid("R2D2", random.nextInt(),40, false);

        Jedi cavaleiro;
        Sith lord;
        Droid android;
        System.out.println("Numero de personagens: " + Personagem.cont);
        System.out.println();

        nave.mostraInfo();
        for (Personagem value : personagem) {
            if (value != null) {
                if (value == jedi) {
                    cavaleiro = (Jedi) value;
                    cavaleiro.mostraInfo();
                    cavaleiro.travarBatalha();
                    cavaleiro.treinarPadawan();
                    cavaleiro.trocarSabre();
                    cavaleiro.usarForca();
                    cavaleiro.mostraInfo();
                }
                else if (value == sith) {
                    lord = (Sith)value;
                    lord.mostraInfo();
                    lord.travarBatalha();
                    lord.corromperJedi();
                    lord.usarForca();
                    lord.trocarSabre();
                    lord.mostraInfo();
                }
                else if (value == droid){
                    android = (Droid) value;
                    android.mostraInfo();
                    android.travarBatalha();
                    android.hackearSistema();
                    android.mostraInfo();
                }
            }
        }
    }
}

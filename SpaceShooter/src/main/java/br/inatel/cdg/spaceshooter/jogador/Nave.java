package br.inatel.cdg.spaceshooter.jogador;
import br.inatel.cdg.spaceshooter.inimigo.Asteroides;

public class Nave {
    private final String tipoTiro;

    public Nave(String tipoTiro) {
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroides ast){

        if (ast.getTipoAsteroides().equals("grande")){
            if(this.tipoTiro.equals(("Explosivo"))){
            System.out.println("Tipo de tiro " + this.tipoTiro);
            ast.destruir();
            }
            else{
                System.out.println("Tipo de tiro " + this.tipoTiro);
                System.out.println("Não pode ser destruido por tiro normal");
            }
        }
        else{
            ast.destruir();
        }
    }
}


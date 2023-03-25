 public abstract class Personagem{
    public static int cont;
    private String nome;
    private int id;
    private int poder;

    Nave nave = new Nave();

     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     public Personagem(int id) {
         this.id = id;
     }

     public int getPoder() {
         return poder;
     }

     public void setPoder(int poder) {
         this.poder = poder;
     }


     public Personagem(String nome, int id, int poder) {
            cont++;
            this.nome = nome;
            this.id = id;
            this.poder = poder;
    }

    public void mostraInfo(){
            System.out.println("O nome do personagem " + this.nome);
            System.out.println("O poder do personagem " + this.poder);
            System.out.println("A identificação do personagem " + this.id);
    }
    public void travarBatalha(){

    }

}


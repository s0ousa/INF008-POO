public class Empresa {
    private String nome;
    private Chefe chefe;

    public Empresa(String nome, Chefe chefe) {
        this.nome = nome;
        this.chefe = chefe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Chefe getChefe() {
        return chefe;
    }

    public void setChefe(Chefe chefe) {
        this.chefe = chefe;
    }
}

public abstract class Pessoa {
    private String nome;
    private Chefe chefe;

    public Pessoa(String nome, Chefe chefe) {
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

    public void listarSuperiores(){
        if(getChefe()!= null){
            System.out.println(getChefe().getNome());
            getChefe().listarSuperiores();
        } else {
            System.out.println("Não há mais superiores.");
        }
    }
    public abstract void listarSubordinados() throws EmpregadoNaoPossuiSubordinado;

}

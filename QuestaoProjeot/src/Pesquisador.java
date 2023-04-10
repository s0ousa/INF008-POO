public abstract class Pesquisador {
    private String nome;
    private Coordenador coordenador;

    public Pesquisador(String nome, Coordenador coordenador) {
        this.nome = nome;
        this.coordenador = coordenador;
    }

    public Pesquisador (String nome){
        this.nome =  nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public abstract void listarSubordinados() throws ProfessorNaoTemSubordinado;
    public abstract int qntdSubordinados();
    public abstract double calculaSalario();

}

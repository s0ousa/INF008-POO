public class Professor extends Pesquisador{
    public Professor(String nome, Coordenador coordenador) {
        super(nome, coordenador);
    }

    @Override
    public void listarSubordinados() throws ProfessorNaoTemSubordinado {
        throw new ProfessorNaoTemSubordinado();
    }

    @Override
    public int qntdSubordinados() {
        return 0;
    }

    @Override
    public double calculaSalario() {
        return 220 + (0.3 * getCoordenador().calculaSalario());
    }
}

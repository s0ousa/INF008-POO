public class Empregado extends Pessoa{
    public Empregado(String nome, Chefe chefe) {
        super(nome, chefe);
    }
    public void listarSubordinados() throws EmpregadoNaoPossuiSubordinado{
        throw new EmpregadoNaoPossuiSubordinado();
    }
}

import java.util.ArrayList;

public class Chefe extends Pessoa{
    private ArrayList<Pessoa> subordinados;

    public Chefe(String nome, Chefe chefe) {
        super(nome, chefe);
        this.subordinados = new ArrayList<Pessoa>();
    }

    public void addSubordinado(Pessoa subordinado){
        subordinados.add(subordinado);
        subordinado.setChefe(this);
    }

    public void removeSubordinado(Pessoa subordinado){
        subordinados.remove(subordinado);
    }

    @Override
    public void listarSubordinados() throws EmpregadoNaoPossuiSubordinado {
        for (Pessoa subordinado: subordinados){
            System.out.println(subordinado.getNome());
            subordinado.listarSubordinados();
        }
    }
}

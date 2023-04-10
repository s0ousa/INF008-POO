import java.util.ArrayList;

public abstract class Pessoa {
    private String nome;
    private ArrayList<Pessoa> descendentes;

    public Pessoa(String nome) {
        this.nome = nome;
        this.descendentes = new ArrayList<Pessoa>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Pessoa> getDescendentes() {
        return descendentes;
    }


    public void listarDescendentes() throws NatimorfoNaoTemDescendente{
        for (Pessoa descendente:descendentes) {
            System.out.println(descendente.getNome());
            descendente.getDescendentes();
        }
    }


    public abstract void cadastrarFilho(String nome, String sexo) throws NatimorfoNaoTemDescendente;
}

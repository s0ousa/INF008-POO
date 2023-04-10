public class Natimorfo extends Pessoa {
    public Natimorfo(String nome) {
        super(nome);
    }

    @Override
    public void cadastrarFilho(String nome) throws NatimorfoNaoTemDescendente {
        throw new NatimorfoNaoTemDescendente();
    }


}

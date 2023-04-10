import java.util.ArrayList;

public class Filho extends Pessoa {

    public Filho(String nome) {
        super(nome);
    }

    @Override
    public String getNome() {
        return "Sr." + super.getNome();
    }

    @Override
    public void cadastrarFilho(String nome, String sexo) {
        if(getDescendentes().size()==1){
            getDescendentes().add(new Natimorfo(nome));
        } else {
            if(sexo.equalsIgnoreCase("Masculino")){
                getDescendentes().add(new Filho(nome));
            }else {
                getDescendentes().add(new Filha(nome));
            }
        }
    }
}

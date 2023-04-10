import java.util.Random;

public class Filha extends Pessoa {
    public Filha(String nome) {
        super(nome);
    }
    @Override
    public String getNome() {
        return "Sra." + super.getNome();
    }
    @Override
    public void cadastrarFilho(String nome, String sexo) {
        if(sexo.equalsIgnoreCase("Masculino")){
            Random sorteador = new Random();
            int vida = sorteador.nextInt(2);
            if(vida==1){
                getDescendentes().add(new Filho(nome));
            } else {
                getDescendentes().add(new Natimorfo(nome));
            }
        } else{
            getDescendentes().add(new Filha(nome));
        }
    }
}

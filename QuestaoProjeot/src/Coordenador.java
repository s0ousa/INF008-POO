import java.util.ArrayList;

public class Coordenador extends Pesquisador{
    private ArrayList<Pesquisador> subordinados;

    public Coordenador(String nome, Coordenador coordenador){
        super(nome, coordenador);
        this.subordinados = new ArrayList<Pesquisador>();
    }
    public Coordenador(String nome){
        super(nome);
    }

    public void addSubordinado(Pesquisador subordinado){
        subordinados.add(subordinado);
    }
    @Override
    public void listarSubordinados() throws ProfessorNaoTemSubordinado {
        if(subordinados!=null){
            for (Pesquisador subordinado: subordinados) {
                System.out.println(subordinado.getNome());
                subordinado.listarSubordinados();
            }
        } else{
            throw new ProfessorNaoTemSubordinado();
        }
    }

    @Override
    public int qntdSubordinados() {
        int soma = subordinados.size();
        for(Pesquisador subordinado:subordinados){
            soma+= subordinado.qntdSubordinados();
        }
        return soma;
    }

    @Override
    public double calculaSalario(){
        return 300*2.5/100*qntdSubordinados();
    }

}

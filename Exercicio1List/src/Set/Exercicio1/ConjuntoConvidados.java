package Set.Exercicio1;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosset;

    public ConjuntoConvidados() {
        this.convidadosset = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosset.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoconvite){
        Convidado convidadopararemover= null;
        for (Convidado c: convidadosset){
            if (c.getCodigoConvite() == codigoconvite) {
                convidadopararemover= c;
                break;
            }
        }
        convidadosset.remove(convidadopararemover);
    }

    public int contarconvidados (){
        //size conta os elementos
        return convidadosset.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosset);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados= new ConjuntoConvidados();

        System.out.println("Existem "+ conjuntoConvidados.contarconvidados()+ " convidados dentro do set ");
        
        conjuntoConvidados.adicionarConvidado("convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("convidado 4", 1236);

        System.out.println("Existem "+ conjuntoConvidados.contarconvidados()+ " convidado dentro do set ");
        
     
        conjuntoConvidados.removerConvidadoPorCodigo(1236);

        System.out.println("Existem "+ conjuntoConvidados.contarconvidados()+ " convidado dentro do set ");

        conjuntoConvidados.exibirConvidados();
    }

}

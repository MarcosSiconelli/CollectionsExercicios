package List.Exercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoalist;

    public OrdenacaoPessoas(List<Pessoa> pessoalist) {
        this.pessoalist = new ArrayList<>();
    }

    public void adicionarPessoa (String nome, int idade, double altura){
        pessoalist.add(new Pessoa(nome, idade, altura));
    }

    public List <Pessoa> ordenarporidade(){
        List<Pessoa> pessoaporidade = new ArrayList<>(pessoalist);
        //sort ele ordena essa lista de acordo com o comparable
        Collections.sort(pessoaporidade);
        return pessoaporidade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List <Pessoa> pessoaporaltura = new ArrayList<>(pessoalist);
        Collections.sort(pessoaporaltura, new ComparatorPorAltura());
        return pessoaporaltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaopessoas=new OrdenacaoPessoas(null);
        ordenacaopessoas.adicionarPessoa("marcos", 24, 1.90);
        ordenacaopessoas.adicionarPessoa("paula", 28, 1.75);
        ordenacaopessoas.adicionarPessoa("rodrigo", 26, 1.80);
        ordenacaopessoas.adicionarPessoa("julia", 25, 1.56);

        System.out.println(ordenacaopessoas.ordenarporidade());
        System.out.println(ordenacaopessoas.ordenarPorAltura());

    }

}

package Set.Exercicio3pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>() ;
}

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato (){
        System.out.println(contatoSet);
    }
//startswith é uma arma para strings pois vai anexar todos os nomes parecidos nessa lista
    public Set<Contato> pesquisarPorNome (String nome){
        Set<Contato> contatospornome = new HashSet<>();
        for (Contato c: contatoSet){
            if (c.getNome().startsWith(nome)) {
                contatospornome.add(c);
            }
        }
    return contatospornome;
    }
//equalsIgnoreCase serve para casos que são identicos
    public Contato atualizarNumero (String nome, int novonumero){
        Contato contatoAtualizado= null;
        for(Contato c: contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novonumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        
        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("marcos", 123456);
        agendaContatos.adicionarContato("marcos", 0);
        agendaContatos.adicionarContato("marcos Siconelli", 1111111);
        agendaContatos.adicionarContato("marcos 010", 845678);
        agendaContatos.adicionarContato("maria Silva", 1111111);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("marcos"));

        System.out.println("Contato atualizado "+ agendaContatos.atualizarNumero("maria Silva", 1546789));

        agendaContatos.exibirContato();
    }
}
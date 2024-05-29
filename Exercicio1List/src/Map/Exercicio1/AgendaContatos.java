package Map.Exercicio1;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato (String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    
    public void removerContato (String nome){
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibircontato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisaPorNome(String nome){
        Integer numeropornome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeropornome= agendaContatoMap.get(nome);
        }
        return numeropornome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Marcos", 123456);
        agendaContatos.adicionarContato("Marcos", 5665);
        agendaContatos.adicionarContato("Marcos Siconelli", 111111);
        agendaContatos.adicionarContato("Marcos DIO", 654321);
        agendaContatos.adicionarContato("Maria Silva", 111111);
        agendaContatos.adicionarContato("Marcos", 444444);
        //trabalhando com put no map serve para atualizar também a lista, assim a ultima chave que vai ficar gravada enquanto no set é a primeira.

        agendaContatos.exibircontato();

        agendaContatos.removerContato("Maria Silva");

        agendaContatos.exibircontato();

        System.out.println("o número é " + agendaContatos.pesquisaPorNome("Marcos DIO"));
    }


}

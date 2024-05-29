package Map.Exercicio5;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarevento(LocalDate data, String nome, String atracao){
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        /*Set<LocalDate> dataset= new eventoMap.keySet();
        Collection<Evento> values = eventoMap.values();*/
        //eventoMap.get()
        LocalDate dataatual= LocalDate.now();//retorna a data atual

        LocalDate proximadata= null;
        Evento proximoevento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        //o entry set retorna um set(um elemento unico),
        for(Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataatual) || entry.getKey().isAfter(dataatual)) {
                proximadata= entry.getKey();
                proximoevento= entry.getValue();
                System.out.println("o próximo evento" + proximoevento + " é na data " + proximadata);
                break;
            }
        }
    }



    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarevento(LocalDate.of(2024, Month.JULY, 15), "Evento 1", "Atracao 1");
        agendaEventos.adicionarevento(LocalDate.of(2022, 7, 9), "Evento 2", "Atracao 2");
        agendaEventos.adicionarevento(LocalDate.of(2000, 1, 10), "Evento 3", "Atracao 3");
        agendaEventos.adicionarevento(LocalDate.of(2024, 6, 10), "Evento 6", "Atracao 5");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }

    

}

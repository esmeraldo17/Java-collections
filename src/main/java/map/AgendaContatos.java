package main.java.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //Atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Esmeraldo", 1234);
        agendaContatos.adicionarContato("Esmeraldo", 12345678);
        agendaContatos.adicionarContato("Edson Alberto", 111111);
        agendaContatos.adicionarContato("OSoba Mask", 85784);
        agendaContatos.adicionarContato("Carlos", 22224);

        agendaContatos.exibirContatos();
        
        agendaContatos.removerContato("Carlos");

        agendaContatos.exibirContatos();

        System.err.println("O contato e: " + agendaContatos.pesquisarPorNome("OSoba Mask"));
    }
}

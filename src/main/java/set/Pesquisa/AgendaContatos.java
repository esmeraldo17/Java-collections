package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // atributo 
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();

        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for(Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;

    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Esmeraldo", 932);
        agendaContatos.adicionarContato("Esmeraldo", 932498);
        agendaContatos.adicionarContato("Esmeraldo Alberto", 2222);
        agendaContatos.adicionarContato("Esmeraldo Edson", 2222);
        agendaContatos.adicionarContato("Virginia ", 88888);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Esmeraldo"));

        System.out.println("Contato atualizado " + agendaContatos.atualizarNumeroContato("Esmeraldo", 945690));

        agendaContatos.exibirContatos();
    }
}

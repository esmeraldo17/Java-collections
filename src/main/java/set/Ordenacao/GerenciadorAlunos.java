package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //Atributos

    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }
    
    public void adicionarAluno(String nome, Long matricula, double media){
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoPorRemover = null;

        for(Aluno a : alunosSet){
            if(a.getMatricula() == matricula){
                alunoPorRemover = a;
                break;
            }
        }

        alunosSet.remove(alunoPorRemover);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        // Exibindo todos os alunos no gerenciador
        // System.out.println("Alunos no gerenciador:");
        // gerenciadorAlunos.exibirAlunos();

        // gerenciadorAlunos.removerAluno(000L);
        // gerenciadorAlunos.removerAluno(123457L);
        // System.out.println("Alunos no gerenciador:");
        // gerenciadorAlunos.exibirAlunos();

         // Exibindo alunos ordenados por nome
         System.out.println("Alunos no gerenciador ordenados por nome:");
         System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        // Exibindo alunos ordenados por nota
        System.out.println("Alunos no gerenciador ordenados por media:");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}

package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroslist;

    public CatalogoLivros() {
        this.livroslist = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroslist.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroslist.isEmpty()){
            for(Livro l : livroslist){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroslist.isEmpty()){
            for(Livro l : livroslist){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroslist.isEmpty()){
            for(Livro l : livroslist){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor2"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));

        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}

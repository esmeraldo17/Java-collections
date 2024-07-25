package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //Atributo

    private Map<String, String> palavrasMap;

    public Dicionario() {
        this.palavrasMap = new HashMap<>();
    }
    
    public void adicionarPalavra(String palavra, String definicao){
        palavrasMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!palavrasMap.isEmpty()){
            palavrasMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(palavrasMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String palavraPorPesquisar = null;
        if (!palavrasMap.isEmpty()){
            palavraPorPesquisar = palavrasMap.get(palavra);
        }
        return palavraPorPesquisar;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        // Adicionar palavras (linguagens de programação)
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");
    
        // Exibir todas as palavras
        dicionario.exibirPalavras();
    
        // Pesquisar palavras
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);
    
        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);
    
        // Remover uma palavra
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}

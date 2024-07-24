package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo

    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();

        for(Item item: carrinho){
            if(item.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(item);
            }
        }

        carrinho.removeAll(itemParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;

        for(Item item: carrinho){
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem;
        }

        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("perfume", 2500, 2);
        carrinho.adicionarItem("perfume", 3500, 4);
        carrinho.adicionarItem("leite", 1500, 2);

        carrinho.exibirItens();

        carrinho.removerItem("leite");

        carrinho.exibirItens();
        System.out.println("O valor total do carrinho e: " + carrinho.calcularValorTotal());
    }
}

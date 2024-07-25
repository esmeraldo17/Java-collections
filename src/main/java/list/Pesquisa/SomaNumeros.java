package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosInteiros;

    public SomaNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosInteiros.add(numero);
    }

    public int calcularSoma(){
        int valorSoma = 0;

        for (int numero : numerosInteiros){
            valorSoma += numero;
        }

        return valorSoma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        for (int numero : numerosInteiros){
            if(numero > maiorNumero){
                maiorNumero = numero;
            }
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        for (int numero : numerosInteiros){
            if(numero < menorNumero){
                menorNumero = numero;
            }
        }

        return menorNumero;
    }

    public void exibirNumeros(){
        System.out.println(numerosInteiros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(3);

        somaNumeros.exibirNumeros();
        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());

    }

}

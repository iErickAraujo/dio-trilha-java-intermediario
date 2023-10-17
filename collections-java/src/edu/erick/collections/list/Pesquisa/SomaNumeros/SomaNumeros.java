package edu.erick.collections.list.Pesquisa.SomaNumeros;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class SomaNumeros {
    // Cria uma matriz com números inteiros
    // private int[] numeros = { 1, 2, 3, 4, 5 };
    // Converte a matriz em uma lista
    // List<int[]> listaNumeros = Arrays.asList(numeros);
    private List<Integer> numeros = new ArrayList<>();

    public SomaNumeros() {
        this.numeros = numeros;
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (int numero : this.numeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = this.numeros.get(0);
        for (int numero : this.numeros) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = this.numeros.get(0);
        for (int numero : this.numeros) {
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros() {
        return this.numeros;
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "numeros=" + numeros +
                '}';
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        
        int soma = somaNumeros.calcularSoma();
        System.out.println("Soma dos Números: " + soma);

        int maiorNumero = somaNumeros.encontrarMaiorNumero();
        System.out.println("Maior Número: " + maiorNumero);

        int menorNumero = somaNumeros.encontrarMenorNumero();
        System.out.println("Menor Número: " + menorNumero);

        List<Integer> numeros = somaNumeros.exibirNumeros();
        System.out.println("Números na Lista: " + numeros);
    }
}

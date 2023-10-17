package edu.erick.collections.list.Ordenacao.OrdenacaoNumeros;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    // Cria uma matriz com números inteiros
    // private int[] numeros = { 1, 2, 3, 4, 5 };
    // Converte a matriz em uma lista
    // List<int[]> listaNumeros = Arrays.asList(numeros);

    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public void ordenarAscendente() {
        Collections.sort(this.numeros);
    }

    public void ordenarDescendente() {
        Collections.sort(this.numeros, Collections.reverseOrder());
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(5);

        ordenacaoNumeros.ordenarAscendente();
        System.out.println("Orderm Crescente: " + ordenacaoNumeros.numeros);

        ordenacaoNumeros.ordenarDescendente();
        System.out.println("Ordem Decrescente: " + ordenacaoNumeros.numeros);
    }
}

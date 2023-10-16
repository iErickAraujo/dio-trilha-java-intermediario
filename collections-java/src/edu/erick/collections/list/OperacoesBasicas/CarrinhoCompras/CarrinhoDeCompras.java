package edu.erick.collections.list.OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    // atributo
    private List<Item> itemsList;

    public CarrinhoDeCompras() {
        itemsList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemsList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item item : itemsList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover.add(item);
            }
        }
        itemsList.removeAll(itemParaRemover);
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (Item item : itemsList) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        System.out.println(itemsList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Item", 10, 2);
        carrinhoDeCompras.adicionarItem("Item2", 20, 1);
        carrinhoDeCompras.adicionarItem("Item3", 10, 1);
        carrinhoDeCompras.adicionarItem("Item4", 10, 5);

        // carrinhoDeCompras.removerItem("Teste");
        carrinhoDeCompras.exibirItens();
        System.out.println("\r\nO valor total do carrinho é: R$ " + carrinhoDeCompras.calcularValorTotal());
    }
}

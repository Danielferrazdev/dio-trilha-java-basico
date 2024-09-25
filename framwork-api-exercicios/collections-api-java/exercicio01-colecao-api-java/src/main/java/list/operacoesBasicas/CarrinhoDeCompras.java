package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    // atributo
    private List<Item> itemList;

    // construtor
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    // Adicionando item (com nome, preço e quantidade) ao carrinho
    public void adicionarItem(String nomeItem, double precoItem, int quantidadeItem) {
        Item item = new Item(nomeItem, precoItem, quantidadeItem);
        this.itemList.add(item);
    }

    // Removendo iten (pelo nome) do carinho
    public void removerItem(String nomeItem) {
        List<Item> itemParaRemover = new ArrayList<>();
        // Agora vai passar dentro de cada item, dentro do itemList
        for (Item i : itemList) {
            if (i.getNomeItem().equalsIgnoreCase(nomeItem)) {
                itemParaRemover.add(i);
            }
        }
        itemList.removeAll(itemParaRemover);
    }

    // Exibindo todos os itens do carrinho, mostrando nome, preço e quantidade
    public void exibirItens() {
        System.out.println(itemList);

    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        // System.out.println("");

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens do carrinho
        carrinhoDeCompras.exibirItens();
    }
}

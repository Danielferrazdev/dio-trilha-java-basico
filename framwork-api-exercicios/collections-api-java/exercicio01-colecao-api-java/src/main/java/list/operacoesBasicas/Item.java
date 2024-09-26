package main.java.list.operacoesBasicas;

public class Item {

    // Atributi
    private String nomeItem;
    private double precoItem;
    private int quantidadeItem;

    // Contrutor
    public Item(String nomeItem, double precoItem, int quantidadeItem) {
        this.nomeItem = nomeItem;
        this.precoItem = precoItem;
        this.quantidadeItem = quantidadeItem;
    }

    // criando get (listar os intens (nome, preço e quantidade))
    public String getNomeItem() {
        return nomeItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    @Override
    public String toString() {
        return "Item [nomeItem=" + nomeItem + ", precoItem=" + precoItem + ", quantidadeItem=" + quantidadeItem + "]";
    }

}

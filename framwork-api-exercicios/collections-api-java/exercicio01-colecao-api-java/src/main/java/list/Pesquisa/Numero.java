package main.java.list.Pesquisa;

public class Numero {

    // atributo
    private int numeroInteiro;

    // construtor
    public Numero(int numeroInteiro) {
        this.numeroInteiro = numeroInteiro;
    }

    public int getNumeroInteiro() {
        return numeroInteiro;
    }

    @Override
    public String toString() {
        return String.valueOf(numeroInteiro);
    }

}

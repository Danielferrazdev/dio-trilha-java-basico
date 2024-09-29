package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    // atributo
    private List<Numero> numeroList;

    // construtor
    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    // adicionado números
    public void adicionarNumero(int numero) {
        numeroList.add(new Numero(numero));
    }

    // calcular soma
    public int calcularSoma() {
        int soma = 0;
        for (Numero numero : numeroList) {
            soma += numero.getNumeroInteiro();
        }
        return soma;
    }

    // exibir todos os números da lista
    public void exibirNumeros() {
        if (!numeroList.isEmpty()) {
            System.out.println(this.numeroList);
        } else
            System.out.println("A soma de todos os numeros esta vazia ! ");
    }

    // encontrar o maior número da lista
    public int encontrarMaiorNumero() {
        int maior = numeroList.get(0).getNumeroInteiro();
        for (Numero numero : numeroList) {
            if (numero.getNumeroInteiro() > maior) {
                maior = numero.getNumeroInteiro();
            }
        }
        return maior;
    }

    // encontrar a menor núemro da lista
    public int encontrarMenorNumero() {
        int menor = numeroList.get(0).getNumeroInteiro();
        for (Numero numero : numeroList) {
            if (numero.getNumeroInteiro() < menor) {
                menor = numero.getNumeroInteiro();
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        // adicionaod número na lista
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(-1);

        // retornando a soma de todos os números da lista
        System.out.println("A soma de todos os numeros ficou em ...: " + somaNumeros.calcularSoma());
        // retornando com a lista de todos os números
        System.out.println("Os numeros adicionados foram ...: ");
        somaNumeros.exibirNumeros();
        // retornando o maior número da lista
        System.out.println("O maior número da lista foi ...: " + somaNumeros.encontrarMaiorNumero());
        // retornando o menor número da lista
        System.out.println("O menor número da lista foi ...: " + somaNumeros.encontrarMenorNumero());
    }

}

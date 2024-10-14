package main.java.list.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {

    // atributo
    private List<Livro> livroList;

    // construtor
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    // adicionado livros
    public void adicionarLivros(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    // pesquisar por autor
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) { // Se a lista estiver vazia, a operação não continua
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    // pesquisar por intervalo de ano
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFInal) {
        List<Livro> livrosPoranoPublicacao = new ArrayList<>();
        if (!livroList.isEmpty()) { // Se a lista estiver vazia, a operação não continua
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFInal) { // && - é igual "e também"
                    livrosPoranoPublicacao.add(l);
                }
            }
        }
        return livrosPoranoPublicacao;
    }

    // pesuisar por titulo, sendo que é pra mostrar só o primeiro livro encontrado,
    // se caso tiver mais de um com o mesmo título
    public Livro pesquisarPortitulo(String titulo) {
        Livro livrosPorTitulo = null;
        if (!livroList.isEmpty()) { // Se a lista estiver vazia, a operação não continua
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo = l;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }

    // Testando com os parametros
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivros("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivros("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivros("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivros("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivros("Livro 4", "Autor 4", 1994);

        // exibir os livros do catalogo por autor
        System.out.println("Pesquisando livro por autor...: " + catalogoLivros.pesquisarPorAutor("Autor 4"));
        // exibir os livros do catalogo por intervalo de ano
        System.out.println(
                "Pesquisando livro por intervalode de ano...: " + catalogoLivros.pesquisarPorIntervaloAnos(2023, 2024));
        // exibir os livros do catalogo por titulo
        System.out.println("Pesquisando livro por título...: " + catalogoLivros.pesquisarPortitulo("Livro 1"));
    }

}

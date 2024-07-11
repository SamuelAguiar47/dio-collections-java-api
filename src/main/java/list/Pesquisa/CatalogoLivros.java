package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros  = new ArrayList<>();
    }

    public void adicionarLivro(String titulo) {
        this.listaLivros.add(new Livro(titulo));
    }

    public void adicionarLivro(String titulo, String autor) {
        this.listaLivros.add(new Livro(titulo, autor));
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> pesquisaPorAutor = new ArrayList<>();
        if(!listaLivros.isEmpty()) {
            for(Livro l : listaLivros) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    pesquisaPorAutor.add(l);
                }
            }
        }
        return pesquisaPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoIncial, int anoFinal) {
        List<Livro> pesquisaPorIntervaloAnos = new ArrayList<>();
        if(!listaLivros.isEmpty()) {
            for(Livro l : listaLivros) {
                if (l.getAnoPublicacao() >= anoIncial && l.getAnoPublicacao() <= anoFinal) {
                    pesquisaPorIntervaloAnos.add(l);
                }
            }
        }
        return pesquisaPorIntervaloAnos;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!listaLivros.isEmpty()) {
            for(Livro l : listaLivros) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                }
            }
        }
        return livroPorTitulo;
    }

}
package main.java.list.Pesquisa;

public class Livro {
    //Atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String titulo2;
    private String autor2;
    private int anoPublicacao2;

    //Getters e Setters
    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro(String titulo, String autor, int anoPublicacao) {
        titulo2 = titulo;
        this.titulo = titulo;
        autor2 = autor;
        this.autor = autor;
        anoPublicacao2 = anoPublicacao;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + "] \n";
    }

    

    
}

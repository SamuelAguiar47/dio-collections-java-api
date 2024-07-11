package main.java.set.OperacoesBasicas;

public class Convidado {
    //Atributos
    private String nome;
    private int codigoConvite;
    
    //Construtor
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public int getCodigoConvite() {
        return codigoConvite;
    }

    //Metodos
    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]\n";
    }
}

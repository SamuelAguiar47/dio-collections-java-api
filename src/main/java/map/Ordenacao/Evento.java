package main.java.map.Ordenacao;

public class Evento {
    //Atributos
    private String nome;
    private String atracao;
    
    //Construtor
    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }
    
    //Getters
    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }
    
    //Métodos de sobrecarga
    @Override
    public String toString() {
        return "Evento [nome=" + nome + ", atracao=" + atracao + "]\n";
    }
}

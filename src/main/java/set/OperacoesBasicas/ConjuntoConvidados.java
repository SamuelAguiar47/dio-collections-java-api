package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> conjuntoConvidados;

    public ConjuntoConvidados() {
        conjuntoConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        conjuntoConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoDeConvite(int codigoConvite) {
        if(!conjuntoConvidados.isEmpty()) {
            for (Convidado c : conjuntoConvidados) {
                if (c.getCodigoConvite() == codigoConvite) {
                    conjuntoConvidados.remove(c);
                    break;
                }
            }
        }
    }

    public int contarConvidados() {
        return conjuntoConvidados.size();
    }

    public Set<Convidado> exibirConvidados() {
        return this.conjuntoConvidados;
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println(conjuntoConvidados.exibirConvidados());
        conjuntoConvidados.adicionarConvidado("João", 1);
        conjuntoConvidados.adicionarConvidado("Lucas", 2);
        conjuntoConvidados.adicionarConvidado("Beatriz", 3);
        conjuntoConvidados.adicionarConvidado("Talia", 4);
        conjuntoConvidados.adicionarConvidado("Izabel", 4);
        conjuntoConvidados.adicionarConvidado("Sofia", 6);
        System.out.println(conjuntoConvidados.exibirConvidados());
        System.out.println(conjuntoConvidados.contarConvidados());
        conjuntoConvidados.removerConvidadoPorCodigoDeConvite(3);
        System.out.println(conjuntoConvidados.exibirConvidados());

    }
}

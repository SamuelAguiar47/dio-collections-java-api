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

    
}

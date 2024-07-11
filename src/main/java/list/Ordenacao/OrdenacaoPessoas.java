package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoasList;
    
    public OrdenacaoPessoas() {
        this.pessoasList = new ArrayList<>();
    }

    public List<Pessoa> getPessoasList() {
        return pessoasList;
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("João", 14, 1.62);
        ordenacaoPessoas.adicionarPessoa("Leticia", 25, 1.68);
        ordenacaoPessoas.adicionarPessoa("Miguel", 8, 1.74);
        ordenacaoPessoas.adicionarPessoa("Flávia", 49, 1.64);
        ordenacaoPessoas.adicionarPessoa("Gustavo", 37, 1.82);

        System.out.println(ordenacaoPessoas.getPessoasList());
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }

}

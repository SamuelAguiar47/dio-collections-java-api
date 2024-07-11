package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //Atributos
    private Map<Long, Produto> estoqueProdutoMap;
    
    //Construtor
    public EstoqueProdutos() {
        estoqueProdutoMap = new HashMap<>();
    }

    //Métodos
    public void adicionarProduto(Long cod, String nome, int quantidade, double preco) {
        this.estoqueProdutoMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(this.estoqueProdutoMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if(!estoqueProdutoMap.isEmpty()) {
            for(Produto p : estoqueProdutoMap.values()) {
                valorTotalEstoque += p.getQuantidade()*p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = new Produto(null, 0, 0);
        if(!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getPreco() > produtoMaisCaro.getPreco()) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }
}

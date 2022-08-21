package br.com.lojinha.pojo;
//Exercício realizado durante a aula prática
public class ItemIncluso {
    //Atributos
    private int quantidade;
    private String nomeDoItem;

    //Construtor
    public ItemIncluso(int quantidadeInicial, String nomeDoItemInicial) {
        this.quantidade = quantidadeInicial;
        this.nomeDoItem = nomeDoItemInicial;
    }

    //Métodos Getters e Setters
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int novaQuantidade) {
        this.quantidade = novaQuantidade;
    }

    public String getNomeDoItem() {
        return nomeDoItem;
    }

    public void setNomeDoItem(String novoNomeDoItem) {
        this.nomeDoItem = novoNomeDoItem;
    }
}

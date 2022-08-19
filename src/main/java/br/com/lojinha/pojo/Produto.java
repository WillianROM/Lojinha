package br.com.lojinha.pojo;

public class Produto {
    //Atributos
    private String nome;
    private String marca;
    private double valor;
    private String tamanho;
    private String itensInclusos;

    //Métodos Getters e Setters
    public double getValor() {//Motificador, tipo de retorno, nome do método (paramentos)
        return  this.valor;
    }

    public void setValor(double novoValor){//Motificador, tipo de retorno é void porque não há retorno,nome do método (paramentos)
        this.valor = novoValor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String novoTamanho) {
        this.tamanho = novoTamanho;
    }


    public String getItensInclusos() {
        return itensInclusos;
    }

    public void setItensInclusos(String novosItensInclusos) {
        this.itensInclusos = novosItensInclusos;
    }
}

package br.com.lojinha.pojo;
/*-----------------------------AULA SOBRE HERANÇA-----------------------------*/
//Herança te ajuda a criar classes que possuem as mesmas características de outras classes, economizando muitas linhas de código.

import br.com.lojinha.enums.Tamanho;

public class ProdutoInternacional extends Produto {


    //Atributos
    private  double taxaDeImportacao;

    //Para herdar as propriedades da classe Produto que tem Construtor, também é necessário criar um construtor conforme abaixo:
    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    //Métodos Getters e Setters
    public double getTaxaDeImportacao() {
        return taxaDeImportacao;
    }

    public void setTaxaDeImportacao(double taxaDeImportacao) {
        this.taxaDeImportacao = taxaDeImportacao;
    }


}

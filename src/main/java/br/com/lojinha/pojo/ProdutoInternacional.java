package br.com.lojinha.pojo;
/*-----------------------------AULA SOBRE HERANÇA-----------------------------*/
//Herança te ajuda a criar classes que possuem as mesmas características de outras classes, economizando muitas linhas de código.

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {


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

    /*-----------------------------AULA SOBRE POLIMORFISMO-----------------------------*/
    //Um conceito muito relacionado a Herança é o Polimorfismo, que permite que você utilize os mesmos métodos, mas atribua a eles comportamentos distintos.

    @Override
    public void setValor(double novoValor) {
        if(novoValor > -100) {
        /*Na aula o Julio usou "this.valor = novoValo;", porém eu preferi super.valor = novoValor;*/
            super.valor = novoValor;
        }else{
            throw new IllegalArgumentException("Valores devem ser maiores que -100");
        }

    }

    /*-----------------------------AULA SOBRE INTERFACES-----------------------------*/
//Interfaces servem para que você crie contratos, ou seja, obrigações a serem seguidas por qualquer classe que assinar aquele contrato.
    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + " e " + this.getValor();
    }
}

package br.com.lojinha.pojo;
/*-----------------------------AULA SOBRE HERANÇA-----------------------------*/
//Herança te ajuda a criar classes que possuem as mesmas características de outras classes, economizando muitas linhas de código.

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito; //Aula sobre Interfaces, em que na classe utilizar "implements"

public class ProdutoNacional extends Produto implements Favorito {
    //Atributos
    private  double impostoNacional;

    //Para herdar as propriedades da classe Produto que tem Construtor, também é necessário criar um construtor conforme abaixo:
    public ProdutoNacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial); // super que dizer que os dados vão para a classe mãe
    }

    //Métodos Getters e Setters
    public double getImpostoNacional() {
        return impostoNacional;
    }

    public void setImpostoNacional(double novoImpostoNacional) {
        this.impostoNacional = novoImpostoNacional;
    }


    /*-----------------------------AULA SOBRE INTERFACES-----------------------------*/
//Interfaces servem para que você crie contratos, ou seja, obrigações a serem seguidas por qualquer classe que assinar aquele contrato.
    public String getDadosFavoritos(){
        return this.getNome() + ", " + this.getMarca() + " e " + this.getValor();
    }
}

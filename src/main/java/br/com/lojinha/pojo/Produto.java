package br.com.lojinha.pojo;
import java.util.List; //Para listas no Java, tem que fazer essa importação

public class Produto {
    //Atributos
    private String nome;
    private String marca;
    private double valor;
    private String tamanho;
    private List<String> itensInclusos; //Para fazer lista coloque modificador List<tipo do atributos>

    //Métodos Getters e Setters
    public double getValor() {//Motificador, tipo de retorno, nome do método (paramentos)
        return  this.valor;
    }

    public void setValor(double novoValor){//Motificador, tipo de retorno é void porque não há retorno,nome do método (paramentos)
        /*-----------------------------AULA SOBRE CONDICIONAIS----------------------------*/
        if(novoValor > 0) {
            this.valor = novoValor;
        }else{
            //'throw new' é usado para lançar uma nova exceção
            throw new IllegalArgumentException("Valores devem ser maiores que 0");
        }
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


    public List<String> getItensInclusos() { //Para listas também é necessário atualizar o Get para List<tipo de retorno>
        return itensInclusos;
    }

    public void setItensInclusos(List<String> novosItensInclusos) {//Para listas também é necessário atualizar o parâmetro deo Set para List<tipo do parâmetro>
        this.itensInclusos = novosItensInclusos;
    }
}

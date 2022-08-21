package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
//Como Produto.java e ItensAdicionais.java estão no mesmo pacote, automaticamente já são "importadas" entre si, sem precisar aparecer aqui

import java.util.List; //Para listas no Java, tem que fazer essa importação

public class Produto {
    /*Classes servem para definir qual é o aspecto e ações de um objeto.
     Classes podem ser comparados a receitas de um bolo, planta de uma casa, molde de um biscoito em forma de estrela, etc*/

    //Atributos
    /*Atributos servem para definir qual é os aspectos de seus objetos, em JAVA são variáveis específicas de uma classe e servem para descrever as propriedades de um objeto*/
    private String nome;
    private String marca;
    protected double valor; //Durante a aula de Polimorfismo foi alterado o modificador de private para protected
    //private String tamanho; - Como era antes de criar o arquivo Tamanho.java com o tipo Enums
    private Tamanho tamanho; //Novo tipo com base no arquivo Tamanho.java que é uma lista imutável
   //private List<String> itensInclusos; //Antes do Exercício prático
    private List<ItemIncluso> itensInclusos; //Para fazer lista coloque modificador List<tipo do atributos>

    //Construtor
    /*-----------------------------AULA SOBRE CONSTRUTORES----------------------------*/
    /*Construtores servem para dar informações a um objeto durante a instanciação
    * Se colocar paramentros, no momento da instanciação do objeto, é obrigatório informar os dados que foram requisitados pelo Construtor*/
    public Produto(String marcaInicial, Tamanho tamanhoInicial){
        //Definir comando que serão iniciados durante a instanciação
        this.setMarca(marcaInicial); //Na aula o Julio de Lima usou this.marca = "Sony"; ,porém eu preferi aproveitar o método setMarca
        this.setTamanho(tamanhoInicial);
    }


    //Métodos Getters e Setters
    public double getValor() {//Motificador, tipo de retorno, nome do método (paramentos)
        return  this.valor;
    }

    public void setValor(double novoValor){//Motificador, tipo de retorno é void porque não há retorno,nome do método (paramentos)
        /*-----------------------------AULA SOBRE CONDICIONAIS----------------------------*/
        /*Condicionais nos ajudam a tomar decisões com base em comparações.*/
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

    public Tamanho getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(Tamanho novoTamanho) {
    //public void setTamanho(String novoTamanho) { //Como era antes de ser criado Tamanho.java de lista imutável
        /*-----------------------------AULA SOBRE ENUMS-----------------------------*/
        /*Enums servem para definir uma lista imutável e predeterminada de valores que são geralmente utilizados para atribuição e comparação.
         *
         * O tamanho do Produto, por exemplo, possui apenas 3 variações:
         * - Pequeno | - Médio | - Grande*/

        /* No caso de lista imutável, até daria para fazer condicional conforme abaixo, porém não é a melhor forma de fazer:
        if (novoTamanho.equalsIgnoreCase("Pequeno") || novoTamanho.equalsIgnoreCase("Medio") || novoTamanho.equalsIgnoreCase("Grande")){
            this.tamanho = novoTamanho;
        } else {
            throw new IllegalArgumentException("Tamanho pode ser Pequeno, Medio ou Grande");
        }
        */

        /*A melhor forma é utilizar enumeradores, foi criado o pacote enums e dentro arquivo Tamanho.java em que a classe é tipo "enum":
        package br.com.lojinha.enums;

            public enum Tamanho {
                PEQUENO, MEDIO, GRANDE;
            }
        */

        this.tamanho = novoTamanho;

    }


    public List<ItemIncluso> getItensInclusos() { //Para listas também é necessário atualizar o Get para List<tipo de retorno>
        return itensInclusos;
    }

    public void setItensInclusos(List<ItemIncluso> novosItensInclusos) {//Para listas também é necessário atualizar o parâmetro deo Set para List<tipo do parâmetro>
        this.itensInclusos = novosItensInclusos;
    }
}

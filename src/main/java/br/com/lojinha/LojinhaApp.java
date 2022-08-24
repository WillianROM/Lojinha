package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.*;

public class LojinhaApp {
    public static void main(String[] args) { //Método principal é criado depois de digitar psvm
        /*-----------------------------AULA SOBRE VARIÁVEIS-----------------------------*/
        /*Variáveis são espaços em memória, que podem possuir valores. Pense nisso como caixas, nas quais você pode colocar algo dentro e remover sempre que quiser*/
        /*
        String joias = "100gr de Ouro 50k";
        int minhaIdade = 18;
        double meuSalario = 2022.51;
        boolean minhaResposta = true;

        System.out.println(minhaIdade);
         */

        /*-----------------------------AULA SOBRE ENCAPSULAMENTO----------------------------*/
        /*Encapsulamento é uma forma de proteção de atributos. Com isso, é possível limitar como será manipulado a classe
        * É feito isso através da alteração do Modificador do atributos para que sejam privados e da criação de Métodos (Getters e Setters) que atribuem e capturam o valor atual do atributo.
        * Sendo Private para uso somente dentro da classe, Protected para uso da própria classe e classes hedeiras*/

        Produto meuProduto = new Produto("Bic", Tamanho.PEQUENO); //CONSTRUTOR com parametro Marca
        ItemIncluso tampa = new ItemIncluso(1,"tampa");
        ItemIncluso caneteiro = new ItemIncluso(1,"caneteiro");

        System.out.println(meuProduto.getTamanho());

        meuProduto.setNome("Caneta");
        meuProduto.setValor(1.50); //Se deixar valor zero vai dá erro de exceção conforme programado na classe Produto
        //meuProduto.setMarca("Bic"); - Como era antes da aula sobre CONSTRUTOR
        meuProduto.setTamanho(Tamanho.MEDIO); //Novo tipo com base no arquivo Tamanho.java que é uma lista imutável

        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getMarca());

    /*-----------------------------AULA SOBRE LISTAS-----------------------------*/
        /*Listas são um tupo muito interessante de objeto, elas permitem abrigarmos um conjunto de elementos(valores ou objetos) dentro de um único objeto, algo muito utilizado em qualquer tipo de aplicação*/
        //Para listas tem que criar uma váriavel do tipo List<tipo da lista>, assim coloque o nome da variável instanciando new ArrayList():
        List<ItemIncluso> itensInclusos = new ArrayList<>(); //Lista de String vazio

        //Assim comece a adicionar itens na lista:
        itensInclusos.add(tampa); //Item 0 (Base ZERO)
        itensInclusos.add(caneteiro); //Item 1 (Base ZERO)

        //Coloque a variável tipo de Lista dentro do respectivo set:
        meuProduto.setItensInclusos(itensInclusos);




        //Utilize o método size para contar a quantidade de itens da Lista:
        System.out.println(meuProduto.getItensInclusos().size());

        //Utilize o método get para mostrar um elemento específico da lista conforme posição, considerando Base ZERO
        System.out.println(meuProduto.getItensInclusos().get(1));
        System.out.println(meuProduto.getItensInclusos().get(0));

        /*-----------------------------AULA SOBRE LAÇOS-----------------------------*/
        //Laços podem nos ajudar a interagir com listas de valores ou objetos.

        //Laço que fiz antes da aula sobre Laços:
        for (ItemIncluso item: itensInclusos){
            System.out.printf("[Nome do Item: %s | Quantidade: %d]\n", item.getNomeDoItem(), item.getQuantidade());
        }

        //Laço criado durante a aula
        /*System.out.println(meuProduto.getItensInclusos().get(0).getNomeDoItem());
        System.out.println(meuProduto.getItensInclusos().get(0).getQuantidade());*/

        for (ItemIncluso itemAtual: meuProduto.getItensInclusos()){
            System.out.println(itemAtual.getNomeDoItem());
            System.out.println(itemAtual.getQuantidade());
        }

        /*-----------------------------AULA SOBRE HERANÇA-----------------------------*/
        //Produto Nacional:
        System.out.println("=====PRODUTO NACIONAL====");
        ProdutoNacional computador = new ProdutoNacional("Positivo", Tamanho.GRANDE);

        //Atributo que a classe ProdutoNacional herdou da classe Produto:
        System.out.println(computador.getMarca());

        //Atributo próprio da classe Produto Nacional:
        computador.setImpostoNacional(0.55845);

        System.out.println(computador.getImpostoNacional());

        //Produto Internacional
        System.out.println("=====PRODUTO INTERNACIONAL====");
        ProdutoInternacional celular = new ProdutoInternacional("Sansung", Tamanho.MEDIO);

        //Atributo que a classe ProdutoInternacional herdou da classe Produto:
        List<ItemIncluso> itensInclusosNoCelular = new ArrayList<>();
        ItemIncluso carregador = new ItemIncluso(1, "carregador");
        ItemIncluso caboUSB = new ItemIncluso(1,"Cabo USB");
        itensInclusosNoCelular.add(carregador);
        itensInclusosNoCelular.add(caboUSB);

        for (ItemIncluso item:itensInclusosNoCelular){
            System.out.printf("[Nome do item: %s | Quantidade: %d]\n", item.getNomeDoItem(), item.getQuantidade());
        }

        //Atributo próprio da classe Produto Internacional:
        celular.setTaxaDeImportacao(1.50);
        System.out.println(celular.getTaxaDeImportacao());

        /*-----------------------------AULA SOBRE POLIMORFISMO-----------------------------*/
        celular.setValor(-99);
        System.out.println(celular.getValor());

        /*-----------------------------AULA SOBRE INTERFACES-----------------------------*/
        //Interfaces servem para que você crie contratos, ou seja, obrigações a serem seguidas por qualquer classe que assinar aquele contrato.
    }
}

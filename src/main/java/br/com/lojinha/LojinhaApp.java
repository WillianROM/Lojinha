package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;//Para listas no Java, tem que fazer essa importação

public class LojinhaApp {
    public static void main(String[] args) { //Método principal é criado depois de digitar psvm
        /*-----------------------------AULA SOBRE VARIÁVEIS-----------------------------*/
        /*
        String joias = "100gr de Ouro 50k";
        int minhaIdade = 18;
        double meuSalario = 2022.51;
        boolean minhaResposta = true;

        System.out.println(minhaIdade);
         */

        /*-----------------------------AULA SOBRE ENCAPSULAMENTO----------------------------*/
        Produto meuProduto = new Produto();

        meuProduto.setNome("Caaneta");
        meuProduto.setValor(1.50); //Se deixar valor zero vai dá erro de exceção conforme programado na classe Produto
        meuProduto.setMarca("Bic");
        meuProduto.setTamanho("Medio");

        System.out.println(meuProduto.getValor());

    /*-----------------------------AULA SOBRE LISTAS-----------------------------*/
        //Para listas tem que criar uma váriavel do tipo List<tipo da lista>, assim coloque o nome da variável instanciando new ArrayList():
        List<String> itensInclusos = new ArrayList<>(); //Lista de String vazio

        //Assim comece a adicionar itens na lista:
        itensInclusos.add("tampa"); //Item 0 (Base ZERO)
        itensInclusos.add("caneteiro"); //Item 1 (Base ZERO)

        //Coloque a variável tipo de Lista dentro do respectivo set:
        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getItensInclusos());

        //Utilize o método size para contar a quantidade de itens da Lista:
        System.out.println(meuProduto.getItensInclusos().size());

        //Utilize o método get para mostrar um elemento específico da lista conforme posição, considerando Base ZERO
        System.out.println(meuProduto.getItensInclusos().get(1));
        System.out.println(meuProduto.getItensInclusos().get(0));

    }
}

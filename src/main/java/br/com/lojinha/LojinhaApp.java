package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

public class LojinhaApp {
    public static void main(String[] args) { //Método principal é criado depois de digitar psvm
        /* Aula de Variáveis
        String joias = "100gr de Ouro 50k";
        int minhaIdade = 18;
        double meuSalario = 2022.51;
        boolean minhaResposta = true;

        System.out.println(minhaIdade);
         */

        Produto meuProduto = new Produto();

        meuProduto.nome = "Caneta";
        meuProduto.valor = 1.25;
        meuProduto.marca = "Bic";
        meuProduto.tamanho = "Medio";
        meuProduto.itensInclusos = "tampa";

        System.out.println(meuProduto.nome);


    }
}

package br.com.lojinha.interfaces;

/*-----------------------------AULA SOBRE INTERFACES-----------------------------*/
//Interfaces servem para que você crie contratos, ou seja, obrigações a serem seguidas por qualquer classe que assinar aquele contrato.
public interface Favorito {
    //Você quer padronizar o código, então você cria interface para ter uma forma de pegar os dados.
    String getDadosFavoritos();
}

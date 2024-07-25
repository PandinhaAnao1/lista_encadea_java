package org.example;
/*
* Classe de elementos da lista encadeada
* Os valores que ela recebe são: valor e proximo
* valor; numero inteiro que representa o valor do elemento
* proximo: um objeto do tipo da class que representa o proximo valor da lista
* */
public class Elemento<T> {

    T valor;
    Elemento<T> proximo;

    public  Elemento(T valor,Elemento<T> proximo){
        this.valor = valor;
        this.proximo = proximo;

    }
    @Override
    public  String toString(){
        //Funçaõ que formata a saida para print
        return valor + "-----> " + proximo;
    }

}

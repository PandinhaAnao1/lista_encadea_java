package org.example;

import java.util.concurrent.ExecutionException;
/*
 * Classe da lista encadeada
 * Os valores que ela recebe são: tamanho e inicio
 * tamanho; qual o tamanho da lista ex 5
 * inicio: um objeto do tipo da Elemento que representa o primeiro valor
 * inserirInicio(): item que insere elemento no começo da lista(Pilha)
 * obter(): retornar o valor de um elemento apartir de uma posição
 * */
public class ListaEncadeada<T> {
    int tamanho;
    Elemento<T> inicio;

    public  ListaEncadeada(int tamanho,Elemento<T> inicio){
        this.tamanho = tamanho;
        this.inicio = inicio;
    }

    public void inserirInicio(T valor){
         inicio = new Elemento<>(valor, this.inicio);
         tamanho++;
    }
    public T obter(int posicao){
        Elemento<T> atual = inicio;

        for(int i = 0; i <posicao; i++){
            atual = atual.proximo;
        }
        return atual.valor;
    }


}

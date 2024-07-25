package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            ListaEncadeada<Integer> lista = new ListaEncadeada<>(0,null);
            lista.inserirInicio(1);
            lista.inserirInicio(2);
            lista.inserirInicio(3);
            lista.inserirInicio(4);
            ListaEncadeada<String> lista_string = new ListaEncadeada<>(0,null);
        lista_string.inserirInicio("ola");
        lista_string.inserirInicio("Mundo");
        lista_string.inserirInicio("Generico");
        lista_string.inserirInicio("!!!!!!");

            System.out.println(lista.inicio);
        System.out.println("Posição 1:"+ lista.obter(1));
        System.out.println(lista_string.inicio);
        System.out.println("Posição 1:"+ lista_string.obter(1));
    }


}
package org.example;
import Threads.ThreadNumero;
import Threads.ThreadLetra;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Object> lista = new ArrayList<Object>();
        lista.add("A");
        lista.add(1);
        lista.add("B");
        lista.add(2);
        lista.add("C");
        lista.add(3);

        /*if ( lista.get(0) instanceof String ){
            System.out.println(lista.get(0));
        }*/

        ThreadLetra threadLetter = new ThreadLetra(lista);
        ThreadNumero threadNumber = new ThreadNumero(lista);

        threadLetter.start();
        threadNumber.start();

    }
}
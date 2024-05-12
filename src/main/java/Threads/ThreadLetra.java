package Threads;
import java.util.ArrayList;

public class ThreadLetra extends Thread {

    public ThreadLetra(ArrayList<Object> lista) {
        super( () -> {
            System.out.println("ola");
            lista.removeIf(e -> e instanceof String);
        } );
    }

}


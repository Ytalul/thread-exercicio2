package Threads;
import java.util.ArrayList;

public class ThreadLetra extends Thread {

    public ThreadLetra(ArrayList<Object> lista) {
        super( () -> {
            lista.removeIf(e -> e instanceof String);
        } );
    }

}


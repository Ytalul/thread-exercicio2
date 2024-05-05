package Threads;
import java.util.ArrayList;

public class ThreadNumero extends Thread {

    public ThreadNumero(ArrayList<Object> lista) {
        super( ()-> {
            lista.removeIf(e -> e instanceof java.lang.Integer);
        } );
    }
}

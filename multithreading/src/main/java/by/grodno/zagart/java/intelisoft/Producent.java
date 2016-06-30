package by.grodno.zagart.java.intelisoft;

import java.util.Random;

/**
 * Created by intelisoft on 29.06.2016.
 */
public class Producent implements Runnable {

    private Store store;

    public Producent(Store store) {
        this.store = store;
    }

    public void run() {
        Random rnd = new Random();
        while (true) {
            store.add(rnd.nextInt());
        }
    }
}

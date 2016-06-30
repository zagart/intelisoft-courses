package by.grodno.zagart.java.intelisoft;

/**
 * Main class with entry point.
 */
public class Main {

    public static void main(String[] args ) throws InterruptedException {

        Store store = new Store();
        Runnable c1 = new Consumer(store);
        Runnable c2 = new Consumer(store);
        Runnable p1 = new Producent(store);
        Runnable p2 = new Producent(store);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(p1);
        Thread t4 = new Thread(p2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}

package by.grodno.zagart.java.intelisoft;

/**
 * Created by intelisoft on 29.06.2016.
 */
public class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + i);
        }
    }

}

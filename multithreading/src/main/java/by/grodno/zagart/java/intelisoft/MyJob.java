package by.grodno.zagart.java.intelisoft;

import static java.lang.Thread.sleep;

/**
 * Created by intelisoft on 29.06.2016.
 */
public class MyJob implements Runnable {

    private Printer printer;

    public MyJob(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        System.out.println("on run");
        printer.print();
        System.out.println("off run");
    }
}

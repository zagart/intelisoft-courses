package by.grodno.zagart.java.intelisoft.homework3;

/**
 * Created by Zagart on 23.05.2016.
 */
public class PersonalComputer {

    private Monitor monitor = new Monitor();
    private CPU cpu = new CPU();
    private HDD hdd = new HDD();

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public CPU getCpu() {

        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Monitor getMonitor() {

        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

}

package by.grodno.zagart.java.intelisoft.homework3;

/**
 * Created by Zagart on 23.05.2016.
 */
public class Monitor {

    private String resolution = "";
    private String producer = "";
    private int width = 0;
    private int height = 0;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {

        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getProducer() {

        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getResolution() {

        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}

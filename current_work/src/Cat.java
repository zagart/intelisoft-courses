import java.util.Date;
import java.util.Random;

/**
 * Created by USER on 18.05.2016.
 */
public class Cat {

    private String name;
    private int age;
    private String color;
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat (String name, String color, String breed) {
        Random rnd = new Random();
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = 1 + rnd.nextInt(20);
    }

    @Override
    public String toString() {
        return "Cat added{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

}

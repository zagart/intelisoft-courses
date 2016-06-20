package by.grodno.zagart.java.intelisoft;

/**
 * Created by intelisoft on 20.06.2016.
 */
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Имя = " + firstName + ", фамилия = " + lastName + ".";
    }

}

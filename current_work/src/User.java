import java.util.Date;

/**
 * Created by USER on 18.05.2016.
 */
public class User implements ComparableUser {

    private String login = "";
    private String password = "";
    private String email = "";

    private String firstName = "";
    private String lastName = "";
    private String gender = "";
    private int age = 0;

    public User(String login, int age) {
        this.login = login;
        this.age = age;
    }

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", age=" + age +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public User(String login, String password, String email, String firstName, String lastName) {
        this.login = login;
        this.password = password;

        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String login, String password, String email, String firstName, String lastName, String gender) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public int compare(User user1, User user2) {

        return 0;
    }

}

import java.util.Arrays;

/**
 * Created by intelisoft on 06.06.2016.
 */
public class Main {

    public static void main(String...args) {
        User[] users = new User[3];
        users[0] = new User("Nik", 30);
        users[1] = new User("Den", 20);
        users[2] = new User("Art", 10);

        CompareUserByAge comparator = new CompareUserByAge();
        CompareUserByName comparator1 = new CompareUserByName();

        //sort(users, (a, b) -> a.getLogin().compareToIgnoreCase(b.getLogin()));
        printUsers(users, (user) -> System.out.printf("%s is %d years old. %n", user.getLogin(), user.getAge()));

       // System.out.println(Arrays.asList(users));

    }

    private static void sort (User[] users, ComparableUser comparator) {

        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length - 1; j++) {
                User a = users[j];
                User b = users[j + 1];
                if (comparator.compare(a, b) > 0) {
                    users[j] = b;
                    users[j + 1] = a;
                }
            }
        }

    }

    private static void printUsers(User[] users, Printer printer) {
        for (User user : users) {
            printer.print(user);
        }
    }

}

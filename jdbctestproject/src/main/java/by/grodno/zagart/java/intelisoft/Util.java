package by.grodno.zagart.java.intelisoft;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by intelisoft on 20.06.2016.
 */
public class Util {

    public static void printUser(User user) {
        System.out.println("id = " + user.getId() + ", имя = " + user.getFirstName() + ", фамилия = " + user.getLastName() + ".");
    }

    public static Collection<User> execute(PreparedStatement statement, int min, int max) throws SQLException {
        ResultSet rs = statement.executeQuery();
        Collection<User> list = new ArrayList<User>();
        while (rs.next()) {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setFirstName(rs.getString("first_name"));
            user.setLastName(rs.getString("last_name"));
            user.setAge(rs.getInt("age"));
            printUser(user);
            list.add(user);
        }
        return list;
    }

}

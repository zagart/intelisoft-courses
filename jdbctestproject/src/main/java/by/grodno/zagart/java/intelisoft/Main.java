package by.grodno.zagart.java.intelisoft;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.sql.*;
import java.util.*;

import static by.grodno.zagart.java.intelisoft.Util.*;

/**
 * Hello world!
 *
 */
public class Main
{

    final private static String URL = "jdbc:mysql://localhost:3306/users";

    final private static String CREATE_USER_TABLE = "CREATE TABLE `users`.`user` (\n" +
            "  `id` INT(11) NOT NULL AUTO_INCREMENT,\n" +
            "  `first_name` VARCHAR(45) NOT NULL,\n" +
            "  `last_name` VARCHAR(45) NOT NULL,\n" +
            "  `age` INT(3) NOT NULL,\n" +
            "  PRIMARY KEY (`id`),\n" +
            "  UNIQUE INDEX `id_UNIQUE` (`id` ASC));";

    final private static String INSERT = "INSERT INTO `users`.`user` (`first_name`, `last_name`, `age`) VALUES ('%s', '%s', '%d');";
    final private static String SELECT = "SELECT id,first_name,last_name,age FROM `users`.`user` WHERE id > ? AND id < ?;";

    public static void main( String[] args ) throws SQLException {
        Driver driver = new com.mysql.jdbc.Driver();
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "root");
        Connection connection = driver.connect(URL, properties);
        Statement statement = connection.createStatement();
        statement.execute("DROP TABLE `users`.`user`;");
        statement.execute(CREATE_USER_TABLE);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            statement.execute(String.format(INSERT, RandomStringUtils.randomAlphabetic(10), RandomStringUtils.randomAlphabetic(10), random.nextInt(50)));
        }
        int min = 2;
        int max = 7;
        ResultSet rs; // = statement.executeQuery(String.format(SELECT, min, max));
        PreparedStatement prepStat = connection.prepareStatement(SELECT);
        prepStat.setInt(1, min);
        prepStat.setInt(2, max);
        rs = prepStat.executeQuery();
        Collection<User> list = execute(prepStat, min, max);
        statement.close();
        connection.close();
    }
}

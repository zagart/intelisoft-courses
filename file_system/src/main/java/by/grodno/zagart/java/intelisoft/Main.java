package by.grodno.zagart.java.intelisoft;

import by.grodno.zagart.java.intelisoft.Entities.Directory;
import by.grodno.zagart.java.intelisoft.Entities.File;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Main class with entry point.
 */
public class Main {
    private static SessionFactory factory;
    final private static String CREATE_TABLE_DIRECTORIES = "CREATE TABLE `file_system`.`directories` (\n" +
            "  `id` INT(11) NOT NULL AUTO_INCREMENT,\n" +
            "  `name` VARCHAR(45) NOT NULL,\n" +
            "  `parent` VARCHAR(45) NULL,\n" +
            "  PRIMARY KEY (`id`),\n" +
            "  UNIQUE INDEX `id_UNIQUE` (`id` ASC));";
    final private static String CREATE_TABLE_FILES = "CREATE TABLE `file_system`.`files` (\n" +
            "  `id` INT(11) NOT NULL AUTO_INCREMENT,\n" +
            "  `name` VARCHAR(45) NOT NULL,\n" +
            "  `size` INT(40) NOT NULL,\n" +
            "  `directory_id` INT(11) NOT NULL,\n" +
            "  PRIMARY KEY (`id`),\n" +
            "  UNIQUE INDEX `id_UNIQUE` (`id` ASC));";

    public static void main( String[] args ) {
        factory = new Configuration().configure().addAnnotatedClass(Directory.class)
                .addAnnotatedClass(File.class).buildSessionFactory();
        Session session = factory.openSession();
        Directory directory = new Directory();
        directory.setName("Programming/");
        directory.setParent("D:/");
        Transaction transaction = session.beginTransaction();
        session.save(directory);
        transaction.commit();
        session.close();
    }

}

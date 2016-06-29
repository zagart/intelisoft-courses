package by.grodno.zagart.java.intelisoft.Util;

import by.grodno.zagart.java.intelisoft.Entities.Actor;
import by.grodno.zagart.java.intelisoft.Entities.Film;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtil {

    private static SessionFactory factory = init();

    private HibernateUtil() {}

    public static Session getSession() { return factory.openSession(); }

    private static SessionFactory init() {
        ServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        Metadata metadata = new MetadataSources(standardRegistry)
                .addAnnotatedClass(Film.class)
                .addAnnotatedClass(Actor.class)
//                .addAnnotatedClass(Employee.class)
                .buildMetadata();
        return metadata.buildSessionFactory();
    }

    public static void closeFactory() { factory.close(); }

}

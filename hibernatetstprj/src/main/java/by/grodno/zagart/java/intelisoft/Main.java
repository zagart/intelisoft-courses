package by.grodno.zagart.java.intelisoft;

import by.grodno.zagart.java.intelisoft.Entities.Pet;
import by.grodno.zagart.java.intelisoft.Entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {

        User user = new User();
        user.setFirstName("artiom");
        user.setLastName("zagrebantsev");
        user.setAge(12);

        ServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        Metadata metadata = new MetadataSources(standardRegistry)
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Pet.class)
                .buildMetadata();

        SessionFactory factory = metadata.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        for (int i = 0; i < 10; i++) {
            user = new User();
            user.setFirstName("A" + i);
            user.setLastName("B" + i);
            user.setAge(i * 2);
            user.setPassword("qqwdsad");
            List<Pet> list = new ArrayList<Pet>();
            for (int j = 0; j < 5; j++) {
                Pet pet = new Pet();
                pet.setName("P" + j);
                pet.setOwner(user);
                session.save(pet);
                list.add(pet);
            }
            user.setPets(list);
            session.save(user);
        }

//        session.save(user);

        transaction.commit();


//        user = (User) session.get(User.class, 1L);
//        System.out.println(user.getAge());
//        Criteria criteria = session.createCriteria(User.class).add(Restrictions.ge("id", 5L));
//        List<User> list = criteria.list();
//        System.out.println(list);

        session.close();
    }
}

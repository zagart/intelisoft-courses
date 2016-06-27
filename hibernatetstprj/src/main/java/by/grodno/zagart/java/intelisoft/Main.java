package by.grodno.zagart.java.intelisoft;

import by.grodno.zagart.java.intelisoft.DAO.Util.HibernateUtil;
import by.grodno.zagart.java.intelisoft.Entities.Employee;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args ) {

        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        Employee superBoss = new Employee();
        session.save(superBoss);
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee();
            employee.setBoss(superBoss);
            employees.add(employee);
            List<Employee> employees1 = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                Employee employee1 = new Employee();
                employee.setBoss(employee);
                employees1.add(employee1);
                session.save(employee1);
            }
            session.save(employee);
        }
        superBoss.setEmployees(employees);
        session.saveOrUpdate(superBoss);

        transaction.commit();
        System.out.println("**********************************************************************");
        Criteria criteria = session.createCriteria(Employee.class).add(Restrictions.isNull("boss"));
        Employee boss = (Employee) criteria.uniqueResult();
        System.out.println("**********************************************************************");
        System.out.println(boss.getEmployees());
        session.close();
        HibernateUtil.closeFactory();
    }

}

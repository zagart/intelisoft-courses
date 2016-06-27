package by.grodno.zagart.java.intelisoft;

import by.grodno.zagart.java.intelisoft.DAO.Impl.EmployeeDaoImpl;
import by.grodno.zagart.java.intelisoft.Entities.Employee;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import java.util.Date;

public class Main {

    private static EmployeeDaoImpl dao = new EmployeeDaoImpl();

    public static void main( String[] args ) {
        Employee employee = new Employee();
        employee.setDate(new Date());
        dao.saveOrUpdate(employee);
        System.out.println(dao.getById(1L).getId());

        Criterion criterion = Restrictions.eq("id",1L);
        System.out.println(dao.getByCriteria(criterion));
    }

}

package by.grodno.zagart.java.intelisoft.DAO;

import by.grodno.zagart.java.intelisoft.Entities.Employee;
import org.hibernate.criterion.Criterion;
import java.util.List;


public interface EmployeeDao {

    Employee getById(Long id);
    List<Employee> getByCriteria(Criterion criterion);
    boolean saveOrUpdate(Employee employee);
    boolean delete(Long id);
    boolean delete(Employee employee);

}
